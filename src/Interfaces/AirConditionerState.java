package Interfaces;

public interface AirConditionerState {

	void changeMode(String mode);
	void setRoomTemperature(int temp);
	void setRemoteTemperature(int temp);
	void incRemoteTemp();
	void decRemoteTemp();
	void incRoomTemp();
	void decRoomTemp();
}
