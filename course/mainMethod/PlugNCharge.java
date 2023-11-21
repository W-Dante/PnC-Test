package course.mainMethod;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

//Declaration
public class PlugNCharge extends Protocol{
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
        System.out.println("\t"+"-".repeat(160) + "\n");
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

        //ISO15118
        for (int i = 0; i < 170; i++) {
            System.out.print("=");
            try {
                Thread.sleep(30);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                System.out.print("\n");
            }
            //new Protocol();
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
            System.out.println("This is how Plug & Charge works: ".toUpperCase(Locale.ROOT));
            System.out.println("-".repeat(60) + "\n");
            Thread.sleep(6000);
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

