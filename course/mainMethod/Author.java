package course.mainMethod;

public class Author {
    public String name;
    public int age;
    public String nationality;

    public Author(String name, int age, String nationality){
        super();
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }
    public void sleep() {
        if (age < 10) {
            System.out.println(name + " will sleep more than 12 hours in a day");
        } else if (age <= 50) {
            System.out.println(name + " will sleep less than 10 hours in a day");
        } else {
            System.out.println(name + " will sleep average 10 hours in a day");
        }
    }
}