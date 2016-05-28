package Abstracts;
import Interfaces.AirConditioning;
import Interfaces.IClimateManager;

public abstract class AirConditionerMode extends AirConditionerState
{
	protected IClimateManager 	tempManager;
	protected int				tempDifference;
	private Thread 				tempUpdateThread;
	
	public AirConditionerMode(IClimateManager tempManager,AirConditioning airConditioner)
	{
		super(airConditioner);
		this.tempManager = tempManager;
	}
	
	protected void startUpdatingThermostat()
	{
		tempUpdateThread = new Thread() {
		    @Override
		    public void run() 
		    {
		        while(true) 
		        {
		            try 
		            {
		            	updateTempManager();
		            	Thread.sleep(1000); 
		            } catch (InterruptedException ie) {}
		        }
		    }
		};
	}
	
	protected abstract void updateTempManager();
}
