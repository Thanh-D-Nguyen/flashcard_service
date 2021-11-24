package com.app.Flashcard.repository;

import com.app.Flashcard.entity.JaVi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JaViRepository extends JpaRepository<JaVi, Integer> {
}
