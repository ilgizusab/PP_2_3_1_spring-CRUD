package web.repository;

import web.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();

    User findById(Long id);

    void save(User user);

    void update(User userData, User user);

    void delete(Long id);
}