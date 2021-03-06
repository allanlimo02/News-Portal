package Sql20Dao;

import Dao.UsersDao;
import Users.Users;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oUsers implements UsersDao {
    private final Sql2o sql2o;

    public Sql2oUsers(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Users users) {
        String sql="INSERT INTO users (username,department_id,role) VALUES (:username,:department_id ,:role)";
        try (Connection conn=sql2o.open()){
            int id=(int)conn.createQuery(sql,true)
                    .bind(users)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
            users.setId(id);
        }catch(Sql2oException e){
            System.out.println(e);
        }
    }
    @Override
    public List<Users> findAll() {
//        String sql="SELECT * FROM users";
        Connection conn = sql2o.open();
            return conn.createQuery("SELECT * FROM users")
                    .executeAndFetch(Users.class);

        }

    @Override
    public void delete(Users users) {
        try(Connection conn=sql2o.open()) {
            conn.createQuery("DELETE FROM users")
                    .executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}