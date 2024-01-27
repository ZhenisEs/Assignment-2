package Models;

public class Employee extends Person {

    private String position;
    private double salary;


    public Employee(){
        super();
    }

    public Employee(String name, String surname, String position, Double salary){
        this();
        setName(name);
        setPosition(position);
        setSalary(salary);
    }


    public void setPosition(String position){
        this.position = position;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getPosition(String position){
        return position;
    }
    public double getSalary(){
        return salary;
    }
    public String getPosition(){
        return position;
    }

    @Override
    public String toString(){
        return "Employee: "+super.toString() +" earns "+ getSalary()+" tenge";
    }


    @Override
    public double getPaymentAmount(){
        return salary;
    }


    

}
