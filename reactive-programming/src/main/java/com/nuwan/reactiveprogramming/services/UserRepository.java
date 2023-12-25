package com.nuwan.reactiveprogramming.services;

import com.nuwan.reactiveprogramming.domain.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, String> {

}
