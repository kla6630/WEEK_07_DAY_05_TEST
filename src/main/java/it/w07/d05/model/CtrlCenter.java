package it.w07.d05.model;

public class CtrlCenter implements CtrlCenterInterface {

	private HttpCommunication httpcomm;

	public CtrlCenter() {
		this.httpcomm = new HttpCommunication(toString());
	}

	@Override
	public void checkForFire(SensorInfo sensorInfo) {
		httpcomm.sendInfo(sensorInfo.getId(), sensorInfo.getLat(), sensorInfo.getLon(), sensorInfo.getSmokeLevel());
	}

}
