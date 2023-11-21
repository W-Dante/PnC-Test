package course.mainMethod;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

//Declaration
public class PlugNCharge extends Protocol{
    public PlugNCharge(String title, String beginning, String V2G) {
        super(title, beginning, V2G);
    }

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        String onboarding;
        PnC();
        String[] OEMs= {"Volkswagen", "Audi", "Porsche", "Skoda", "Cupra", "Lucid", "Mercedes-Benz", "MAN",
                "Genesis","Hyundai","BMW Group", "Kia"};
        String[] EMPs = {"Digital Charging Solutions", "Elli", "Shell Recharge Solutions", "Northe", "Porsche",
                "Deftpower","Ford", "Octopus Electroverse", "EVWAY", "Zunder", "AutoSense", "Stations-e"};
        String[] CPOs = {"Ionity", "BP Pulse", "Electrify America","BayWa", "Shell Recharge Solutions", "EVWAY",
                "Porsche", "Smatric", "Stations-e", "Charzin", "EKOEN"};
        String[] BackendProviders = {"Virta", "Deftpower", "Longship.io", "Grid & Co.", "be ENERGISED", "greenflux",
        "Switch", "Smartic", "EVWAY", "Stations-e", "EKOEN"};
        String[] EVSE = {"Hypercharger", "i-charging", "Kempower", "Autel", "Evtec Quality", "Delta"};

