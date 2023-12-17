package com.cricket.project.repositories;

import com.cricket.project.entities.Cricket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CricketRepo extends JpaRepository<Cricket,Integer> {
    Optional<Cricket> findByTeamHeading(String teamHeading);
}
