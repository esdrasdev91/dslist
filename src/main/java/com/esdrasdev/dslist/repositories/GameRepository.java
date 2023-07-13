package com.esdrasdev.dslist.repositories;

import com.esdrasdev.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
