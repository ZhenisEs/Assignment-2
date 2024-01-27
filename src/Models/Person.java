package Models;

public abstract class Person implements Payable, Comparable<Person>{

    private static int id_gen=1; //static variable for generate ID
    private int id; //Person ID
    private String name; //Person name
    private String surname; //Person surname
    private int age; //Person age

    public Person(){
        this.id = id_gen++;
    } //Constructor, every call +ID

    public Person(String name, String surname){ //Constructor with parametrs
        this();
        setName(name);
        setSurname(surname);
    }
    public void setName(String name){
        this.name = name;

    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getID(){
        return id;
    }
    public String getName() {
    return name;
    }
    public String getSurname(){
        return surname;
    }

    public String toString(){
        return id + ". " + name + " " + surname; //return id, name, surname

    }
    public String getPosition(){
        return "Student";
    } //

    public int compareTo(Person second){
        return Double.compare(this.getPaymentAmount(), second.getPaymentAmount());
    } //compare by salaries
    public abstract double getPaymentAmount();
}
