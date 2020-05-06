package com.example.lo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lo.entities.Emplacement;
import com.example.lo.entities.Weather;
import com.example.lo.services.WeatherService;

@RestController
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;
	
	@GetMapping("/weather")
	public Weather giveWeather(@RequestParam  Integer temperature, Integer humidite, String emplacement) {
		
		
		return weatherService.saveWeather(new Weather(emplacement,temperature,humidite));
		
	}

}
