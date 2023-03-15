package com.bartendersbible.entities;

import javax.persistence.*;
import java.util.Date;

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

    private Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    @ManyToOne
    @JoinColumn(name = "recette_id", referencedColumnName = "id")
    private Recettes recettes;

    public Recettes getRecettes() {
        return recettes;
    }

    public void setRecettes(Recettes recettes) {
        this.recettes = recettes;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
