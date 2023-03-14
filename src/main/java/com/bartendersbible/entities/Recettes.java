package com.bartendersbible.entities;

import javax.persistence.*;

@Entity
@Table(name = "Recettes")
public class Recettes {
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

    @ManyToOne
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    private Ingredients ingredients;

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    @ManyToOne
    private Review review;

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    @OneToOne
    private Favoris favoris;

    public Favoris getFavoris() {
        return favoris;
    }

    public void setFavoris(Favoris favoris) {
        this.favoris = favoris;
    }
}
