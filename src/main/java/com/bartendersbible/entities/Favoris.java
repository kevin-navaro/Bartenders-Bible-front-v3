package com.bartendersbible.entities;

import javax.persistence.*;

@Entity
@Table(name = "favoris")
public class Favoris {
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

    @OneToOne
    private Recettes recettes;

    public Recettes getRecettes() {
        return recettes;
    }

    public void setRecettes(Recettes recettes) {
        this.recettes = recettes;
    }

    @OneToOne
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
