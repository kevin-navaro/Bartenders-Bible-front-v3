package com.bartendersbible.controllers;

import com.bartendersbible.repositories.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientsController {

    @Autowired
    IngredientsRepository ingredientsRepository;
}
