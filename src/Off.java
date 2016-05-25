import Interfaces.State;

public class Off implements State {

	@Override
	public boolean on() {
		return false;

	}

	@Override
	public boolean off() {
		return false;

	}

	@Override
	public void setMode(String mode) {
		
	}

	@Override
	public void setTemp(int temp) {
		
	}

	@Override
	public void incTemp(int temp) {

		
	}

	@Override
	public void decTemp(int temp) {

		
	}

	@Override
	public void incRoomTemp(int temp) {

		
	}

	@Override
	public void decRoomTemp(int temp) {
		
	}

}
