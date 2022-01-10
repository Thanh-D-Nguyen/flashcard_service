package com.app.Flashcard.service;

import com.app.Flashcard.entity.JaVi;
import com.app.Flashcard.entity.Kanji;
import com.app.Flashcard.repository.JaViRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JaViService {
    @Autowired
    private JaViRepository repository;
}
