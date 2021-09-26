package Dao;

import News.News;
import Users.Users;

import java.util.List;

public interface UsersDao {
    //create
    void add(Users users);

    // reading
    List<Users> findAll();

    //updating
    void update();

    //delete
    void delete();
}
