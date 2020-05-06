package com.example.lo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lo.entities.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Integer>{

}
