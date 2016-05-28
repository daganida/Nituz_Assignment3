import Abstracts.AirConditionerMode;

public class Heat  extends AirConditionerMode 
{
	public Heat(ACThermostat thermostat,AirConditioner conditioner) 
	{
		super(thermostat,conditioner);
		this.tempDifference = 1; 
	}

	@Override
	public void changeMode(String mode) {
		// TODO Auto-generated method stub
		
	}
	public String toString()
	{
		return "heat";
	}
	
	protected void updateTempManager()
	{
		this.tempManager.incRoomTemp();
	}
}
