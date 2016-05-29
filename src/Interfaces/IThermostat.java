package Interfaces;

import Abstracts.ACMode;

public interface IThermostat extends Runnable 
{
	void incRoomTemperature();
	void decRoomTemperature();
	void setACMode(ACMode mode);
}
