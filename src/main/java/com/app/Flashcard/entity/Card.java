package com.app.Flashcard.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "CARD")
public class Card {
    @Id
    @GeneratedValue
    private int id;
    private int collectionId;
    private String front;
    private String back;
    private String frontLang;
    private String backLang;
    private String descTxt;
    private String frontImage;
    private String backImage;
    private int sortPosition;
    private boolean learned;
    private  boolean favorite;
}
