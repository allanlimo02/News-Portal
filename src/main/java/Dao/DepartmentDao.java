package Dao;
import Departments.Departments;

import java.util.List;

public interface DepartmentDao {
    // add to database
    void add(Departments departments);

    //read from database
    List<Departments>getAll();

    // update to database
    void update(Departments departments);

    //delete
    void deleteAll();



}
