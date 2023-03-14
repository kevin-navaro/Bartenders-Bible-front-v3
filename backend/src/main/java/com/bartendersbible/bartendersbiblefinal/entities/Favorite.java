package com.bartendersbible.bartendersbiblefinal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "favorite")
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "userid", nullable = false)
    private Long userid;

    @Column(name = "recipeid", nullable = false)
    private Long recipeid;

    @Column(name = "date", nullable = true)
    private Date date;

    @OneToMany(targetEntity = Recipe.class)
    private List<Recipe> recipes = new ArrayList<>();

    @OneToMany(targetEntity = User.class)
    private List<User> users = new ArrayList<>();
}
