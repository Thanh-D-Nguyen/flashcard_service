package com.app.Flashcard.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EXAMPLE")
public class Example {
    @Id
    @GeneratedValue
    private long id;
    private String content;
    private String mean;
    private long refID;
    private String trans;
}