package com.colak.springtutorial.restaurant.repository;

import com.colak.springtutorial.restaurant.entity.Restaurants;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantsRepository extends MongoRepository<Restaurants, String> {
}
