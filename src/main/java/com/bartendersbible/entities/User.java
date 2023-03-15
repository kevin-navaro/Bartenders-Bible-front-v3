package com.bartendersbible.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy = "user")
    private List<Favoris> favoris = new ArrayList<>();

    public List<Favoris> getFavoris() {return favoris;}

    public void setFavoris(List<Favoris> favoris) {this.favoris = favoris;}

    @OneToMany(mappedBy = "user")
    private  List<Review> review = new ArrayList<>();

    public List<Review> getReview() {return review;}

    public void setReview(List<Review> review) {this.review = review;}
    
    private String name;
    
    private String userName;
    
    private String email;
    
    private String password;
    
    private String phoneNumber;
    
    private Date birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
