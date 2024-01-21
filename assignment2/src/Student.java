public class Student extends Person {
    private int id;
    private String name;
    private String surname;
    private double gpa;
    private static int counter = 0;

    public Student(String name, String surname, double gpa){
        id=++counter;
        setName(name);
        setSurname(surname);
        setGpa(gpa);
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

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa=gpa;
    }

    public String toString(){
        return "Student " + id + ". " + name + " " + surname + " earns " + getPaymentAmount(this) + " tenge\n";
    }

    public double getPaymentAmount(Person person){
        if (this.gpa>2.67) return 36660;
        else return 0;
    }
    public int compareTo(Student student){
        return Double.compare(getPaymentAmount(this), getPaymentAmount(student));
    }
}
