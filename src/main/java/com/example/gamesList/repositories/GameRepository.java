package com.example.gamesList.repositories;

import com.example.gamesList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface for games database access. Needs to have entity type and id type
public interface GameRepository extends JpaRepository<Game, Long> {
}
