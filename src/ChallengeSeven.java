import java.util.Scanner;

public class ChallengeSeven {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);

        System.out.println("Skriv en siffra mellan 1-9 så bygger vi en pyramid:");
        String userFirstInput = userScanner.nextLine();
        
        boolean repeat = true;
        
        String space = " ";

        int x = Integer.parseInt(userFirstInput);
        int y = x;
        if(x>=1)
        {
            while(y>1)
            {
                System.out.print(space);
                y--;
            }
            System.out.print("1");
            System.err.println("");
            y=x-1;
        }
        if(x>=2)
        {
            while(y>1)
            {
                System.out.print(space);
                y--;
            }
            System.out.print("2 ");
            System.out.print("2");
            System.err.println("");
            y=x-2;
        }
        if(x>=3)
        {
            while(y>1)
            {
                System.out.print(space);
                y--;
            }
            System.out.print("3 ");
            System.out.print("3 ");
            System.out.print("3 ");
            System.err.println("");
            y=x-3;
        }
        if(x>=4)
        {
            while(y>1)
            {
                System.out.print(space);
                y--;
            }
            System.out.print("4 ");
            System.out.print("4 ");
            System.out.print("4 ");
            System.out.print("4 ");
            System.err.println("");
            y=x-4;
        }
        if(x>=5)
        {
            while(y>1)
            {
                System.out.print(space);
                y--;
            }
            System.out.print("5 ");
            System.out.print("5 ");
            System.out.print("5 ");
            System.out.print("5 ");
            System.out.print("5 ");
            System.err.println("");
            y=x-5;
        }
        if(x>=6)
        {
            while(y>1)
            {
                System.out.print(space);
                y--;
            }
            System.out.print("6 ");
            System.out.print("6 ");
            System.out.print("6 ");
            System.out.print("6 ");
            System.out.print("6 ");
            System.out.print("6 ");
            System.err.println("");
            y=x-6;
        }
        if(x>=7)
        {
            while(y>1)
            {
                System.out.print(space);
                y--;
            }
            System.out.print("7 ");
            System.out.print("7 ");
            System.out.print("7 ");
            System.out.print("7 ");
            System.out.print("7 ");
            System.out.print("7 ");
            System.out.print("7 ");
            System.err.println("");
            y=x-7;
        }
        if(x>=8)
        {
            while(y>1)
            {
                System.out.print(space);
                y--;
            }
            System.out.print("8 ");
            System.out.print("8 ");
            System.out.print("8 ");
            System.out.print("8 ");
            System.out.print("8 ");
            System.out.print("8 ");
            System.out.print("8 ");
            System.out.print("8 ");
            System.err.println("");
            y=x-8;
        }
        if(x>=9)
        {
            while(y>1)
            {
                System.out.print(space);
                y--;
            }
            System.out.print("9 ");
            System.out.print("9 ");
            System.out.print("9 ");
            System.out.print("9 ");
            System.out.print("9 ");
            System.out.print("9 ");
            System.out.print("9 ");
            System.out.print("9 ");
            System.out.print("9 ");
            System.err.println("");
            y=x-9;
        }
        if(x>9)
        {
            System.out.println("Det där var girigt!");
        }
    }

}
