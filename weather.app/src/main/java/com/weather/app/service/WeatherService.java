package com.weather.app.service;

import com.weather.app.model.CurrentWeather;
import com.weather.app.model.CurrentWeatherResponse;
import com.weather.app.model.Geocoding;
import com.weather.app.service.adapter.CurrentWeatherAdapter;
import com.weather.app.service.adapter.GeocodingAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    private GeocodingAdapter geocodingAdapter;

    @Autowired
    private CurrentWeatherAdapter currentWeatherAdapter;

    public CurrentWeatherResponse getCurrentWeatherBy(String city) {

        List<Geocoding> geocodingList = geocodingAdapter.getCoordinates(city, "6f70800cfc6e6b5ebadbdea80161e820");

        CurrentWeather currentWeather = currentWeatherAdapter.getCurrentWeather(geocodingList.get(0).getLat(), geocodingList.get(0).getLon(), "6f70800cfc6e6b5ebadbdea80161e820");

        return new CurrentWeatherResponse(currentWeather.getWeather().get(0).getMain(), currentWeather.getWeather().get(0).getDescription());
    }
}
