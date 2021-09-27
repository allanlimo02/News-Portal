package Departments;

import java.util.Objects;

public class Departments {
    private int id;
    private String department_name;

    public Departments(String name) {
        this.department_name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departments that = (Departments) o;
        return id == that.id && Objects.equals(department_name, that.department_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, department_name);
    }
}
