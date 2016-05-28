import Interfaces.AirConditioner;
import Interfaces.AirConditionerState;

public class Cool implements AirConditionerState {
	
	
	AirConditionerState idleCooling;
	AirConditioner context;
	


	public Cool(AirConditioner context) {
		// TODO Auto-generated constructor stub\
		idleCooling = new Cooling();
		this.context = context;

	}

	@Override
	public void changeMode(String mode) {

	}

}
