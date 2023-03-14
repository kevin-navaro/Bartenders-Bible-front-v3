package com.bartendersbible.controllers;

import com.bartendersbible.repositories.RecettesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recettes")
public class RecettesController {

    @Autowired
    RecettesRepository recettesRepository;
}
