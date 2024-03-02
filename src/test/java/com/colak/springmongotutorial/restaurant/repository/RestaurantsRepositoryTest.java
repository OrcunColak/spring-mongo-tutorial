package com.colak.springmongotutorial.restaurant.repository;

import com.colak.springmongotutorial.config.AuditorAwareImpl;
import com.colak.springmongotutorial.restaurant.entity.Restaurants;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class RestaurantsRepositoryTest {

    @Autowired
    private RestaurantsRepository repository;

    @Test
    void save() {
        repository.deleteById("1");

        Restaurants restaurants = new Restaurants();
        restaurants.setId("1");
        restaurants.setName("restaurant1");

        Restaurants saved = repository.save(restaurants);

        Optional<Restaurants> optional = repository.findById("1");
        assertTrue(optional.isPresent());
        Restaurants fetchedRestaurants = optional.get();
        assertEquals(AuditorAwareImpl.USER_NAME,fetchedRestaurants.getLastModifiedBy());
    }
}
