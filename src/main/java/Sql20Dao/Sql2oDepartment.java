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
        String sql = "INSERT INTO departments (department_name) VALUES (:department_name)";
        try(Connection conn=sql2o.open()) {
            int id =(int)conn.createQuery(sql,true)
                    .bind(departments)
                    .executeUpdate()
                    .getKey();
            departments.setId(id);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public List<Departments> getAll() {
        Connection conn=sql2o.open();
            return conn.createQuery("SELECT * FROM departments")
                    .executeAndFetch(Departments.class);

    }
    @Override
    public void deleteAll() {
        String sql = "DELETE FROM departments";
        try(Connection conn=sql2o.open()) {
            conn.createQuery(sql)
                    .executeUpdate();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
