import java.util.Scanner;

public class ChallengeThree {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);

        System.out.println("input first number:");
        String userFirstInput = userScanner.nextLine();
        float x=1;

        x = Float.parseFloat(userFirstInput);

        if(x==0)
        {
            System.out.println("0");
        }
        else if(x>0)
        {
            if(x>1000000)
            {
                System.out.print("Stort ");
            }
            System.out.println("posetiv");
        }
        else if(x<0)
        {
            System.out.println("Litet Negativ");
        }
    }

}
