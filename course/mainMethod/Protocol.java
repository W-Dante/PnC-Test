package course.mainMethod;

public class Protocol extends OpenPnCLink{
        public String title;
        public String beginning;
        public String V2G;

    public static void main(String[] args) {
OpenPnCLink website = new OpenPnCLink();
        System.out.println(website);
    }



    public Protocol(String title, String beginning, String V2G) {
        super();
        //String title = "\nISO15118 -> Road Vehicles - Vehicle to Grid Communication Interface\n\n";
        this.title = title;
        this.beginning = beginning;
        this.V2G = V2G;

    }

}



