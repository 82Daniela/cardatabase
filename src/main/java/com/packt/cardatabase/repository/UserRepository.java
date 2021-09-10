package com.packt.cardatabase.repository;

import com.packt.cardatabase.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByUsername(String username);
}
