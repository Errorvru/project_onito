package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.app.entities.Movies;

@Repository
public interface MoviesDAO extends JpaRepository<Movies, Integer> {
	@Query(value = "select * from movies order by runtimeminutes desc  limit 10;", nativeQuery = true)
	List<Movies> findForDuration();

	@Query(value = "select m.tconst,r.averageRating from movies m inner join ratings r  where m.tconst=r.tconst and r.averageRating>6.0 order by r.averageRating desc; ", nativeQuery = true)
	List<Movies> avgRating();

}
//tconst,primarytitle,runtimeminutes, genres
//select tconst,primary_title,runtime_minutes, genres from movies order by runtime_minutes desc  limit 1,10;
//select m.tconst,m.primaryTitle,m.genres,r.averageRating from movies m inner join ratings r  where m.tconst=r.tconst and r.averageRating>6.0 order by r.averageRating desc; 

