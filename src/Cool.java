import Abstracts.ACMode;
import Interfaces.AirConditionerState;

public class Cool extends ACMode{

	public Cool (AirConditionerState onState) { 
		super(onState);
	}

	@Override
	public String toString()
	{
		return "cool";
	}
	
	@Override
	public boolean shouldIdle()
	{
		int roomTemp = AirConditionerData.getCurrTemperatureInRoom();
		int remoteTemp = AirConditionerData.getCurrTemperatureInRemote();
		
		return roomTemp <= remoteTemp;
	}
	
	@Override
	public void invokeIdle()
	{
		onState.changeMode("idle");
	}
}
