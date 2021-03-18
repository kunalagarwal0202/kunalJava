package com.cognizant.MovieCruiser.MovieCruizer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, String> {
public Long deleteByProductId(int id);
public List<Favorite> findByUserid(int userid);
}