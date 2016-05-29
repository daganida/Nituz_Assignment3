package Abstracts;
import Interfaces.AirConditionerState;

public abstract class ACMode implements AirConditionerState{

	protected AirConditionerState onState;

	public ACMode(){}
	public ACMode(AirConditionerState onState)
	{
		this.onState = onState;
	}
	@Override
	public void changeMode(String mode) {}
	
	@Override
	public void setRoomTemperature(int temp) {}

	@Override
	public void setRemoteTemperature(int temp) {}

	@Override
	public void incRoomTemp() {}

	@Override
	public void decRoomTemp() {}
	
	public void invokeIdle()
	{
	}
	public void disableIdle()
	{}
	
	public abstract boolean shouldIdle();
}
