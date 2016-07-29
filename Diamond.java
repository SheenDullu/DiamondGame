package CardsGame2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by malir on 7/29/2016.
 */
public class Diamond {
    public static void main(String[] args) {
        ArrayList<Integer> humanBid = new ArrayList<>(13);
        ArrayList<Integer> computerBid=new ArrayList<>(13);

        humanBid=shuffle();
        computerBid=shuffle();

        ArrayList<Integer> diamonds=new ArrayList<>();
        diamonds=shuffle();
        
        CalculateScore(diamonds,humanBid,computerBid);

    }

    private static ArrayList<Integer> shuffle(){
        ArrayList<Integer> Diamond = new ArrayList<>(13);
        for(int i=2;i<15;++i){
            Diamond.add(i);
        }
        Collections.shuffle(Diamond);

        return Diamond;
    }

    public static void CalculateScore(ArrayList<Integer> diamondValue,ArrayList<Integer> humanBid,ArrayList<Integer> compBid){

        int humanScore=0;
        int computerScore=0;

        for(int i=0;i<13;++i){
            if(humanBid.get(i)>compBid.get(i)){
                humanScore=humanScore + diamondValue.get(i);
            }else if (humanBid.get(i)<compBid.get(i)){
                computerScore=computerScore+diamondValue.get(i);
            } else {
                humanScore=diamondValue.get(i)/2;
                computerScore=diamondValue.get(i)/2;
            }
        }
        System.out.println("human"+ humanScore);
        System.out.println("Computer"+computerScore);
        if(humanScore>computerScore){
            System.out.println("You win");
        } else if(humanScore<computerScore){
            System.out.println("Computer wins");
        } else {
            System.out.println("Tie");
        }
    }
}
