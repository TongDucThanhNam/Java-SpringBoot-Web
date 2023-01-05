package com.example.javawebdemo.Respositories;

import com.example.javawebdemo.Models.Users;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
// This is the interface that will be used to access the database
public interface UserRepository extends CrudRepository<Users, Long> {
}
