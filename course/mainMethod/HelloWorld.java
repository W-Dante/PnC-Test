package course.mainMethod;

public class HelloWorld extends HomePageIntro{
    public HelloWorld(String name, int age, String nationality, String gender) {
        super(name, age, nationality, gender);
    }

    public static void main(String[] args) {
        Author Dante = new Author("Danté", 23, "British","Male");

        HPIntro();



    System.out.println("\n\n\n");

    System.out.println("Created by " + Dante.name);
    }
}
