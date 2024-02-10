package com.colak.springmongotutorial.restaurant.controller;

import com.colak.springmongotutorial.restaurant.entity.Restaurants;
import com.colak.springmongotutorial.restaurant.repository.RestaurantsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(originPatterns = "*")
public class RestaurantsController {

    private final RestaurantsRepository restaurantsRepository;

    // http://localhost:8080/api/v1/restaurants
    @GetMapping(value = "/restaurants")
    public Page<Restaurants> getAllRestaurants() {
        log.info("Thread Info: {}", Thread.currentThread());
        return this.restaurantsRepository.findAll(Pageable.ofSize(2500));
    }
}
