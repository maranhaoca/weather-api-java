package com.weather.app.model;

public class CurrentWeatherResponse {
    private String weather;
    private String description;

    public CurrentWeatherResponse(String weather, String description) {
        this.weather = weather;
        this.description = description;
    }

    public String getWeather() {
        return weather;
    }

    public String getDescription() {
        return description;
    }
}
