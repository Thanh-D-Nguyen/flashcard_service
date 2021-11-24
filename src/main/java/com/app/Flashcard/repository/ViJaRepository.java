package com.app.Flashcard.repository;

import com.app.Flashcard.entity.ViJa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViJaRepository extends JpaRepository<ViJa, Integer> {
}
