package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Place;
import com.example.demo.service.PlaceService;

@RestController
public class PlaceController {

	@Autowired
	private PlaceService placeService;
	/*
	 * Get HTTP request, parse the params
	 * call service layer
	 */
	@RequestMapping("/place")
	public void showPlace() {
		Place [] places = placeService.showAllPlace();
		for(Place p: places) {
			System.out.println(p.toString() + "\n");
		}
	}

}
