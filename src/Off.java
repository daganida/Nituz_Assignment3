import Interfaces.AirConditionerState;

public class Off implements AirConditionerState {

	public Off() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeMode(String mode) {
		//nothing to implemenent
		//cant change mode in Off State.
	}

	@Override
	public void setRoomTemperature(int temp) {}
	@Override
	public void setRemoteTemperature(int temp) {}
	@Override
	public void incRoomTemp() {}
	@Override
	public void decRoomTemp() {}
	@Override
	public void incRemoteTemp() {}
	@Override
	public void decRemoteTemp() {}
	

}
