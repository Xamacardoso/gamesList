package com.example.gamesList.services;

import com.example.gamesList.dto.GameMinDTO;
import com.example.gamesList.entities.Game;
import com.example.gamesList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    // Injects a repository for data access
    @Autowired
    private GameRepository gameRepository;

    // Returns games DTO
    public List<GameMinDTO> findAll() {
        // Builtin JPA method for finding all table elements
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
