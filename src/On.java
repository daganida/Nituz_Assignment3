import Interfaces.AirConditioner;
import Interfaces.AirConditionerState;

public class On implements AirConditionerState {
	
	AirConditionerState mode;
	AirConditioner context;
	
	
	public On() { 
		mode = new Cool(context);
	}

	public On(MyAirConditioner myAirConditioner) {
		context = myAirConditioner;
	}

	@Override
	public void changeMode(String modeName) {
		if(modeName.toLowerCase().equals("heat")) { 
			mode = new Heat(context);
		}
		if(modeName.toLowerCase().equals("idle")) { 
			mode = new Idle(context);
		}	
	}

}
