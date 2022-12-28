package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movies {

	@Id
	@Column
	private String tconst;

	@Column(name = "titletype")
	private String titleType;

	@Column(name = "primarytitle")
	private String primaryTitle;

	@Column(name = "runtimeminutes")
	private String runtimeMinutes;

	@Column
	private String genres;
	
	@OneToOne
	private Ratings rating;

public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

public Movies(String tconst, String titleType, String primaryTitle, String runtimeMinutes, String genres,
			Ratings rating) {
		super();
		this.tconst = tconst;
		this.titleType = titleType;
		this.primaryTitle = primaryTitle;
		this.runtimeMinutes = runtimeMinutes;
		this.genres = genres;
		this.rating = rating;
	}

	public Ratings getRating() {
		return rating;
	}

	public void setRating(Ratings rating) {
		this.rating = rating;
	}

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public String getTitleType() {
		return titleType;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getPrimaryTitle() {
		return primaryTitle;
	}

	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	public String getRuntimeMinutes() {
		return runtimeMinutes;
	}

	public void setRuntimeMinutes(String data) {
		this.runtimeMinutes = data;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "Movies [tconst=" + tconst + ", titleType=" + titleType + ", primaryTitle=" + primaryTitle
				+ ", runtimeMinutes=" + runtimeMinutes + ", genres=" + genres + "]";
	}

}
