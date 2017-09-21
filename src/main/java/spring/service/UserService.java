package spring.service;


import spring.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    List<User> findByName(String name);
    User findById(long id);

}
