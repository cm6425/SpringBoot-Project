package com.nitya.covidtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidTrackerApp {

	public static void main(String[] args) {
		SpringApplication.run(CovidTrackerApp.class, args);
	}

}
