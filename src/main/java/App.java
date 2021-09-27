import Departments.Departments;
import News.News;
import Sql20Dao.Sql2oDepartment;
import Sql20Dao.Sql2oNews;
import Sql20Dao.Sql2oUsers;
import Users.Users;
import org.sql2o.Connection;
import com.google.gson.Gson;
import org.sql2o.Sql2o;

import static spark.Spark.*;


public class App {
    public static int add(int x, int y){
        return (x+y);
    }
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
        //conn = sql2o.open();

        //###################### User Routes ##########################

        //add new user
        post("/users/new", "application/json", (req, res) -> {
            Users user = gson.fromJson(req.body(), Users.class);
            sql2oUsers.add(user);
            res.status(201);
            res.type("application/json");
            return gson.toJson(user);
        });
        // get all users
        get("/users", "application/json", (req, res) -> {
            res.type("application/json");
            return gson.toJson(sql2oUsers.findAll());
        });
        //####################### Department routes #########################
        //create a new department
        post("/department/new", "application/json", (req, res) -> {
            Departments department = gson.fromJson(req.body(), Departments.class);
            sql2oDepartment.add(department);
            res.status(201);
            res.type("application/json");
            return gson.toJson(department);
        });

        // Check all departments
        get("/departments", "application/json", (req, res) -> {
            res.type("application/json");
            return gson.toJson(sql2oDepartment.getAll());
        });

        //###################### News Routes ##########################
        // Post method for News
        post("/news/new", "application/json", (req, res) -> {
            News news = gson.fromJson(req.body(), News.class);
            sql2oNews.add(news);
            res.status(201);
            res.type("application/json");
            return gson.toJson(news);
        });
        get("/news", "application/json", (req, res) -> {
            res.type("application/json");
            return gson.toJson(sql2oNews.findAll());
        });


        }
}
