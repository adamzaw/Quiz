package com.akadnemia.asocjacja.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionDto {

    private String content;


    private Long id;

    private List<String> options;

    private String answer;

    public QuestionDto(String content) {
        this.content = content;
    }
}