        //PnC Ecosystem Overview
        System.out.printf("%-50s %50s %n","   ","THE PLUG & CHARGE ECOSYSTEM OVERVIEW\n");
        System.out.println("\tOEMs: EV Manufacturers\t\tEMPs: eMobility Providers\t\t" +
                "CPOs: Charge Point Operators\t\tBEPs: Backend Providers\t\tEVSE: Electric Vehicle Supply Equipment");
        System.out.println("\t"+"-".repeat(164) + "\n");
        System.out.println("- OEMS: " + Arrays.toString(OEMs));
        System.out.println("\n- EMPs: " + Arrays.toString(EMPs));
        System.out.println("\n- CPOs: " + Arrays.toString(CPOs));
        System.out.println("\n- BEPs: " + Arrays.toString(BackendProviders));
        System.out.println("\n- EVSE Hardware & Software: " + Arrays.toString(EVSE) + "\n");
        for (int i = 0; i < 170; i++) {
            System.out.print("=");
            try {
                Thread.sleep(30);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");

        //Onboarding Companies @ Hubject
        System.out.print("Hubject currently has onboarding organisations. In which section would you like " +
                "to view (OEM / EMP / CPO / BEP / EVSE) : ");
        onboarding = Keyboard.next().toUpperCase(Locale.ROOT);
        if (Objects.equals(onboarding, "OEM")){
            System.out.println("\nCURRENTLY ONBOARDING:\t Scania, Renault & Polestar\n");}
        else if (Objects.equals(onboarding, "EMP")){
            System.out.println("\nCURRENTLY ONBOARDING:\t Bosch, Plugsurfing, Virta, Monta, Carge\n");
        }
        else if (Objects.equals(onboarding, "CPO")) {
            System.out.println("\nCURRENTLY ONBOARDING:\t Blink, Zunger Charging Hero, Mer, Sdey, Compleo, TotalEnergies, EVgo, Allego, Vattenfall\n");
        }
        else if (Objects.equals(onboarding, "BEP")) {
            System.out.println("\nCURRENTLY ONBOARDING:\t IBIL, Chargecloud, SmartILab, Ampeco\n");
        }
        else if (Objects.equals(onboarding, "EVSE")){
                System.out.println("\nPLUG&CHARGE CAPABLE:\t Chargebyte, Alfen, Porsche, ebee\n");
            }
        else{
            System.out.println("\nThis is an invalid input.");
            System.exit(0);
        }
        for (int i = 0; i < 170; i++) {
            System.out.print("=");
            try {
                Thread.sleep(30);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                System.out.print("\n");
            }
        }

        //ISO15118
        Protocol ISO15118 = new Protocol("\n\n\t\t\tISO15118 -> Road Vehicles - Vehicle to Grid Communication Interface",
                "\nONE OF THE WORLD'S LEADING INTERNATIONAL ELECTRIC VEHICLE STANDARDS\n",
                "\nVEHICLE-TO-GRID -> INTEGRATING EVs INTO THE GRID\n");
        System.out.println(ISO15118.title);
        System.out.println("\t\t"+"-".repeat(74) + "\n");
        System.out.println(ISO15118.beginning);
        System.out.println("The smart charging mechanism built into ISO 15118 makes it possible to perfectly match the grid’s capacity with the energy demand\n " +
                "for the growing number of EVs that connect to the electrical grid. ISO 15118 also enables bidirectional energy transfer in order to realise\n " +
                "vehicle-to-grid applications by feeding energy from the EV back to the grid when needed. ISO 15118 allows for more grid-friendly, secure, and\n " +
                "convenient charging of EVs.");
        System.out.println(ISO15118.V2G);
        System.out.println("ISO 15118 enables the integration of EVs into the smart grid (aka vehicle-2-grid or vehicle-to-grid). A smart grid is an electrical\n " +
                "grid that interconnects energy producers, consumers, and grid components like transformers by means of information and communication technology.\n" +
                "ISO 15118 allows the EV and charging station to dynamically exchange information based on which a proper charging schedule can be (re-)negotiated.\n" +
                "It’s important to make sure electric vehicles operate in a grid-friendly manner. In this case, “grid friendly” means that the device supports the\n" +
                "charging of multiple vehicles at once while preventing the grid from overload. Smart charging applications will calculate an individual charging\n " +
                "schedule for each EV by using the information available about the state of the electrical grid, the energy demand of each EV, and the mobility needs\n" +
                "of each driver (departure time and driving range).\n" +
                "This way, each charging session will perfectly match the capacity of the grid to the electricity demand of simultaneously charging EVs. Charging in\n" +
                "times of high availability of renewable energy and/or in times where the overall electricity usage is low is one of the main use cases that can be\n" +
                "realised with ISO 15118.\n\n");
        for (int i = 0; i < 170; i++) {
            System.out.print("=");
            try {
                Thread.sleep(30);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                System.out.print("\n");
            }
        }
    }

    //Title & Introduction to PnC
    public static void PnC(){
        System.out.println("\n" +
                "  _____  _     _    _  _____         _____ _    _          _____   _____ ______             _    _ _    _ ____       _ ______ _____ _______ \n" +
                " |  __ \\| |   | |  | |/ ____| ___   / ____| |  | |   /\\   |  __ \\ / ____|  ____|    ____   | |  | | |  | |  _ \\     | |  ____/ ____|__   __|\n" +
                " | |__) | |   | |  | | |  __ ( _ ) | |    | |__| |  /  \\  | |__) | |  __| |__      / __ \\  | |__| | |  | | |_) |    | | |__ | |       | |   \n" +
                " |  ___/| |   | |  | | | |_ |/ _ \\/\\ |    |  __  | / /\\ \\ |  _  /| | |_ |  __|    / / _` | |  __  | |  | |  _ < _   | |  __|| |       | |   \n" +
                " | |    | |___| |__| | |__| | (_>  < |____| |  | |/ ____ \\| | \\ \\| |__| | |____  | | (_| | | |  | | |__| | |_) | |__| | |___| |____   | |   \n" +
                " |_|    |______\\____/ \\_____|\\___/\\/\\_____|_|  |_/_/    \\_\\_|  \\_\\\\_____|______|  \\ \\__,_| |_|  |_|\\____/|____/ \\____/|______\\_____|  |_|   \n" +
                "                                                                                   \\____/                                                   \n" +
                "                                                                                                                                            \n");
        System.out.println("Plug & Charge enables fully automatic charging processes." +
                "\nWith automatic authentication technology between the electric vehicle and the charging station," +
                "drivers can connect and charge their EV immediately - without apps or RFID cards.\n\n" +
                "The entire charging process, from authentication to initiation to billing, happens instantly & autonomously.\n" +
                "Your customer's data is always shielded from hacking and fraud by ISO 15118.\n");
        for (int i = 0; i < 170; i++) {
            System.out.print("=");
            try {
                Thread.sleep(30);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");

        PnCProcess();
    }

    //Introduction to PnC Process
    public static void PnCProcess(){
        try{
            System.out.println("How Plug & Charge works: ".toUpperCase(Locale.ROOT));
            System.out.println("-".repeat(25) + "\n");
            Thread.sleep(2000);
            System.out.println("Step 1:\tCommunication between the EV and charging station starts as soon as the plug is inserted into the charging socket.\n");
            Thread.sleep(6000);
            System.out.println("Step 2:\tThe EV's charging contract is identified and matched with its eMobility Service Provider, completing the authentication process.\n");
            Thread.sleep(6000);
            System.out.println("Step 3:\tWithin seconds, the charging session begins.\n");
            Thread.sleep(6000);
            System.out.println("Step 4:\tThe price of the charging session is calculated automatically and an invoice is sent to all parties involved.\n");
            Thread.sleep(6000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        for (int i = 0; i < 170; i++) {
            System.out.print("=");
            try {
                Thread.sleep(30);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }
}

