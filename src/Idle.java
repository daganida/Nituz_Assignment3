import Abstracts.ACMode;
import Interfaces.AirConditionerState;

public class Idle extends ACMode{

	String lastMode;
	
	public Idle(AirConditionerState onState ,String lastMode) 
	{
		super(onState);
		this.lastMode = lastMode;
	}
	
	@Override
	public void disableIdle()
	{
		onState.changeMode(lastMode);
	}
	
	@Override
	public boolean shouldIdle()
	{
		int roomTemp = AirConditionerData.getCurrTemperatureInRoom();
		int remoteTemp = AirConditionerData.getCurrTemperatureInRemote();
		
		boolean shouldIdle = ((lastMode == "heat") && roomTemp >= remoteTemp) || 
							((lastMode == "cool") && roomTemp <= remoteTemp);
		
		return shouldIdle;
	}
	@Override
	public String toString()
	{
		return "idle";
	}
}
