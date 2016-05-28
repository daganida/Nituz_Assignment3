

public class ACRemote 
{
	int 	currTemperature;
	String 	currentMode;

	public ACRemote() 
	{ 
		currTemperature = 25;
		currentMode = "idle";
	}
	
	public static int getCurrTemperatureInRoom() { 
		check();
		return currTemperatureInRoom;
	}
	public static int getCurrTemperatureInRemote() { 
		check();
		return currTemperatureInRemote;
	}
	public static void setCurrTemperatureInRoom(int temp) { 
		check();
		currTemperatureInRoom = temp;
	}
	public static void setCurrTemperatureInRemote(int temp) { 
		check();
		currTemperatureInRemote = temp;
	}
	public static void check() {
		if (ans == false) { 
			ACRemote ac = new ACRemote();
			ans = true;
		}
	}
	public static void setCurrMode(String mode) { 
		currentMode = mode;
	}
	public static String getCurrentMode() { 
		return currentMode;
	}

}
