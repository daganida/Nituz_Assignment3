import Interfaces.AirConditioner;
import Interfaces.AirConditionerState;

public class Idle implements AirConditionerState {
	AirConditioner context;

	public Idle(AirConditioner context) {
		// TODO Auto-generated constructor stub
		this.context = context;
	}

	@Override
	public void changeMode(String mode) {

	}

}
