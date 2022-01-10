package com.app.Flashcard.service;

import com.app.Flashcard.entity.JaVi;
import com.app.Flashcard.entity.ViJa;
import com.app.Flashcard.repository.ViJaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViJaService {
    @Autowired
    private ViJaRepository repository;
}
