package se.salt.jfs.todo.controller.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
public class Todo {
    @Id
    @MongoId
    private ObjectId id;

    private String title;
    private String description;

    public Todo(ObjectId id, String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
    }
}
