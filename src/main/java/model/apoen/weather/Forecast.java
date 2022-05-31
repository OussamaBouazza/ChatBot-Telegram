package model.apoen.weather;

import java.util.List;

public class Forecast {
    private String city;
    private Main main;
    private List<Weather> weather;
    private Wind wind;

    public Forecast() {
    }

    public Main getMain() {
        return main;
    }



    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
