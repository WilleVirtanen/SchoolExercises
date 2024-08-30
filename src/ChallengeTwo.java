import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);

        System.out.println("input first number:");
        String userFirstInput = userScanner.nextLine();
        System.out.println("Input second number:");
        String userSecondInput = userScanner.nextLine();
        System.out.println("Input third number:");
        String userThirdInput = userScanner.nextLine();

        float x=1,y=1,e=1;

        x = Float.parseFloat(userFirstInput);
        y = Float.parseFloat(userSecondInput);
        e = Float.parseFloat(userThirdInput);

        if(x>y && x>e)
        {
            System.out.println(x +" is biggest");
        }
        else if (y>x && y>e)
        {
            System.out.println(y +" is biggest");
        }
        else if (e>y && e>x)
        {
            System.out.println(e +" is biggest");
        }
        else
        {
            System.out.println("two or more numbers are the same highest value");
        }


    }

}
