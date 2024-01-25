import Models.Employee;
import Models.Person;
import Models.Student;


import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        ArrayList <Person> people = new ArrayList<>();
        people.add(new Employee("Jack", "John", "Worker", 27000.00));
        people.add(new Employee("Artem", "Dzuba", "Fotball",100000.00));
        people.add(new Student("Zhenis", "Esimbekov", 2.7));
        people.add(new Student("Mansur", "Urazbekov",2.1));

        Collections.sort(people);

        printData(people);

    }
    public static void printData(Iterable<Person> persons){
        for (Person person : persons){
            System.out.println(person.toString());
        }
    }
}