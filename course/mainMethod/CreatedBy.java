package course.mainMethod;

public class CreatedBy extends Author{
    public CreatedBy(String name, int age, String nationality, String gender) {
        super(name, age, nationality, gender);
    }

    public static void authorDetails(){
        System.out.println("Some information about the author: ");
    }


    public static void main(String[] args) {
        Author Dante = new Author("Dante", 23, "British Jamaican","Male");
        authorDetails();

        System.out.println(Dante.name + " is the name of the author.");
        System.out.println("The author is " + Dante.age + " years of age.");
        System.out.println(Dante.gender + " is the gender of the author.");
        System.out.println(Dante.nationality + " is the nationality of the author.");

        Dante.sleep();
    }
}
