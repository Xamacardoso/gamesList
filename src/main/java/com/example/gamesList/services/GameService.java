package com.example.gamesList.services;

import com.example.gamesList.dto.GameDTO;
import com.example.gamesList.dto.GameMinDTO;
import com.example.gamesList.entities.Game;
import com.example.gamesList.projections.GameMinProjection;
import com.example.gamesList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    // Injects a repository for data access
    @Autowired
    private GameRepository gameRepository;

    // Returns games DTO
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        // Builtin JPA method for finding all table elements
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    // Returns a game by id
    // TODO: Exception treatment
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result  = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    // Returns games by list
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        // Builtin JPA method for finding all table elements
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinDTO::new).toList();
    }
}
