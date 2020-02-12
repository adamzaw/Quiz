package com.akadnemia.asocjacja.model.quiz;

import lombok.Data;



import javax.persistence.*;


@Data
@MappedSuperclass
public class EntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
