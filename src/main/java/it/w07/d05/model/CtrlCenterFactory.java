package it.w07.d05.model;

public class CtrlCenterFactory {
	
	public static CtrlCenterInterface createCtrlCenter() {
		return new CtrlCenter();
	}

}
