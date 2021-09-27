package Departments;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentsTest {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void getDepartment_name() throws Exception{
        Departments departments= new Departments("Developers");
        assertEquals("Developers",departments.getDepartment_name());

    }

    @Test
    public void setDepartment_name() {
    }
}