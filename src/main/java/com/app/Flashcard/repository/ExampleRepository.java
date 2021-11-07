package com.app.Flashcard.repository;

import com.app.Flashcard.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, Integer> {
}
