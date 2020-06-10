package ua.lviv.logos.po.repository;

import ua.lviv.logos.po.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void save(User user);

    void update(User user);

    Optional<User> findById(Integer id);

    List<User> findAll();

    void delete(Integer id);
}
