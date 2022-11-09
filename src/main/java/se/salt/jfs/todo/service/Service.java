package se.salt.jfs.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import se.salt.jfs.todo.repository.Repository;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repo;

    public void addTodo() {
        repo.addTodoToRepo();
    }
}
