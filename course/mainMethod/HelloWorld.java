package course.mainMethod;

public class HelloWorld extends HomePageIntro{
    public HelloWorld(String name, int age, String nationality, String gender) {
        super(name, age, nationality, gender);
    }

    public static void main(String[] args) {
        Author Dante = new Author("Danté", 23, "British Jamaican","Male");

        HPIntro();
        System.out.println("\n");
        System.out.println(Dante.name + " is a " + Dante.age + " years old " + Dante.gender + ".");
        System.out.println(Dante.name + " is " + Dante.nationality + ".");



    System.out.println("\n\n");

    System.out.println("Created by " + Dante.name);
    }
}
