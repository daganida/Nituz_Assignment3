import Interfaces.AirConditioner;
import Interfaces.AirConditionerState;

public class MyAirConditioner implements AirConditioner{
	
	AirConditionerState onOff;
	
	public MyAirConditioner() { 
		onOff = new Off(this);
		
	}

	@Override
	public boolean on() {
		onOff = new On(this);
		return true;
	}

	@Override
	public boolean off() {
		onOff = new Off(this);
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
		
	}

	@Override
	public void decTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCurrTemp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRoomTemp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void incRoomTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decRoomTemp(int temp) {
		// TODO Auto-generated method stub
		
	}
	public void setAirconditionSate(AirConditionerState newState) { 
		onOff = newState;
	}
	
	

	

	
	
	
}

