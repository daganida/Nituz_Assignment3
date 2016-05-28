import Interfaces.AirConditioner;
import Interfaces.AirConditionerState;

public class Heat  implements AirConditionerState {
	
	
	AirConditionerState idleHeating;
	
	public Heat () { 
		idleHeating = new Heating();
	}

	public Heat(AirConditioner context) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeMode(String mode) {
		// TODO Auto-generated method stub
		
	}

}
