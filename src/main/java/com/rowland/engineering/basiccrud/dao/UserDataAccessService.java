package com.rowland.engineering.basiccrud.dao;

import com.rowland.engineering.basiccrud.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UserDataAccessService implements UserDao {
    @Override
    public int insertUser(UUID id, User user) {
        return 0;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteUserById(UUID id) {
        return 0;
    }

    @Override
    public int updateUserById(UUID id, User user) {
        return 0;
    }

    @Override
    public List<User> selectAllUsers() {
        return List.of(new User(UUID.randomUUID(), "From Postgres DB","From Postgres DB",0));
    }
}
