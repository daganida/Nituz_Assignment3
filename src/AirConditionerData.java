

public final class AirConditionerData {
	static int currTemperatureInRoom;
	static int currTemperatureInRemote;
	static boolean ans = false;
	private AirConditionerData() { 
		currTemperatureInRoom = 25;
		currTemperatureInRemote = 25;
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
			AirConditionerData ac = new AirConditionerData();
			ans = true;
		}
		
	
	}

}
