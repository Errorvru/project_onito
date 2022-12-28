package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Ratings;
import com.app.services.RatingServices;

@RestController
public class RatingsController {
	@Autowired
	private RatingServices us;
	@Autowired
//	private RatingsDAO ratingsdao;
	@RequestMapping("/saveRatings")
	public String setData() {
		us.SaveData();
		return "Data fetched";
	}

	@GetMapping("/showRatings")
	public List<Ratings> show() {
		return us.Showall();
	}
//	@GetMapping("/api/v1/top-rated-movies")
//	public List<Ratings> show2() {
//		return ratingsdao.avgRating();
//	}
}