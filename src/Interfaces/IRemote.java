package Interfaces;

public interface IRemote extends Runnable{
	void setRemoteTemperature(int temp);
	void incRemoteTemperature();
	void decRemoteTemperature();
}
