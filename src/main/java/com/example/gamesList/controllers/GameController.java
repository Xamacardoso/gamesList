package com.example.gamesList.controllers;

import com.example.gamesList.dto.GameMinDTO;
import com.example.gamesList.entities.Game;
import com.example.gamesList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Defines a REST API controller
@RequestMapping(value = "/games") // Maps resources requests
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}

