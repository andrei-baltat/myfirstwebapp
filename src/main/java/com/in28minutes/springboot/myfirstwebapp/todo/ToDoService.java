package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ToDoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;

    static {
        todos.add(
                new Todo(++todosCount, "in28Min", "Learn AWS",
                        LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "in28Min", "Learn DEVOPS",
                LocalDate.now().plusYears(3), false));
        todos.add(new Todo(++todosCount, "in28Min", "Learn Full Stack Stack",
                LocalDate.now().plusYears(5), false));
    }

    public List<Todo> findByUserName(String username) {
        Predicate<? super Todo> predicate = todos -> todos.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addToDo(String username, String description, LocalDate targetDate, boolean isDone) {
        todos.add(new Todo(++todosCount, username, description, targetDate, isDone));
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todos -> todos.getId() == id;
        todos.removeIf(predicate);
    }


    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todos -> todos.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateToDo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
