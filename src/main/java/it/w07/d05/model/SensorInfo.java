package it.w07.d05.model;

import lombok.Data;

@Data
public class SensorInfo {
	private final Long id;
	private final double lat;
	private final double lon;
	private final int smokeLevel;

}