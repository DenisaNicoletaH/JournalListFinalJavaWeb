package com.example.journallistfinaljavaweb.repository;

import com.example.journallistfinaljavaweb.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    public List<User>findAllByFirst_nameAndId(String firstName,long id);
}
