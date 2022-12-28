package com.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Ratings;
import com.app.repository.RatingsDAO;

@Service
public class RatingServices {

	@Autowired
	private RatingsDAO ratingsDao;

	@Autowired
	private ReaderR readerR;

	String line = "";

	public void SaveData() {
		List<Ratings> ratingList;
		ratingList = readerR.read();
		ratingsDao.saveAll(ratingList);

	}

	public List<Ratings> Showall() {
		// TODO Auto-generated method stub
		List<Ratings> l = new ArrayList<>();
		l = ratingsDao.findAll();

		// System.out.println(l);

		return ratingsDao.findAll();
	}

}