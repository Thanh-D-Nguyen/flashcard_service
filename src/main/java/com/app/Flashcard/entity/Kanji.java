package com.app.Flashcard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "KANJI")
public class Kanji {
    @Id
    @GeneratedValue
    private long id;
    private String components;
    private String componentsDetail;
    private String detail;
    private String examples;
    private boolean favorite;
    private int frequently;
    private String kanji;
    private String kun;
    private int level;
    private String mean;
    private String on;
    private boolean remember;
    private String kanjiShort;
    private int strokeCount;
    private String svg;
}
