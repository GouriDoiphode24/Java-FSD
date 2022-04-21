package com.example.UserManager.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.UserManager.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> 
{

	public Optional<User> findUserByName(String name);
}
