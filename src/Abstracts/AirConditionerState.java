package Abstracts;
import Interfaces.AirConditioning;
import Interfaces.ChangeableAirConditionerState;

public abstract class AirConditionerState implements ChangeableAirConditionerState
{
	protected AirConditioning delegate;
	public AirConditionerState(AirConditioning delegate)
	{
		this.delegate = delegate;
	}
	
}
