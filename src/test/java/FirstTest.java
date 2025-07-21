import org.example.IllegalArgumentException;
import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {
    @Test
    public void test(){
        int a = 5+4;
        assertEquals(9,a);
    }

    @Test
    public void test2(){
        Person person = new Person("S", 5);
        Assertions.assertTrue(person.alcohol());
    }

    @Test
    public void personTest_parseAge() {
        try {
            Person person = new Person("S", -5);
            person.parseAge();
            Assertions.fail("Expected Возраст не может быть отрицательным! Exception was not thrown."); // If execution reaches here, test fails
        } catch (IllegalArgumentException e) {
            assertEquals("Возраст не может быть отрицательным!", e.getMessage());
        }
    }

}
