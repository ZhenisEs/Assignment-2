package Models;

import java.nio.file.Path;

public class Student extends Person{
    private double gpa; //student gpa
    private double stepa = 36600; //student salary
    public Student(){ //constructor for the call parent class
        super();
    }
    public Student(String name, String surname, Double gpa){ //set the objects
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }

    public void setGpa(Double gpa){
        this.gpa = gpa;
    }
    public Double getGpa(){
        return gpa;
    }
    @Override
    public double getPaymentAmount() { //check gpa and return salary
        if (getGpa() > 2.67){
            return stepa;
        }
        else
            return 0;
    }

    @Override
    public String toString(){
        return "Student: " + super.toString()+" earns " + getPaymentAmount() + "tenge";
    }//return by call parent class and use him toString (answer)


}
