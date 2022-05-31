package fr.ensim.interop.introrest.controller;

import model.apoen.weather.Forecast;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherRestController {
    @Value("${open.weather.api.url}")
    private String apiUrl;

    @Value("${open.weather.api.token}")
    private String apiToken;

    RestTemplate restTemplate =new RestTemplate();

    /**
     * Retourne la météo d'une ville donnée en utilisant l'api OpenWeather
     * @param city la ville demandée
     * @return Forecast
     * */
    @GetMapping("/weather")
    public ResponseEntity<Forecast> getWeatherForecast(@RequestParam("city") String city){
        final String query = apiUrl + "weather?q=" + city +"&appid="+ apiToken +"&units=metric";
        Forecast forecast = restTemplate.getForObject(query, Forecast.class);

        forecast.setCity(city);
        return ResponseEntity.ok().body(forecast);
    }

}
