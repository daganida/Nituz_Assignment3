import Interfaces.AirConditioner;
import Interfaces.AirConditionerState;

public class IncorrectAirConditioner implements AirConditioner{
	
	AirConditionerState on;
	AirConditionerState off;
	
	AirConditionerState activeState;
	
	public IncorrectAirConditioner() {
		off = new Off();
		activeState = off;
	}

	@Override
	public boolean on() {
		if (on == null)
		{
			on = new On();
		}
		activeState = on;
		return true;
	}

	@Override
	public boolean off() {
		activeState = off;
		return true;
	}

	@Override
	public void setMode(String mode) {
		activeState.changeMode(mode);	
	}

	@Override
	public void setTemp(int temp) {
		AirConditionerData.setCurrTemperatureInRemote(temp);		
	}

	@Override
	public void incTemp(int temp) {
		activeState.incRoomTemp();
	}

	@Override
	public void decTemp(int temp) {
		activeState.decRoomTemp();
	}

	@Override
	public int getCurrTemp() {
		return AirConditionerData.getCurrTemperatureInRemote();
	}

	@Override
	public int getRoomTemp() {
		return AirConditionerData.getCurrTemperatureInRoom();
	}

	@Override
	public void incRoomTemp(int temp) {
		activeState.incRoomTemp();
	}

	@Override
	public void decRoomTemp(int temp) {
		activeState.decRoomTemp();		
	}
	public void setAirconditionSate(AirConditionerState newState) { 
		activeState = newState;
	}
}

