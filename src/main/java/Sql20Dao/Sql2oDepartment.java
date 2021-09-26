package Sql20Dao;

import Dao.DepartmentDao;
import Departments.Departments;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oDepartment implements DepartmentDao {
    private final Sql2o sql2o;

    public Sql2oDepartment(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Departments departments) {
        try(Connection conn=sql2o.open()) {

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public List<Departments> getAll() {
        try(Connection conn=sql2o.open()) {

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteAll() {
        try(Connection conn=sql2o.open()) {

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void update(Departments departments) {
        try(Connection conn=sql2o.open()) {

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
