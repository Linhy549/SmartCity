package com.example.demo.repository;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException.Forbidden;

import com.example.demo.model.Place;

@Repository
public class PlaceRepo {

	private String[] placeName = {"New York State Museum", "New York State Capitol", 
			"Albany Institute of History & Art", "Washington Park", "The Egg", "Palace Theatre"};
	private String[] placeDesLiSt = {"Des1", "Des2", "Des3", "Des4", "Des5", "Des6", "Des7"};


	public Place[] showAllPlace() {
		Place[] places = new Place[6];
		for(int i = 0; i < places.length; i++) {
			places[i] = new Place(placeName[i], placeDesLiSt[i],
					randomInt(0, 20), randomInt(0, 20), randomDouble(0, 5));
		}
		return places;
	}
	
	
	public int randomInt(int first, int last) {
		return first + (int)(Math.random() * (last - first + 1));
	}
	
	public double randomDouble(int first, int last) {
		return (Math.random() * (last - first));
	}

}
