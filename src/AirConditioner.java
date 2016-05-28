import Abstracts.AirConditionerMode;
import Abstracts.AirConditionerState;
import Interfaces.AirConditioning;

public class AirConditioner implements AirConditioning
{
	AirConditionerState currentState;
	AirConditionerMode	currentMode;
	
	ACThermostat		thermostat;
	ACRemote			remote;
	
	public AirConditioner() { 
		currentState = new Off(this);
		thermostat = new ACThermostat(this);
	}

	@Override
	public boolean on() 
	{
		currentState = new On(this);
		currentMode = new Idle(thermostat,this);
		return true;
	}

	@Override
	public boolean off() 
	{
		currentState = new Off(this);
		currentMode = null;
		return true;
	}

	@Override
	public void setMode(String mode) 
	{
		
	}

	@Override
	public void setTemp(int temp) 
	{
		remote.setCurrTemperatureInRemote(temp);		
	}

	@Override
	public void incTemp(int temp) 
	{
		
	}

	@Override
	public void decTemp(int temp) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCurrTemp() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRoomTemp() 
	{
		return thermostat.getRoomTemp();
	}

	@Override
	public String getMode() 
	{
		return this.currentMode.toString();
	}	
}

