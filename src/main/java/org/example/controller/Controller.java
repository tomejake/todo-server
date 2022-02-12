package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class Controller {
    private final TodoService service;

    @PostMapping
    public ResponseEntity<TodoResponse> create(){
        System.out.println("create");
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> readOne(){
        System.out.println("readOne");
        return null;
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> readALl(){
        System.out.println("readAll");
        return null;
    }

    @PatchMapping("{id}")
    public ResponseEntity<TodoResponse> update(){
        System.out.println("update");
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOne(){
        System.out.println("deleteOne");
        return null;
    }

    public ResponseEntity<?> deleteAll(){
        System.out.println("deleteAll");
        return null;
    }
}
