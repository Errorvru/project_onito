package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Ratings;

@Repository
public interface RatingsDAO extends JpaRepository<Ratings, Integer> {
//	@Query(value = "select m.tconst,r.averagerating from movies m inner join ratings r  where m.tconst=r.tconst and r.averagerating>6.0 order by r.averagerating desc; ", nativeQuery = true)
//	List<Ratings> avgRating();
}