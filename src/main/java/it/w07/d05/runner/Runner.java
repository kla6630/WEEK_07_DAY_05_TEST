package it.w07.d05.runner;

import it.w07.d05.model.CtrlCenterProxy;
import it.w07.d05.model.Sensor;
import it.w07.d05.model.SensorCtrl;

public class Runner {

	private static CtrlCenterProxy ctrl1;
	private static CtrlCenterProxy ctrl2;

	private static SensorCtrl sensorCtrl1;
	private static SensorCtrl sensorCtrl2;

	public static void main(String[] args) {

		Sensor s1 = new Sensor(01l, 950.7, 125.4);
		Sensor s2 = new Sensor(02l, 950.7, 125.6);
		s1.setSmokeLvl(4);
		s2.setSmokeLvl(0);

		ctrl1 = new CtrlCenterProxy();
		ctrl2 = new CtrlCenterProxy();
		sensorCtrl1 = new SensorCtrl(1l, ctrl1);
		sensorCtrl2 = new SensorCtrl(2l, ctrl2);

		s1.addObserver(sensorCtrl1);
		s2.addObserver(sensorCtrl2);

		if (s1.getSmokeLevel() > s1.smokeLimit) {
			System.out.println("Attenzione, incendio rilevato dal sensore numero 1");
			sensorCtrl1.update(s1);
		} else if (s2.getSmokeLevel() > s2.smokeLimit) {
			System.out.println("Attenzione, incendio rilevato dal sensore numero 2");
			sensorCtrl1.update(s2);
		}

	}

}