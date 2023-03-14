package com.bartendersbible.bartendersbiblefinal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "hasAlcohol", nullable = true)
    private Boolean hasAlcohol;

    @Column(name="image")
    private String image;

    @ManyToMany(targetEntity = Recipe.class)
    private List<Recipe> recipe = new ArrayList<>();
}
