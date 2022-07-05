package com.webprofile.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.webprofile.model.User;

public interface UserService extends MongoRepository<User, Integer>{

}
