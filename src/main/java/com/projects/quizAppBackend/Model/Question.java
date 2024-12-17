package com.projects.quizAppBackend.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private String difficulty;

    private String category;

    @Column(unique = true)
    @JsonProperty("question")
    private String questionStatement;

    @JsonProperty("correct_answer")
    private String correctAnswer;

    @ElementCollection
    @JsonProperty("incorrect_answers")
    private List<String> incorrectAnswers;


}
