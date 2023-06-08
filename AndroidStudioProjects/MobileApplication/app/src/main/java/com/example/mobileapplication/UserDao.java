package com.example.mobileapplication;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User user);

    @Query("SELECT * FROM users")
    List<User> getAllUsers();

    @Query("SELECT COUNT(*) FROM users WHERE login = :login AND password = :password")
    int checkLoginAndPassword(String login, String password);

    @Query("SELECT * FROM users WHERE login = :login")
    User getUserByLogin(String login);
}

