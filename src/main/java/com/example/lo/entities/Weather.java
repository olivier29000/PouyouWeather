package com.example.lo.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Weather {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String emplacement;
	private int temperature;
	private int humidite;
	private String date;

	public Weather(String emplacement, int temperature, int humidite) {
		super();
		this.emplacement = emplacement;
		this.temperature = temperature;
		this.humidite = humidite;
		LocalDateTime today = LocalDateTime.now();
		this.date = today.format(DateTimeFormatter.ofPattern("dd-MMM-yy HH:mm"));
		System.out.println(this.date);
	}
	
}
