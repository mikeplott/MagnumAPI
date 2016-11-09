package com.theironyard.services;

import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by michaelplott on 11/9/16.
 */
public interface UserRepo extends CrudRepository<User, Integer> {
    User findFirstByName(String name);
}
