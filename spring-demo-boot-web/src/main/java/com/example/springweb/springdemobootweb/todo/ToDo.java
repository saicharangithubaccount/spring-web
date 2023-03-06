package com.example.springweb.springdemobootweb.todo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@ToString
@Setter
@Getter
public class ToDo {
    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;
}
