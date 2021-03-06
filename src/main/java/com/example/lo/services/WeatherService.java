package com.example.lo.services;

import java.util.List;

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

	public List<Weather> getAllWeather() {
		// TODO Auto-generated method stub
		return weatherRepository.findAll();
	}
}
