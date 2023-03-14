package com.bartendersbible.bartendersbiblefinal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = true)
    private String title;

    @Column(name = "content", nullable = true)
    private String content;

    @Column(name = "date", nullable = true)
    private Date date;

    @Column(name = "rank", nullable = true)
    private Long rank;

    @ManyToOne(targetEntity = User.class)
    private User user;

    @ManyToOne(targetEntity = Recipe.class)
    private Recipe recipe;
}
