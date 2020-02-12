package com.akadnemia.asocjacja.dto.mapper;

import com.akadnemia.asocjacja.dto.TestDto;
import com.akadnemia.asocjacja.model.quiz.Test;
import org.springframework.stereotype.Component;


@Component
public class TestMapper {

    private QuestionMapper questionMapper= new QuestionMapper();

    public TestDto mapToTestDto(Test test) {

        TestDto testDto = new TestDto();

        testDto.setName(test.getName());
        testDto.setQuestions(questionMapper.mapToListQuestionDto(test.getQuestions()));

        return  testDto;
    }
}
