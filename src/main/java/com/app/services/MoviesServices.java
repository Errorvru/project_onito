package com.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Movies;
import com.app.repository.MoviesDAO;

@Service
public class MoviesServices {

	@Autowired
	private MoviesDAO moviesDao;

	@Autowired
	private ReaderM readerM;

	String line = "";

	public void SaveData() {
		List<Movies> MoviesList;
		MoviesList = readerM.read();
		moviesDao.saveAll(MoviesList);
	}

	public List<Movies> Showall() {
		List<Movies> l = new ArrayList<>();
		l = moviesDao.findAll();
		return moviesDao.findAll();
	}
}
