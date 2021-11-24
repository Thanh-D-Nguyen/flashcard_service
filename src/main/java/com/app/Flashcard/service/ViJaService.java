package com.app.Flashcard.service;

import com.app.Flashcard.entity.JaVi;
import com.app.Flashcard.entity.ViJa;
import com.app.Flashcard.repository.ViJaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViJaService extends LoadJsonFileService {
    @Autowired
    private ViJaRepository repository;

    public void insertAllViJa() {
        if (repository.findAll().isEmpty() == false) { return; }
        List<ViJa> allViJa = loadJsonFile("ViJa");
        System.out.println("Start save Vija " + allViJa.get(0));
        repository.saveAll(allViJa);
        System.out.println("Done save vija");
    }
}
