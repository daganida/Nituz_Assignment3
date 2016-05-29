

public class AirConditionerData 
{
	private static AirConditionerData instance = null;

	protected int currTemperatureInRoom;
	protected int currTemperatureInRemote;
	protected String currentMode;
	protected boolean ans = false;
	
	protected AirConditionerData() {
		currTemperatureInRoom = 25;
		currTemperatureInRemote = 25;
		currentMode = "";
	}
	
	public static AirConditionerData sharedInstance() {
		if(instance == null) 
		{
			instance = new AirConditionerData();
		}
		return instance;
	}
	public static int getCurrTemperatureInRoom() {
		return sharedInstance().currTemperatureInRoom;
	}
	public static int getCurrTemperatureInRemote() { 
		return sharedInstance().currTemperatureInRemote;
	}
	public static void setCurrTemperatureInRoom(int temp) { 
		sharedInstance().currTemperatureInRoom = temp;
	}
	public static void setCurrTemperatureInRemote(int temp) { 
		sharedInstance().currTemperatureInRemote = temp;
	}
	public static void setCurrMode(String mode) { 
		sharedInstance().currentMode = mode;
	}
	public static String getCurrentMode() { 
		return sharedInstance().currentMode;
	}

}
