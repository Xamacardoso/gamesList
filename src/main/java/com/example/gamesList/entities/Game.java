package com.example.gamesList.entities;

import jakarta.persistence.*;

import java.util.Objects;

// Enables relational mapping for this object
@Entity
@Table(name = "tb_game")
public class Game {
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Annotation for generating unique id values
    private long id;
    private String title;

    @Column(name = "game_year") // Defines how the name of the column exists in database
    private Integer year;
    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game() {}

    public Game(long id, String title, Integer year, String genre, String platform, String imgUrl, String shortDescription, String longDescription) {
        super();
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    // Method for distinct game comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
