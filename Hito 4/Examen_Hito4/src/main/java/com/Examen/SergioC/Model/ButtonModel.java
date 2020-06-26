package com.Examen.SergioC.Model;

import javax.persistence.*;

@Entity
@Table(name= "Button")
public class ButtonModel {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "Ingles", length = 200, nullable = false)
    private String english;

    @Column(name = "Portugues", length = 200, nullable = false)
    private String portugues;

    @Column(name = "Word", length = 200, nullable = false)
    private String word;

    public ButtonModel() {

    }

    public ButtonModel(String english, String portugues, String word) {
        this.english = english;
        this.portugues = portugues;
        this.word = word;
    }

    public ButtonModel(String english, String first) {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getPortugues() {
        return portugues;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
