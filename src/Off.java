import Interfaces.AirConditioner;
import Interfaces.AirConditionerState;

public class Off implements AirConditionerState {
	AirConditioner context;

	public Off(MyAirConditioner myAirConditioner) {
		// TODO Auto-generated constructor stub
		this.context = myAirConditioner;
	}

	@Override
	public void changeMode(String mode) {
		//nothing to implemenent
		//cant change mode in Off State.
		
	}

	

}
