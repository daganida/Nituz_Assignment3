import Abstracts.AirConditionerMode;
import Abstracts.AirConditionerState;
import Interfaces.AirConditioning;

public class Idle extends AirConditionerMode
{
	String lastMode;
	
	public Idle(ACThermostat thermostat,AirConditioner conditioner) 
	{
		super(thermostat,conditioner);
		lastMode = conditioner.getMode();
		this.tempDifference = 1;
	}

	@Override
	public void changeMode(String mode) 
	{
		
	}
	public String toString()
	{
		return "idle";
	}
	
	protected void updateTempManager()
	{
		this.tempManager.incRoomTemp();
	}
}
