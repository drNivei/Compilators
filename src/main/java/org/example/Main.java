package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Person person = new Person("S", 5);
    System.out.println(person.toString());
    Person person1 = new Person();
    System.out.println(person1.toString());
    System.out.println(person1.getAge());


    }
}