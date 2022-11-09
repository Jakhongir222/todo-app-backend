package se.salt.jfs.todo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import se.salt.jfs.todo.controller.model.Todo;

public interface MongoRepo extends MongoRepository<Todo, ObjectId> {

}
