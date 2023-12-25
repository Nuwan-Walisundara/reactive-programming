package com.nuwan.reactiveprogramming.services;

import com.nuwan.reactiveprogramming.domain.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    final UserMapper userMapper;

    final UserRepository userRepository;

    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public Mono<UserResponse> saveUser(UserRequest request) {
        User user = userMapper.toUser(request);
        Mono<User> customerMono = userRepository.save(user).log();
        return customerMono.map(userMapper::toUserResponse);
    }

    public Flux<UserResponse> retrieveUsers() {
        return userRepository.findAll().log().map(userMapper::toUserResponse);
    }

}