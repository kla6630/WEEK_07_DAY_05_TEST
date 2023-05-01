package it.w07.d05.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class HttpCommunicationChannel {

	private static final Logger logger = LoggerFactory.getLogger(HttpCommunicationChannel.class);

	public void sendInfo(Long id, double lat, double lon, int smokeLevel) {
		logger.info("La sonda " + id + " rileva un livello di fumo pari a: " + smokeLevel + " Coordinate: [" + lat + ","
				+ lon + "]");
	}

}
