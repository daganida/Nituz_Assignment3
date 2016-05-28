import Interfaces.AirConditioning;

public class ACRemote 
{
	private int 			currTemperature;
	private String 			currentMode;
	private AirConditioning ac;

	public ACRemote() 
	{ 
		currTemperature = 25;
		currentMode = "idle";
		ac = new AirConditioner();
	}
	
	public int getCurrTemperatureInRemote() 
	{ 
		return currTemperature;
	}
	public void setCurrTemperatureInRemote(int temp) 
	{ 
		currTemperature = temp;
	}
	public void changeMode(String mode) 
	{ 
		ac.setMode(mode);
	}
	public String getCurrentMode() 
	{ 
		return currentMode;
	}

}
