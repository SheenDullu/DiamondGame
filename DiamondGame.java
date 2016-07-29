package com.predictor;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by dullus on 7/29/2016.
 */

///import java.util.ArrayList;
public class DiamondGame {
    int moneyGain = 0;
    static int remainingMoney = 104;
    static int [] computerMoney = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    public static void main(String[] args) {

        System.out.println(computerChance(8));

    }

    public static int computerChance(int bidfor)
    {
        int value;
        if(bidfor >1 && bidfor < 8 )
        {
            value = lowestPossible(bidfor, computerMoney);
        }
        else{
            value = highestPossible(bidfor, computerMoney);
        }
        remainingMoney = remainingMoney -  value;
        System.out.println(remainingMoney);
        return value;
    }
    public static int lowestPossible(int bidfor, int [] computerMoney)
    {
        int temp =0;
        for(int i = 0; i< 13 ; i++ )
        {
            if(computerMoney[i] != 0)
            {
                temp = computerMoney[i];
                computerMoney[i] = 0;
                break;
            }

        }
        return temp;

    }
    public static int highestPossible( int bidfor, int [] computerMoney )
    {
        int tmp =0;
        for(int i = 12 ; i >= 0; i--) {
            if (computerMoney[i] != 0) {
                tmp = computerMoney[i];
                computerMoney[i] = 0;
                break;
            }

        }
        return tmp;
    }
}