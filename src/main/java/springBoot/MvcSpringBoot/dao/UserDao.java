package springBoot.MvcSpringBoot.dao;

import springBoot.MvcSpringBoot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getByIdUser(int id);


    void save(User user);


    void update(User user);


    void delete(User user);
}