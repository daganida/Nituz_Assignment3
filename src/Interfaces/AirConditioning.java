package Interfaces;

public interface AirConditioning 
{

	//Turn on air conditioner
		public boolean on();
		//Turn off air conditioner	
		public boolean off();
		//Set air conditioner Mode - Hot/Cold
		public void setMode(String mode);
		//Set air conditioner temperature
		public void setTemp(int temp);
		//increase air conditioner temperature
		public void incTemp(int temp);
		//decrease air conditioner temperature
		public void decTemp(int temp);
		//get current air conditioner temperature
		public int getCurrTemp();
		//get current room temperature
		public int getRoomTemp();
		//get current mode
		public String getMode();
}
