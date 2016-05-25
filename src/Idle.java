import Interfaces.State;

public class Idle implements State {

	@Override
	public boolean on() {
		return true;
	}

	@Override
	public boolean off() {
		return true;
	}

	@Override
	public void setMode(String mode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incRoomTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decRoomTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

}
