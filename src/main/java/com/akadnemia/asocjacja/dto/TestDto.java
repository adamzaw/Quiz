package com.akadnemia.asocjacja.dto;

import com.akadnemia.asocjacja.model.quiz.Question;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TestDto {

    private String name;

    private List<QuestionDto> questions = new ArrayList<>();

}
