package com.projetinho.dsmovie.controllers;

import com.projetinho.dsmovie.dto.MovieDto;
import com.projetinho.dsmovie.dto.ScoreDto;
import com.projetinho.dsmovie.services.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDto saveScore(@RequestBody ScoreDto dto) {
        MovieDto movieDto = service.saveScore(dto);
        return movieDto;
    }
}