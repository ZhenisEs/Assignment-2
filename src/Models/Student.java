package Models;

import java.nio.file.Path;

public class Student extends Person{
    private double gpa;
    private double stepa = 36600;
    public Student(){
        super();
    }
    public Student(String name, String surname, Double gpa){
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
    public double getPaymentAmount() {
        if (getGpa() > 2.67){
            return stepa;
        }
        else
            return 0;
    }

    @Override
    public String toString(){
        return "Student: " + super.toString()+" earns " + getPaymentAmount() + "tenge";
    }


}
