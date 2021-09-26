package Users;

import java.util.Objects;

public class Users {
    private int id;
    private String name;
    private int departmentId;
    private String role;

    public Users(String name, int departmentId, String role) {
        this.name = name;
        this.departmentId = departmentId;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id && departmentId == users.departmentId && Objects.equals(name, users.name) && Objects.equals(role, users.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, departmentId, role);
    }
}
