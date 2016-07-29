package CardsGame2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by malir on 7/29/2016.
 */
public class Diamond {
    public static void main(String[] args) {
        ArrayList<Integer> DiamondCard = new ArrayList<>();
        DiamondCard=shuffle();

        System.out.println(DiamondCard.get(0));
        DiamondCard.remove(0);
        System.out.println(DiamondCard);

    }

    private static ArrayList<Integer> shuffle(){
        ArrayList<Integer> Diamond = new ArrayList<>(13);
        for(int i=2;i<15;++i){
            Diamond.add(i);
        }

        System.out.println(Diamond);
        Collections.shuffle(Diamond);

        return Diamond;
    }
}
