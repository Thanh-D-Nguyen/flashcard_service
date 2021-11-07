package com.app.Flashcard.controller;

import com.app.Flashcard.entity.Card;
import com.app.Flashcard.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlashcardController {

    @Autowired
    private CardService cardService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "The application is up...";
    }

    @RequestMapping(value = "flashcards", method = RequestMethod.GET)
    public List<Card> getAllCards() {
        return cardService.readAllCards();
    }

}
