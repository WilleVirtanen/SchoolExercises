import java.util.Scanner;

public class ChallengeSix {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);

        System.out.println("Skriv in nummer få multiplikationstabelen för detta nummer:");
        String userFirstInput = userScanner.nextLine();
        

        int x = Integer.parseInt(userFirstInput);

        System.out.println(x*2);
        System.out.println(x*3);
        System.out.println(x*4);
        System.out.println(x*5);
        System.out.println(x*6);
        System.out.println(x*7);
        System.out.println(x*8);
        System.out.println(x*9);
        System.out.println(x*10);
        

    }

}
