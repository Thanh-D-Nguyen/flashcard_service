package com.app.Flashcard.service;

import com.app.Flashcard.entity.JaVi;
import com.app.Flashcard.entity.Kanji;
import com.app.Flashcard.repository.JaViRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JaViService extends LoadJsonFileService {
    @Autowired
    private JaViRepository repository;

    public void insertAllJaVi() {
        if (repository.findAll().isEmpty() == false) { return; }
        List<JaVi> allJaVi = loadJsonFile("JaVi");
        System.out.println("Start save JaVi..."  + allJaVi.get(0));
        repository.saveAll(allJaVi);
        System.out.println("Done save JaVi");
    }
}
