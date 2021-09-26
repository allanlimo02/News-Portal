import Sql20Dao.Sql2oDepartment;
import Sql20Dao.Sql2oNews;
import Sql20Dao.Sql2oUsers;
import Users.Users;
import org.sql2o.Connection;
import com.google.gson.Gson;
import org.sql2o.Sql2o;

import static spark.Spark.*;


public class App {
    public static void main(String[] args) {
        Connection conn;
        Sql2oNews sql2oNews;
        Sql2oUsers sql2oUsers;
        Sql2oDepartment sql2oDepartment;
        Gson gson = new Gson();

        String connectionString = "jdbc:h2:~/news_portal.db;INIT=RUNSCRIPT from 'classpath:Db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        sql2oNews = new Sql2oNews(sql2o);
        sql2oDepartment =new Sql2oDepartment(sql2o);
        sql2oUsers =new Sql2oUsers(sql2o);

        conn = sql2o.open();

        //###################### User Routes ##########################

        //add new user
        post("/users/new", "application/json", (req, res) -> { //accept a request in format JSON
            Users user = gson.fromJson(req.body(), Users.class);//make with GSON
            sql2oUsers.add(user);//Do our thing with our DAO
            res.status(201);//everything went well - update the response status code
            res.type("application/json");
            return gson.toJson(user);//send it back to be displayed
        });
        // get all users
        get("/users", "application/json", (req, res) -> { //accept a request in format JSON from an app
            res.type("application/json");
            return gson.toJson(sql2oUsers.findAll());//send it back to be displayed
        });
        //####################### Department routes #########################
        //create a new department


        //###################### News Routes ##########################


        }
}
