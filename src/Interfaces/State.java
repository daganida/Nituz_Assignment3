package Interfaces;

public interface State {
	
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
	//increase room temperature
	public void incRoomTemp(int temp);
	//decrease room temperature
	public void decRoomTemp(int temp);

}
