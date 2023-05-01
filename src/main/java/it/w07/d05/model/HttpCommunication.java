package it.w07.d05.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpCommunication extends HttpCommunicationChannel {
	private static final Logger logger = LoggerFactory.getLogger(HttpCommunication.class);
	private String baseurlnotification;

	public HttpCommunication(String baseurlnotification) {

		this.baseurlnotification = baseurlnotification;
	}

	public void sendGet(Long sensorId, double lat, double lon, int smokeLevel) {
		logger.info("Allarme sonda:{} - lat: {} lon: {} - Livello fumo: {}", sensorId, lat, lon, smokeLevel);

		String url = baseurlnotification + "?sensorid=" + sensorId + "&lat=" + lat + "&lon" + lon + "&smokelevel="
				+ smokeLevel;
		logger.info("Call: {}", url);
	}

}
