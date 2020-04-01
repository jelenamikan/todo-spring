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

    public Todo deleteById(long id){
        Todo todo = findById(id);
        if(todo==null) return null;
        if(todos.remove(todo)){
            return todo;
        }
        return null;
    }

    public Todo findById(long id) {
        for(Todo todo : todos){
            if(todo.getId() == id){
                return todo;
            }
        }
        return null;
    }

    public Todo save(Todo todo){
        if(todo.getId() == -1){
            todo.setId(++idCounter);
            todos.add(todo);
        } else{
            deleteById(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

}
