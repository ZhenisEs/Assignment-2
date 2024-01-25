package Models;

import java.nio.file.Path;

public class Student extends Person{
    private double gpa;
    private static final double Stepa = 36600;

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
        return (gpa > 2.67) ? Stepa : 0;
    }

    @Override
    public String toString(){
        return "Student: " + super.toString()+" earns " + getPaymentAmount() + "tenge";
    }


}
