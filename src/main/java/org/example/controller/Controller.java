package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class Controller {
    private final TodoService service;

    @PostMapping
    public ResponseEntity<TodoResponse> create(@RequestBody TodoRequest request) {
        if (ObjectUtils.isEmpty(request.getTitle())) {
            return ResponseEntity.badRequest().build();
        }
        if (ObjectUtils.isEmpty(request.getOrder())) {
            request.setOrder(0L);
        }
        if (ObjectUtils.isEmpty(request.getCompleted())) {
            request.setCompleted(false);
        }
        TodoEntity result = this.service.add(request);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> readOne() {
        System.out.println("readOne");
        return null;
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> readALl() {
        System.out.println("readAll");
        return null;
    }

    @PatchMapping("{id}")
    public ResponseEntity<TodoResponse> update() {
        System.out.println("update");
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOne() {
        System.out.println("deleteOne");
        return null;
    }

    public ResponseEntity<?> deleteAll() {
        System.out.println("deleteAll");
        return null;
    }
}
