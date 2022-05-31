package fr.ensim.interop.introrest.client;

import model.apoen.weather.Forecast;
import org.springframework.web.client.RestTemplate;

public class ClientRestTest {
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();

//		Forecast f = restTemplate.getForObject("http://localhost:9090/weather?city=Paris", Forecast.class);
//		System.out.println(f);
	}
}
