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

	@Override
	public void incRemoteTemperature() {
		int remoteTemp = AirConditionerData.getCurrTemperatureInRemote();
		AirConditionerData.setCurrTemperatureInRemote(remoteTemp+1);
	}

	@Override
	public void decRemoteTemperature() {
		int remoteTemp = AirConditionerData.getCurrTemperatureInRemote();
		AirConditionerData.setCurrTemperatureInRemote(remoteTemp-1);
	}

}
