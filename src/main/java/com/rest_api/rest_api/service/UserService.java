package com.rest_api.rest_api.service;

import com.rest_api.rest_api.dao.UserDao;
import com.rest_api.rest_api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Stream;

@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findALl();
    }

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    public User createUser(User user) {
      return userDao.createUser(user);
    }

    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }
}
