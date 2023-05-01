package it.w07.d05.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sensor extends Subject{
	
	private Long id;
	private double lat;
	private double lon;
	private int smokeLevel;
	
	public final int smokeLimit = 3;

	public Sensor(Long id, double lat, double lon) {
		super();
		this.id = id;
		this.lat = lat;
		this.lon = lon;
		this.smokeLevel = 0;
	}
	
	public int getSmokeLevel() {
		return smokeLevel;
	}
	
	public void setSmokeLvl(int smokeLevel) {
		this.smokeLevel = smokeLevel;
		
		if (smokeLevel >= smokeLimit) {
			super.alertObservers();
		}
	}

}
