import Abstracts.AirConditionerState;

public class On extends AirConditionerState {
	
	public On(AirConditioner myAirConditioner) {
		super(myAirConditioner);
	}

	@Override
	public void changeMode(String modeName) 
	{
		this.delegate.off();	
	}
	public String toString()
	{
		return "on";
	}
}
