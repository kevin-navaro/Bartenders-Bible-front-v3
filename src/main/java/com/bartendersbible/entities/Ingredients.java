package com.bartendersbible.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ingredients")
public class Ingredients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToMany
    @JoinTable(
            name = "recettes_ingredients",
            joinColumns = {
                    @JoinColumn(name = "recette_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ingredient_id", referencedColumnName = "id")
            }
    )
    private List<Recettes> recettes = new ArrayList<>();

    public List<Recettes> getRecettes() {
        return recettes;
    }

    public void setRecettes(List<Recettes> recettes) {
        this.recettes = recettes;
    }

    private String name;

    private boolean hasAlcohol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasAlcohol() {
        return hasAlcohol;
    }

    public void setHasAlcohol(boolean hasAlcohol) {
        this.hasAlcohol = hasAlcohol;
    }

    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
