import Users.Users;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Before
    public void setUp() throws Exception {
        App app = new App();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
    }

    @Test
    public void add_isCorrect() throws Exception {

    }

    @Test
    public void users_create_newUser() {
        Users users = new Users("Allan",22,"Manager");
        assertEquals("Allan",users.getUsername());
    }
}