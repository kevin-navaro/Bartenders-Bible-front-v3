package com.bartendersbible.controllers;

import com.bartendersbible.repositories.FavorisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/favoris")
public class FavorisController {

    @Autowired
    FavorisRepository favorisRepository;
}
