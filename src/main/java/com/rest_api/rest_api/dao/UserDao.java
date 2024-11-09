package com.rest_api.rest_api.dao;

import com.rest_api.rest_api.exceptions.UserNotFoundExceptions;
import com.rest_api.rest_api.model.User;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {

    private static List<User> users = new ArrayList<>();

    private static Integer userCount = 0;

    static {
        users.add(new User(++userCount, "user 1", 15, "address 1", LocalDate.now().minusYears(15)));
        users.add(new User(++userCount, "user 2", 16, "address 2", LocalDate.now().minusYears(16)));
        users.add(new User(++userCount, "user 3", 17, "address 3", LocalDate.now().minusYears(17)));
        users.add(new User(++userCount, "user 4", 18, "address 4", LocalDate.now().minusYears(18)));
        users.add(new User(++userCount, "user 5", 19, "address 5", LocalDate.now().minusYears(19)));
    }

    public List<User> findALl(){
        return users;
    }

    public User findUserById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }


    public User createUser(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }

    public void deleteUserById(int id) {
        User user = findUserById(id);
        if (user == null){
            throw new UserNotFoundExceptions("user Not Found with id : " + id);
        }else {
            users.remove(user);
        }
    }
}
