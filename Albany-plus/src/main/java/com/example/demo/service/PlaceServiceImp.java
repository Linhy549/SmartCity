package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Place;
import com.example.demo.repository.PlaceRepo;

@Service
public class PlaceServiceImp implements PlaceService{
	@Autowired
	private PlaceRepo placeRepo;

	@Override
	public Place[] showAllPlace() {
		return placeRepo.showAllPlace();
	}

}
