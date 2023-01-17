package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

//@Entity(name = "ToDo")
@Entity()
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
//Bean -> Database. Automatically create db entities
public class Todo {
    @Id
    @GeneratedValue
    private int id;
    //    @Column(name = "name")
    private String username;

    @Size(min = 10, message = "Enter at least 10 characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;
}
