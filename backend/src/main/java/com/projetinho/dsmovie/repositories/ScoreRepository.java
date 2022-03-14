package com.projetinho.dsmovie.repositories;

import com.projetinho.dsmovie.model.Score;
import com.projetinho.dsmovie.model.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
 
    
    
}