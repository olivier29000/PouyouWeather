package com.example.lo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lo.entities.Weather;
import com.example.lo.repository.WeatherRepository;

@Service
public class WeatherService {

	@Autowired
	WeatherRepository weatherRepository;
	
	public Weather saveWeather(Weather weather) {
		return weatherRepository.save(weather);
	}
}
