package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Place;

@Repository
public class PlaceRepo {
	private Place place;
	
	public Place[] showAllPlace() {
		Place[] places = new Place[5];
		
		//String name, String placeDes, int like, int dislike, double rate
		for(int i = 0; i < places.length; i++) {
			places[i] = new Place(randomString(5), randomString(10),
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
	
	public String randomString(int length) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		String strUpper = str.toUpperCase();
		str = str + strUpper;
		String res = "";
		for(int i = 1; i <= length; i++) {
			res = res +str.charAt(randomInt(0, str.length() -1));
		}
		return res;
	}
	

}
