package Dao;
import News.News;

import java.util.List;

public interface NewsDao {
    //create
    void add(News news);

    // reading
    List<News> findAll();
    //delete
    void delete();

}
