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

    @BeforeEach
    public void beforeEach (){

    }

    public void addTest(int a, int b, int c){
        assertEquals(c, a+b);
    }
}
