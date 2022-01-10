package com.app.Flashcard.service;

import com.app.Flashcard.entity.Grammar;
import com.app.Flashcard.entity.Kanji;
import com.app.Flashcard.repository.KanjiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KanjiService {
    @Autowired
    private KanjiRepository repository;
}
