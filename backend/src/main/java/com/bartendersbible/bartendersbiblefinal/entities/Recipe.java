package com.bartendersbible.bartendersbiblefinal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "dateAdd", nullable = true)
    private Date dateAdd;

    @Column(name = "estimated-time", nullable = true)
    private Long estimatedtime;

    @Column(name = "image", nullable = true)
    private String image;

    @Column(name="hasAlcohol")
    private boolean hasAlcohol;


    @ManyToOne(targetEntity = User.class)
    private User user;

    @ManyToMany(targetEntity = Ingredient.class)
    private List<Ingredient> ingredients = new ArrayList<>();

    @OneToMany(targetEntity = Review.class)
    private List<Review> reviews = new ArrayList<>();

    @ManyToOne(targetEntity = Favorite.class)
    private Favorite favorite;

    public boolean hasAlcohol(){
        for (Ingredient ingredient:ingredients) {
            if (ingredient.getHasAlcohol()){
                return true;
            }
        }
        return false;
    }

}

