package com.simplilearn.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.simplilearn.entities.User;

@Repository

public interface Authentication extends CrudRepository<User, Integer> {
public Optional<User>findUserByName(String name);
}

