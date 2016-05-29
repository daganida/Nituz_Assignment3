import Abstracts.ACMode;
import Interfaces.AirConditionerState;

public class Heat extends ACMode{
		
	
	public Heat (AirConditionerState onState) { 
		super(onState);
	}

	@Override
	public String toString()
	{
		return "heat";
	}
	
	@Override
	public boolean shouldIdle()
	{
		int roomTemp = AirConditionerData.getCurrTemperatureInRoom();
		int remoteTemp = AirConditionerData.getCurrTemperatureInRemote();
		
		return roomTemp >= remoteTemp;
	}
	
	@Override
	public void invokeIdle()
	{
		onState.changeMode("idle");
	}
}
