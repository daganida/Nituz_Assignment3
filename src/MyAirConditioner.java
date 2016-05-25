import Interfaces.AirConditioner;
import Interfaces.State;

public class MyAirConditioner implements AirConditioner{
	
	State onOff;

	public MyAirConditioner(){
		onOff = new Off();
	}

	@Override
	public boolean on() {
		// TODO Auto-generated method stub
		if(onOff instanceof Off) { 
			onOff = new On();
			System.out.println("AirConditioner turned on!");
		}
		else if (onOff == null) {
			onOff = new On();
			System.out.println("AirConditioner turned on!");

			
		}
	     //meaning it is already on
		else { 
			System.out.println("AirConditioner already turned on!");
			
		}
		return true;
	}

	@Override
	public boolean off() {
		if(onOff instanceof On) { 
			onOff = new Off();
			System.out.println("AirConditioner turned off!");
		}
		else if (onOff == null) {
			onOff = new On();
			System.out.println("AirConditioner turned off!");

			
		}
	     //meaning it is already on
		else { 
			System.out.println("AirConditioner already turned off!");
			
		}
		return true;
		
	}

	@Override
	public void setMode(String mode) {
		if(onOff instanceof On)
		onOff.setMode(mode);
		else { 
			System.out.println("Unable to set mode! AirConditioner is off!");
		}
	}

	@Override
	public void setTemp(int temp) {
		// TODO Auto-generated method stub
		if(onOff instanceof On) { 
			AirConditionerData.setCurrTemperatureInRemote(temp);
			onOff.setTemp(temp);
		}
		else { 
			System.out.println("AC turned off! unable to set temperature!");
		}

	}

	@Override
	public void incTemp(int temp) {
		if(onOff instanceof On) { 
			AirConditionerData.setCurrTemperatureInRemote(AirConditionerData.getCurrTemperatureInRemote()+1);
			onOff.incTemp(temp);
		}
		else { 
			System.out.println("AC turned off! unable to increment temperature!");
		}
		
	}

	@Override
	public void decTemp(int temp) {
		if(onOff instanceof On) { 
			AirConditionerData.setCurrTemperatureInRemote(AirConditionerData.getCurrTemperatureInRemote()- 1);
			onOff.decTemp(temp);
		}
		else { 
			System.out.println("AC turned off! unable to increment temperature!");
		}
		
		
	}

	@Override
	public int getCurrTemp() {
		return AirConditionerData.getCurrTemperatureInRemote();
	}

	@Override
	public int getRoomTemp() {
		return AirConditionerData.getCurrTemperatureInRoom();
	}

	@Override
	public void incRoomTemp(int temp) {
		AirConditionerData.setCurrTemperatureInRoom(AirConditionerData.getCurrTemperatureInRoom()+ 1);

		
	}

	@Override
	public void decRoomTemp(int temp) {
		AirConditionerData.setCurrTemperatureInRoom(AirConditionerData.getCurrTemperatureInRoom()- 1);
		
	}
	
	
	
}

