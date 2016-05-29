import Interfaces.IRemote;

public class ACRemote implements IRemote {

	public ACRemote() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setRemoteTemperature(int temp) {
		AirConditionerData.setCurrTemperatureInRemote(temp);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


}
