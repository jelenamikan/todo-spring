package com.springbootangular.todowebservice.todo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList<>();
    private static long idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "jecapereca", "Learn Angular", new Date(), false));
        todos.add(new Todo(++idCounter, "jecapereca", "Learn Spring", new Date(), false));
        todos.add(new Todo(++idCounter, "jecapereca", "Get a Job", new Date(), false));
    }

    public List<Todo> findAll(){
        return todos;
    }


}
