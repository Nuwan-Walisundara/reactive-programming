package com.nuwan.reactiveprogramming.services;

import com.nuwan.reactiveprogramming.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper {
    UserResponse toUserResponse(User destination);
    @Mapping(target = "id", ignore = true)
    User toUser(UserRequest request);
}