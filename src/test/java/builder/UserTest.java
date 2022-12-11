package builder;

import junit.framework.TestCase;
import org.junit.Test;

public class UserTest extends TestCase {
    @Test
    public void testUser(){
        User user = User.builder().name("Max").age(18).gender(Gender.MALE).build();
        System.out.println(user);
        assertEquals(user.toString(), "User(age=18, gender=MALE, weight=0.0, height=0.0, occupations=[])");
    }
}