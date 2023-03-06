package com.example.springweb.springdemobootweb.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private static List<ToDo> toDoList = new ArrayList<>();

    static {
        toDoList.add(new ToDo(1, "test", "AWS",
                LocalDate.now().plusYears(1), false));
        toDoList.add(new ToDo(2, "test", "JAVA",
                LocalDate.now().plusYears(1), false));
        toDoList.add(new ToDo(3, "test", "JS",
                LocalDate.now().plusYears(1), false));
    }

    public List<ToDo> findByUsername(String username) {
        return toDoList;
    }
}
