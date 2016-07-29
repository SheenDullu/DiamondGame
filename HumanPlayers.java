import java.io.*;
import java.util.Scanner;

    public class HumanPlayers {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] userInputs = new int[13];
            String str = "Enter the Amount";
            int tmp = 0;
            for(int i=0; i< 13;i++) {
                tmp = scan.nextInt();
                if(!userInputs.equals(tmp))
                    userInputs[i]= tmp;
                else
                    System.out.println("invalid");
            }

        }
}
