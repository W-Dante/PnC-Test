package course.mainMethod;

public class HomePageIntro extends Author{
    public HomePageIntro(String name, int age, String nationality, String gender) {
        super(name, age, nationality, gender);
    }

    public static void main(String[] args) {
        HPIntro();
    }
/*
String[] border = {".",".",".",".",".",".",".",".",".",".",".",".",".","."};
System.out.print(border);
*/
    public static void HPIntro(){
        System.out.print("This is a test Project based my knowledge of Git, Github &  Java." +
                "\nIf there are any bugs, then write a ticket or a note beside it.");
    }
}
