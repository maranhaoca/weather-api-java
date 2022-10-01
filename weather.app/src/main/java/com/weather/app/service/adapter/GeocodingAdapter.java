package com.weather.app.service.adapter;


import com.weather.app.model.Geocoding;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "api.openweathermap.org/geo/1.0/direct", name = "geocoding")
public interface GeocodingAdapter {
    @GetMapping()
    List<Geocoding> getCoordinates(@RequestParam String q, @RequestParam String appid);
}
