package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Todo {
    private int id;
    private String username;

    @Size(min = 10, message = "Enter at least 10 characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;
}
