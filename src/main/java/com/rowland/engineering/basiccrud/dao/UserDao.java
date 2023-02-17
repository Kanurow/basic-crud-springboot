package com.rowland.engineering.basiccrud.dao;

import com.rowland.engineering.basiccrud.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {
    int insertUser(UUID id, User user);
    default int insertUser(User user){
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }


    Optional<User> selectUserById(UUID id);
    int deleteUserById(UUID id);
    int updateUserById(UUID id, User user);

    List<User> selectAllUsers();
}
