package com.weather.app.controller;

import com.weather.app.model.CurrentWeatherResponse;
import com.weather.app.service.WeatherService;
import com.weather.app.service.adapter.CurrentWeatherAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public ResponseEntity<CurrentWeatherResponse> getCurrentWeather(@RequestParam String city) {
        CurrentWeatherResponse currentWeatherResponse = weatherService.getCurrentWeatherBy(city);
        return ResponseEntity.ok().body(currentWeatherResponse);
    }
}
