package se.salt.jfs.todo.repository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import se.salt.jfs.todo.controller.model.Todo;

@org.springframework.stereotype.Repository
public class Repository {

    @Autowired
    MongoRepo repo;

    Todo todo = new Todo(new ObjectId(), "cleaning", "Clean the garage");

    public void addTodoToRepo() {
        repo.save(todo);
    }

}