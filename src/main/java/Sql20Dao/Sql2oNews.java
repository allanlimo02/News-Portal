package Sql20Dao;
import Dao.NewsDao;
import News.News;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oNews implements NewsDao {
    private final Sql2o sql2o;

    public Sql2oNews(Sql2o sql2o) {
        this.sql2o = sql2o;
    }


    @Override
    public void add(News news) {
        String sql="INSERT INTO news (title,department_id,category,news_details) VALUES (:title,:department_id,:category, :news_details)";
        try(Connection conn=sql2o.open()) {
           int id=(int) conn.createQuery(sql,true)
                    .bind(news)
                    .executeUpdate()
                    .getKey();
           news.setId(id);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public List<News> findAll() {
        try (Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM news")
                    .executeAndFetch(News.class);
        }
    }
    @Override
    public void delete() {
        try(Connection conn=sql2o.open()) {
            conn.createQuery("DELETE FROM news")
                    .executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
