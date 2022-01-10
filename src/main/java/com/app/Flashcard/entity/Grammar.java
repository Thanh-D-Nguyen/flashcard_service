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
@Table(name = "GRAMMAR")
public class Grammar {
    @Id
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
