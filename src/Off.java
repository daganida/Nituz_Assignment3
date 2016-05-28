
import Abstracts.AirConditionerState;

public class Off extends AirConditionerState 
{
	public Off(AirConditioner myAirConditioner) {
		super(myAirConditioner);
	}

	@Override
	public void changeMode(String mode) 
	{
		this.delegate.on();
	}

	public String toString()
	{
		return "off";
	}

}
