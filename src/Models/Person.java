package Models;

public abstract class Person implements Payable, Comparable<Person>{

    private static int id_gen=1;
    private int id;
    private String name;
    private String surname;
    private int age;
    public Person(){
        this.id = id_gen++;
    }

    public Person(String name, String surname){
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
        return id + ". " + name + " " + surname;

    }
    public String getPosition(){
        return "Student";
    }

    public int compareTo(Person second){
        return Double.compare(this.getPaymentAmount(), second.getPaymentAmount());
    }
    public abstract double getPaymentAmount();
}
