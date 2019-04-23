package com.denispavlov.bookservice.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
//    @ApiModelProperty(name = "Id книги", example = "1")
    private long id;

//    @Size(min = 5, max = 50)
//    @NotNull
//    @ApiModelProperty(name = "Название книги", example = "Создание микросервисов")
    private String name;
}
