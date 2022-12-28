package com.app.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.app.entities.Ratings;

@Component
public class ReaderR {

	public List<Ratings> read() {
		List r = new ArrayList();
		try {
			String line = "";
			BufferedReader ra = new BufferedReader(new FileReader("src/main/resources/ratings.csv"));

			ra.readLine();
			while ((line = ra.readLine()) != null) {
				String[] data = line.split(",");
				Ratings u = new Ratings();
				u.setTconst(data[0]);
				u.setAverageRating(data[1]);
				u.setNumVotes(data[2]);

				r.add(u);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
}
