package waiting.dao;

import waiting.vo.User;

import java.util.List;

public interface UserDao {
    void insert(User user);

    List<User> findAll();

    int update(User user);

    int delete(User user);
}
