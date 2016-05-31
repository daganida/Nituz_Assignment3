import Abstracts.ACMode;
import Interfaces.AirConditionerState;
import Interfaces.IRemote;
import Interfaces.IThermostat;

public class On implements AirConditionerState {

	Thread			threadThermostat;
	Thread			threadRemote;
	
	
	protected ACMode				mode;
	IThermostat			thermostat;
	IRemote				remote;
	
	public On() { 
		thermostat = new ACThermostat(mode);
		remote = new ACRemote();
		changeMode("cool");
		startThreads();
		
	}

	private void startThreads()
	{
		threadThermostat = new Thread(thermostat);
		threadRemote = new Thread(remote);
		
		threadRemote.start();
		threadThermostat.start();
	}
	
	@Override
	public void changeMode(String modeName) 
	{
		if (mode!=null)
		{
			System.out.println("exit ["+mode.toString()+"] state.");
			System.out.println("enter ["+modeName+"] state.");
		}
		switch(modeName.toLowerCase())
		{
		case "heat":
			mode = new Heat(this);
			break;
		case "cool":
			mode = new Cool(this);
			break;
		case "idle":
			ACMode lastMode = mode;
			String lastModeName = lastMode!=null ? lastMode.toString() : null;
			mode = new Idle(this, lastModeName);
			break;
		}
		thermostat.setACMode(mode);
	}

	@Override
	public void setRoomTemperature(int temp) {
		AirConditionerData.setCurrTemperatureInRoom(temp);
	}

	@Override
	public void setRemoteTemperature(int temp) {
		remote.setRemoteTemperature(temp);
	}

	@Override
	public void incRoomTemp() 
	{
		thermostat.incRoomTemperature();
	}

	@Override
	public void decRoomTemp() {
		thermostat.decRoomTemperature();
	}

	@Override
	public void incRemoteTemp() {
		remote.incRemoteTemperature();
	}

	@Override
	public void decRemoteTemp() {
		remote.decRemoteTemperature();
	}
}
