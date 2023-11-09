package course.mainMethod;


public class HelloWorld {
    public static void main(String[] args) {
        Author Dante = new Author("Danté", 23, "British","Male");
    String intro = "Hello World!!";


    System.out.println(intro);
    System.out.println("\n\n\n");

    System.out.println("Created by " + Dante.name);
    }
}
