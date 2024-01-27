import Models.Employee;
import Models.Person;
import Models.Student;


import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        ArrayList <Person> people = new ArrayList<>(); //create new dynamic array
        people.add(new Employee("Jack", "John", "Worker", 27000.00)); // add person
        people.add(new Employee("Artem", "Dzuba", "Fotball",100000.00));// add person
        people.add(new Student("Zhenis", "Esimbekov", 2.7));// add person
        people.add(new Student("Mansur", "Urazbekov",2.1));// add person

        Collections.sort(people); //sort by salary using the compareTo() method implemented in the Person class

        printData(people); //call the printData for output

    }
    public static void printData(Iterable<Person> persons){
        for (Person person : persons){
            System.out.println(person.toString());
        }
    }
}