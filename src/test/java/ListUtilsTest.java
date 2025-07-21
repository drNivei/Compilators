import HomeWork1.ListUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListUtilsTest {
    ListUtils listUtils = new ListUtils();

    @Test
    public void testEmptyList_filterEvenNumbers(){
        List<Integer> list = new ArrayList<>();
        Assertions.assertTrue(listUtils.filterEvenNumbers(list).isEmpty(), "The list should be empty");
    }

    @Test
    public void testOneValueList_filterEvenNumbers(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Assertions.assertTrue(listUtils.filterEvenNumbers(list).isEmpty(), "The list should be empty");
        list.set(0,2);
        Assertions.assertFalse(listUtils.filterEvenNumbers(list).isEmpty(), "The list should be empty");

    }
    @Test
    public void testUsualList_filterEvenNumbers(){
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);list1.add(4);
        Assertions.assertEquals(listUtils.filterEvenNumbers(list), list1);
    }

    @Test
    public void testEmptyList_findMax(){
        try {
            // Code that is expected to throw an exception
            List<Integer> list = new ArrayList<>();
            Integer a = listUtils.findMax(list);
            Assertions.fail("Expected Список пустой! Exception was not thrown."); // If execution reaches here, test fails
        } catch (RuntimeException e) {
            // Exception caught, test passes
            assertEquals("Список пустой!", e.getMessage());
        }
    }

    @Test
    public void testOneValueList_findMax(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Assertions.assertEquals(listUtils.findMax(list),1);

    }
    @Test
    public void testUsualList_findMax(){
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);
        Assertions.assertEquals(listUtils.findMax(list),4);
    }
}
