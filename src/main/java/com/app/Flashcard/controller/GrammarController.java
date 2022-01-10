package com.app.Flashcard.controller;

import com.app.Flashcard.service.GrammarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrammarController {

    @Autowired
    private GrammarService service;

    @RequestMapping(value = "loadGrammar", method = RequestMethod.GET)
    public  void  loadGrammar() {
    }
}
