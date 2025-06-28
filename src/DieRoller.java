import java.util.Random;
import java.util.Scanner;


public class DieRoller {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        String response = "";
        boolean done = false;


        do {
            int die1,die2,die3,sum;
            int dieRoll = 0;
            boolean triple = false;
            System.out.println("Roll     Die1     Die2     Die3     Sum");
            System.out.println("---------------------------------------");
            while(!triple) {
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                dieRoll += 1;
                System.out.printf("%3d %8d %8d %8d %8d\n", dieRoll, die1, die2, die3, sum);
                if (die1 == die2 && die2 == die3) {
                    triple = true;
                }
            }
            System.out.print("Do you want to roll again? (y/ any other key to quit):");
            response = in.nextLine();
            if (!response.equalsIgnoreCase("y")) {
                done = true;
            }
        }while(!done);


    }
}

