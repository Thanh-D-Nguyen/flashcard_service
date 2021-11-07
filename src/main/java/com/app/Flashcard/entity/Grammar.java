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
@Table(name = "GRAMMAR")
public class Grammar {
    @Id
    @GeneratedValue
    private long id;
    private String category;
    private String define;
    private int favorite;
    private String level;
    private String mean;
    private String note;
    private int remember;
    private String summary;
}
