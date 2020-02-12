package com.akadnemia.asocjacja.dto.mapper;

import com.akadnemia.asocjacja.dto.QuestionDto;
import com.akadnemia.asocjacja.model.quiz.Answer;
import com.akadnemia.asocjacja.model.quiz.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionMapper {

    public QuestionDto mapToQestionDto(Question question){
        QuestionDto questionDto = new QuestionDto(question.getContent());
        questionDto.setId(question.getId());

        List<Answer> answers = question.getAnswers();
        List<String> answerName = new ArrayList<>();

        for (Answer answer : answers) {
            answerName.add(answer.getName());
        }

        List<String> answerName2 = answers.stream()
                .map(x -> x.getName())
                .collect(Collectors.toList());

        questionDto.setOptions(answerName2);

        String correctAnswer = "";

        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).isCorrect()){
                correctAnswer = answers.get(i).getName();
            }
        }

        questionDto.setAnswer(correctAnswer);

        return questionDto;
    }

    public List<QuestionDto> mapToListQuestionDto(List<Question> questions){

        return questions.stream()
                .map(question -> mapToQestionDto(question))
                .collect(Collectors.toList());
    }
}
