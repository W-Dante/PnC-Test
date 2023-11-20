package course.mainMethod;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PlugNCharge {
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

        System.out.println("\n- OEMS: " + Arrays.toString(OEMs));
        System.out.println("\n- EMPs: " + Arrays.toString(EMPs));
        System.out.println("\n- CPOs: " + Arrays.toString(CPOs) + "\n");
        System.out.println("---------------------------------------------------------------" +
                "---------------------------------------------------------------");

        System.out.print("Hubject currently has onboarding organisations. In which section would you like " +
                "to view (OEM / EMP / CPO) : ");
        onboarding = Keyboard.next();
        if (Objects.equals(onboarding, "OEM")){
            System.out.println("\nScania, Renault & Polestar");
        if (Objects.equals(onboarding, "EMP")){
            System.out.println("\nBosch, Plugsurfing, Virta, Monta, Carge");
        if (Objects.equals(onboarding, "CPO")) {
            System.out.println("\nBlink, Zunger Charging Hero, Mer, Sdey, Compleo, TotalEnergies, EVgo, Allego, Vattenfall");
        }}}
        else{
            System.out.println("This is an invalid input.");
            System.exit(0);
        }

    }

    public static void PnC( ){
        System.out.println("Plug&Charge enables fully automatic charging processes." +
                "\nWith automatic authentication technology between the electric vehicle and the charging station,\n" +
                "drivers can connect and charge their EV immediately - without apps or RFID cards.\n");
        System.out.println("---------------------------------------------------------------" +
                "---------------------------------------------------------------");
    }

}
