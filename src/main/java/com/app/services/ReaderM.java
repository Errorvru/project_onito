package com.app.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.app.entities.Movies;

@Component
public class ReaderM {

	public List<Movies> read() {
		List m = new ArrayList();
		try {
			String line = "";
			BufferedReader mv = new BufferedReader(new FileReader("src/main/resources/movies.csv"));
			mv.readLine();
			while ((line = mv.readLine()) != null) {
				String[] data = line.split(",");
				Movies u = new Movies();
				u.setTconst(data[0]);
				u.setTitleType(data[1]);
				u.setPrimaryTitle(data[2]);
				u.setRuntimeMinutes(data[3]);
				u.setGenres(data[4]);
				m.add(u);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
}
