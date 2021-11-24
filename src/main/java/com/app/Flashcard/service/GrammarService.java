package com.app.Flashcard.service;

import com.app.Flashcard.entity.Grammar;
import com.app.Flashcard.repository.GrammarRepository;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class GrammarService extends LoadJsonFileService {

    @Autowired
    private GrammarRepository repository;

    public void insertAllGrammar() {
        if (repository.findAll().isEmpty() == false) { return; }
        List<Grammar> grammars = loadJsonFile("Grammar");
        System.out.println("Start save grammar " + grammars.get(0));
        repository.saveAll(grammars);
        System.out.println("Done Save grammar");
    }
}
