package com.app.Flashcard.service;

import com.app.Flashcard.entity.Grammar;
import com.app.Flashcard.entity.Kanji;
import com.app.Flashcard.repository.KanjiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KanjiService extends LoadJsonFileService {
    @Autowired
    private KanjiRepository repository;

    public void insertAllKanji() {
        if (repository.findAll().isEmpty() == false) { return; }
        List<Kanji> allKanji = loadJsonFile("Kanji");
        System.out.println("Start save Kanji " + allKanji.get(0));
        repository.saveAll(allKanji);
        System.out.println("Done save kanji " + allKanji.get(1));
    }
}
