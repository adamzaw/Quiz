package com.akadnemia.asocjacja.repository;

import com.akadnemia.asocjacja.model.quiz.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository <Test, Long>{
}
