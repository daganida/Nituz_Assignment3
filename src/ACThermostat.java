import Abstracts.ACMode;
import Interfaces.IThermostat;

public class ACThermostat implements IThermostat {
	
	ACMode mode;
	
	public ACThermostat(ACMode mode) 
	{
		this.mode = mode;
	}
	
	@Override
	public void incRoomTemperature() {
		int temp = AirConditionerData.getCurrTemperatureInRoom() + 1;
		AirConditionerData.setCurrTemperatureInRoom(temp);
	}

	@Override
	public void decRoomTemperature() {
		int temp = AirConditionerData.getCurrTemperatureInRoom() - 1;
		AirConditionerData.setCurrTemperatureInRoom(temp);
	}

	@Override
	public void run() {
		
		while(true)
		{
			// Checking for need of idle
			
			boolean shouldIdle = mode.shouldIdle();
			
			if (shouldIdle)
			{
				mode.invokeIdle();
			}
			else
			{
				mode.disableIdle();
			}
		}
	}

	@Override
	public void setACMode(ACMode mode) {
			this.mode = mode;
	}
}
