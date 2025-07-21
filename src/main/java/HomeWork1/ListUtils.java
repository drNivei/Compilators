package HomeWork1;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListUtils {
    public Integer findMax(List<Integer> list){
        if(list.isEmpty()){
            throw new NoSuchElementException("Список пустой!");
        }else{
            return Collections.max(list);
        }
    }

    public List<Integer> filterEvenNumbers(List<Integer> list){
        return list.stream().filter(num->num%2==0).distinct().toList();
    }

}
