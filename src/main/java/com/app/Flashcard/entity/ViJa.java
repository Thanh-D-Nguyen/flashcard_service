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
@Table(name = "VIJA")
public class ViJa {
    @Id
    private long id;
    private long favorite;
    private String kind;
    private String mean;
    private String word;
}

