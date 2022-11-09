package se.salt.jfs.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.salt.jfs.todo.service.Service;

@CrossOrigin
@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    Service service;

    @PostMapping
    ResponseEntity<String> addTodo(){
        service.addTodo();
        return ResponseEntity.ok("Success");

    }


}
