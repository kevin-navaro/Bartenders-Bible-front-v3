package com.bartendersbible.entities;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
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

    @OneToMany
    private Favoris favoris;

    public Favoris getFavoris() {return favoris;}

    public void setFavoris(Favoris favoris) {this.favoris = favoris;}

    @OneToMany
    private Review review;

    public Review getReview() {return review;}

    public void setReview(Review review) {this.review = review;}
}
