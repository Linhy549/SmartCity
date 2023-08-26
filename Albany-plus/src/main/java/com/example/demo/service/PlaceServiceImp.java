package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Place;
import com.example.demo.repository.PlaceRepo;
import org.json.JSONObject;

@Service
public class PlaceServiceImp implements PlaceService{
	
	@Autowired
	private PlaceRepo placeRepo;

	@Override
	public String showAllPlace() {

		Place[] places =  placeRepo.showAllPlace();
		String str = "";
		for(Place temp: places) {
			str = str + temp.toString();
		}
//		JSONObject[] jObjects = new JSONObject[places.length];
//		for(int i = 0; i < places.length;i++) {
//			jObjects[i] = jsonProcessing(places[i]);
//			System.out.print("\n" + jObjects[i].toString());
//		}
		return str;
	}
	
	public JSONObject jsonProcessing(Place place) {
		return new JSONObject(place);
	}

}
