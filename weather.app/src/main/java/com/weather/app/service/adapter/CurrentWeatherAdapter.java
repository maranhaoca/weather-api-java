package com.weather.app.service.adapter;

import com.weather.app.model.CurrentWeather;
import com.weather.app.model.Geocoding;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url="api.openweathermap.org/data/2.5/weather", name = "weather")
public interface CurrentWeatherAdapter {

    @GetMapping
    CurrentWeather getCurrentWeather(@RequestParam double lat, @RequestParam double lon, @RequestParam String appid);
}
