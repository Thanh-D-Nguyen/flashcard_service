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
@Table(name = "JAVI")
public class JaVi {
    @Id
    private long id;
    private String mean;
    private String opposite;
    private String phonetic;
    private String pronunciation;
    private String related;
    private int seq;
    private int favorite;
    private String synsets;
    private String word;
}