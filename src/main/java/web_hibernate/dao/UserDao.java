package web_hibernate.dao;

import web_hibernate.model.User;

import java.util.List;

public interface UserDao {

    List<User> index();

    User show(int id);

    void update(int id, User updatedUser);

    void delete(int id);

    void save(User user);
}
