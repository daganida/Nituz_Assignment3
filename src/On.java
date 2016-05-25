import Interfaces.State;

public class On implements State {
	State mode;
	
	public On() { 
		mode = new Idle();
	}

	@Override
	public boolean on() {
		return true;
	}

	@Override
	public boolean off() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setMode(String modeType) {
		modeType = modeType.toLowerCase();
		if(modeType.equals("cool") && mode instanceof Cool) { 
			System.out.println("Cool mode is already active!");
		}
		else if(modeType.equals("heat")&& mode instanceof Heat) { 
			System.out.println("Heat mode is already active!");
		}
		else if(modeType.equals("idle")&& mode instanceof Idle) { 
			System.out.println("Idle mode is already active!");
		}
		else { 
			if(modeType.equals("cool")) { 
				mode = new Cool();
				System.out.println("Cool mode is now active!");				
			}
			else if(modeType.equals("heat")) { 
				mode = new Heat();
				System.out.println("Heat mode is now active!");		
			}
			else if(modeType.equals("idle")) { 
				mode = new Idle();
				System.out.println("Idle mode is now active!");				
			}
			else { 
				System.out.println("invalid mode!");
			}
		}
		
		
	}


	@Override
	public void setTemp(int temp) {
		mode.setTemp(temp);
		
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
