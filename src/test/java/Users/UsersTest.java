package Users;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;

//import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
class UsersTest {

    @Test
    void getId() {


    }

    @Test
    void setId() {
    }

    @Test
    void test_getName_works_correctly() {
        Users testUsers = new Users("Allan",2,"Manager");
        assertEquals("Allan",testUsers.getUsername());
    }

    @Test
    void setName() {
    }

    @Test
    void getDepartmentId() {
        Users testUsers = new Users("Allan",2,"Manager");
        assertEquals(2,testUsers.getDepartment_id());
    }

    @Test
    void setDepartmentId() {
    }
}