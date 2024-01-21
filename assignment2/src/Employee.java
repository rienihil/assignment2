public class Employee extends Person{
    private int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    private static int counter = 0;

    public Employee(String name, String surname, String position, double salary){
        id=++counter;
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
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

    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position=position;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public String toString(){
        return "Employee " + id + ". " + name + " " + surname + " earns " + salary + " tenge\n";
    }
    public double getPaymentAmount(Person person){
        return salary;
    }
    public int compareTo(Employee employee){
        return Double.compare(getPaymentAmount(this), getPaymentAmount(employee));
    }
}
