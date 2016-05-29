import Interfaces.AirConditioner;
import Interfaces.AirConditionerState;

public class IncorrectAirConditioner implements AirConditioner{
	
	AirConditionerState onOff;
	
	public IncorrectAirConditioner() { 
		onOff = new Off();
	}

	@Override
	public boolean on() {
		onOff = new On();
		return true;
	}

	@Override
	public boolean off() {
		onOff = new Off();
		return true;
	}

	@Override
	public void setMode(String mode) {
		onOff.changeMode(mode);	
	}

	@Override
	public void setTemp(int temp) {
		AirConditionerData.setCurrTemperatureInRemote(temp);		
	}

	@Override
	public void incTemp(int temp) {
		onOff.incRoomTemp();
	}

	@Override
	public void decTemp(int temp) {
		onOff.decRoomTemp();
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
		onOff.incRoomTemp();
	}

	@Override
	public void decRoomTemp(int temp) {
		onOff.decRoomTemp();		
	}
	public void setAirconditionSate(AirConditionerState newState) { 
		onOff = newState;
	}
}

