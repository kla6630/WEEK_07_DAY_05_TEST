package it.w07.d05.model;

public class SensorCtrl implements Observer {

	private final Long id;

	private CtrlCenterInterface ctrlCenter;

	public SensorCtrl(Long id, CtrlCenterInterface ctrlCenter) {
		this.id = id;
		this.ctrlCenter = ctrlCenter;
	}

	private SensorInfo createSensorInfo(Sensor sensor) {
		return new SensorInfo(sensor.getId(), sensor.getLat(), sensor.getLon(), sensor.getSmokeLevel());
	}

	@Override
	public void update(Subject sensor) {
		SensorInfo info = createSensorInfo((Sensor) sensor);
		ctrlCenter.checkForFire(info);
	}

	public Long getId() {
		return id;
	}

}