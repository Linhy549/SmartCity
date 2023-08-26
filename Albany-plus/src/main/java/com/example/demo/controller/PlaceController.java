package com.example.demo.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.Forbidden;

import com.example.demo.model.Place;
import com.example.demo.service.PlaceService;
import com.example.demo.service.PlaceServiceImp;

@RestController
public class PlaceController {

	@Autowired
	private PlaceService placeService;

	@RequestMapping("/place")
	public String showPlace() {
		return placeService.showAllPlace();

	}

}
