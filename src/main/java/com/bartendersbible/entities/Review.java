package com.bartendersbible.entities;

import javax.persistence.*;

@Entity
@Table(name = "Reviews")
public class Review {
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
    private Review review;

    public Review getReview() {return review;}

    public void setReview(Review review) {this.review = review;}

    @ManyToOne
    private Recettes recettes;

    public Recettes getRecettes() {return recettes;}

    public void setRecettes(Recettes recettes) {this.recettes = recettes;}
}
