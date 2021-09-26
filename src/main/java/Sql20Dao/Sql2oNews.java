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
    public void add() {
        try(Connection conn=sql2o.open()) {

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public List<News> findAll() {

        try(Connection conn=sql2o.open()) {

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public void update() {
        try(Connection conn=sql2o.open()) {

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void delete() {
        try(Connection conn=sql2o.open()) {

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
