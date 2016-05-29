package Interfaces;

public interface AirConditionerState {

	void changeMode(String mode);
	void setRoomTemperature(int temp);
	void setRemoteTemperature(int temp);
	void incRoomTemp();
	void decRoomTemp();
}
