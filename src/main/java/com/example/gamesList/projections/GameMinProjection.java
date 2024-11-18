package com.example.gamesList.projections;

public interface GameMinProjection {

    // Get methods for every selected argument on SQL query
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
