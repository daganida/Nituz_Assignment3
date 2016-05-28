import Interfaces.AirConditioning;
import Interfaces.IClimateManager;

public class ACThermostat implements IClimateManager
{
	private AirConditioning delegate;
	private int 			roomTemperature;
	private Thread			tempThread;
	
	public ACThermostat(AirConditioning delegate) 
	{
		this.delegate = delegate;
		roomTemperature = 25;
	}
	public void startThermostat()
	{
		tempThread.start();
	}
	public int getRoomTemp() 
	{
		return roomTemperature;
	}
	public void incRoomTemp() 
	{
		roomTemperature++;
	}
	public void decRoomTemp() 
	{
		roomTemperature--;
	}
}
