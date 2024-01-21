public abstract class Person implements Payable, Comparable<Person> {
    private int id;
    private String name;
    private String surname;
    private static int counter=0;
    public Person(){
        id=counter++;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String toString(){
        return id + ". " + name + " " + surname + "\n";
    }
    public int compareTo(Person person){
        return Double.compare(getPaymentAmount(this), getPaymentAmount(person));
    }
}
