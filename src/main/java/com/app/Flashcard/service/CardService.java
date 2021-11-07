package com.app.Flashcard.service;

import com.app.Flashcard.entity.Card;
import com.app.Flashcard.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    @Transactional
    public String createCard(Card card){
        cardRepository.save(card);
        return "Saved card!!";
    }

    public List<Card> readAllCards(){
        return cardRepository.findAll();
    }
}
