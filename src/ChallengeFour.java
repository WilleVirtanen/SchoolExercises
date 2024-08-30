import java.util.Scanner;

public class ChallengeFour {
public static void main(String[] args) {
    Scanner userScanner = new Scanner(System.in);

        System.out.println("Skriv in vilket nummer mellan 1-7 du vill veta veckodagen för:");
        String userFirstInput = userScanner.nextLine();
        
        int x = Integer.parseInt(userFirstInput);
        switch(x) 
        {
            case 1 -> System.out.println("Måndag");
            case 2 -> System.out.println("Tisdag");
            case 3 -> System.out.println("Onsdag");
            case 4 -> System.out.println("Torsdag");
            case 5 -> System.out.println("Fredag");
            case 6 -> System.out.println("Lördag");
            case 7 -> System.out.println("Söndag");
            

            default -> System.out.println("Inte ett vecko nummer!");
        }
    }
}
