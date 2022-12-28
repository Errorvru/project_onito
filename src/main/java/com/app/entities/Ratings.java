package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ratings")
public class Ratings {
	@Id
	@Column
	private String tconst;
	@Column(name = "averagerating")
	private String averageRating;
	@Column(name = "numvotes")
	private String numVotes;

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public String getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(String data) {
		this.averageRating = data;
	}

	public String getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(String data) {
		this.numVotes = data;
	}

	@Override
	public String toString() {
		return "ratings [tconst=" + tconst + ", averageRating=" + averageRating + ", numVotes=" + numVotes + "]";
	}

	public Ratings(String tconst, String averageRating, String numVotes) {
		super();
		this.tconst = tconst;
		this.averageRating = averageRating;
		this.numVotes = numVotes;
	}

	public Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}

}