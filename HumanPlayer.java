package CardsGame2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> humanBid=new ArrayList<>();

        int tmp = 0;
        for(int i=0; i< 13;i++) {
            System.out.println("Enter the Amount");

            tmp = scan.nextInt();
            if(ifValid(tmp,humanBid)){
                humanBid.add(tmp);
            } else {
                System.out.println("Invalid input");
            }

        }

    }

    public static boolean ifValid(int value,ArrayList<Integer> bidList) {
        for(int i=0;i<bidList.size();++i){
            if(bidList.get(i)==value){
                return false;
            }
        }
        return true;
    }
}
