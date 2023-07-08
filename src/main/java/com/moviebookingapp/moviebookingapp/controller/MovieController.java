package com.moviebookingapp.moviebookingapp.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1.0/moviebooking")
public class MovieController {

    @PostMapping(value="/admin/addmovie")
    public String addMovie(){
        return "add contoller work";
    }
}
