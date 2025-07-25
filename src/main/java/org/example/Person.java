package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    String name;
    Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean alcohol(){
        return age > 18;
    }

    public void parseAge(){
        if(age<0){
            throw new IllegalArgumentException ("Возраст не может быть отрицательным!");
        }
    }

}
