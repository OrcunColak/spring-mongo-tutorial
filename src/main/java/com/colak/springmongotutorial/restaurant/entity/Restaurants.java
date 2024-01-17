package com.colak.springmongotutorial.restaurant.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurants")
@Data
public class Restaurants {
    @Id
    private String id;
    private String name;
}
