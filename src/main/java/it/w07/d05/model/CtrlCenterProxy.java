package it.w07.d05.model;

public class CtrlCenterProxy implements CtrlCenterInterface{
	
	private CtrlCenterInterface ctrlInterface;

	public CtrlCenterProxy () {
		ctrlInterface = CtrlCenterFactory.createCtrlCenter();
	}
	
	@Override
	public void checkForFire(SensorInfo sensorInfo) {

		ctrlInterface.checkForFire(sensorInfo);
	}

}