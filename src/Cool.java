import Abstracts.AirConditionerMode;

public class Cool extends AirConditionerMode 
{
	public Cool(ACThermostat thermostat,AirConditioner conditioner) 
	{
		super(thermostat,conditioner);
		this.tempDifference = -1; 
	}

	@Override
	public void changeMode(String mode) 
	{
		
	}
	public String toString()
	{
		return "cool";
	}
	
	protected void updateTempManager()
	{
		this.tempManager.decRoomTemp();
	}
}
