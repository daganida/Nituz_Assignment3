import Interfaces.State;

public class Cool implements State {
	State idleCooling;
	
	public Cool() { 
		idleCooling = new Cooling();
	}

	@Override
	public boolean on() {
		return true;
	}

	@Override
	public boolean off() {
		return true;
	
	}

	@Override
	public void setMode(String mode) {
		if(mode.equals("idle") && idleCooling instanceof Cool) { 
			idleCooling = new Idle();
			
		}
        if(mode.equals("cooling") && idleCooling instanceof Idle) { 
			idleCooling = new Cooling();
		}
	
	}

	@Override
	public void setTemp(int temp) {
		
		
	}

	@Override
	public void incTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incRoomTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decRoomTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

}
