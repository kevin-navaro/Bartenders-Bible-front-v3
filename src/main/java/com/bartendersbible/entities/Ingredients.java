package com.bartendersbible.entities;

import javax.persistence.*;

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

    @ManyToOne
    private Recettes recettes;

    public Recettes getRecettes() {
        return recettes;
    }

    public void setRecettes(Recettes recettes) {
        this.recettes = recettes;
    }
}
