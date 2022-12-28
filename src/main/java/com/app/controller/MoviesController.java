package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Movies;
import com.app.repository.MoviesDAO;
import com.app.services.MoviesServices;

@RestController
public class MoviesController {
	@Autowired
	private MoviesServices us;
	@Autowired
	private MoviesDAO moviesdao;

	@RequestMapping("/saveMovies")
	public String setData() {
		us.SaveData();
		return "Data fetched";
	}

	@GetMapping("/showMovies")
	public List<Movies> show() {
		return us.Showall();
	}

	@GetMapping("/api/v1/longest-duration-movies")
	public List<Movies> show1() {
		return moviesdao.findForDuration();
	}

	@PostMapping("/api/v1/new-movie")
	public String createCoffee(@RequestBody Movies movies) {
		moviesdao.save(movies);
		return "succesfull";
	}

	// ------------------------------------------------
	@GetMapping("/api/v1/top-rated-movies")
	public List<Movies> show2() {
		return moviesdao.avgRating();
	}
}