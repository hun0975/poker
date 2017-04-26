package com.edu.cnu.poker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cse on 2017-04-17.
 */
public class Evaluator {
    public String evaluate(List<Card> cardList) {
        Map<Suit, Integer> tempMap = new HashMap<Suit, Integer>();

        for (Card card : cardList) {
            if (tempMap.containsKey(card.getSuit())) {
                Integer count = tempMap.get(card.getSuit());
                count = new Integer(count.intValue() + 1);
                tempMap.put(card.getSuit(), count);
            } else {
                tempMap.put(card.getSuit(), new Integer(1));
            }
        }

        for (Suit key : tempMap.keySet()) {
            if (tempMap.get(key) == 5) {
                return "FLUSH";
            }
        }
        return "NOTHING";
    }
	
	public String evaluate_ONEPAIR(List<Card> cardList){
        Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
        int one =0;

        for (Card card : cardList) {
            if (tempMap.containsKey(card.getRank())) {
                Integer count = tempMap.get(card.getRank());
                count = new Integer(count.intValue() + 1);
                tempMap.put(card.getRank(), count);
            } else {
                tempMap.put(card.getRank(), new Integer(1));
            }
        }
        for (Integer key : tempMap.keySet()) {
            if (tempMap.get(key) == 2) {
                one = one + 1;
            }
        }
        if(one == 1)
        {
            return "ONEPAIR";
        }
        else{
            return  "NOTHING";
        }
    }
	
	public String evaluate_TWOPAIR(List<Card> cardList){
        Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
        int one =0;

        for (Card card : cardList) {
            if (tempMap.containsKey(card.getRank())) {
                Integer count = tempMap.get(card.getRank());
                count = new Integer(count.intValue() + 1);
                tempMap.put(card.getRank(), count);
            } else {
                tempMap.put(card.getRank(), new Integer(1));
            }
        }

        for (Integer key : tempMap.keySet()) {
            if (tempMap.get(key) == 2) {
                one = one + 1;
            }
        }
        if(one == 2)
        {
            return "TWOPAIR";
        }
        else{
            return  "NOTHING";
        }
    }
	
	public String evaluate_TRIPLE(List<Card> cardList){
        Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
        int one =0;

        for (Card card : cardList) {
            if (tempMap.containsKey(card.getRank())) {
                Integer count = tempMap.get(card.getRank());
                count = new Integer(count.intValue() + 1);
                tempMap.put(card.getRank(), count);
            } else {
                tempMap.put(card.getRank(), new Integer(1));
            }
        }

        for (Integer key : tempMap.keySet()) {
            if (tempMap.get(key) == 3) {
                one = one + 1;
            }
        }
        if(one == 1)
        {
            return "TRIPLE";
        }
        else{
            return  "NOTHING";
        }
    }
	
	public String evaluate_FULLHOUSE(List<Card> cardList){
        Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
        int one =0;
        int two = 0;
        for (Card card : cardList) {
            if (tempMap.containsKey(card.getRank())) {
                Integer count = tempMap.get(card.getRank());
                count = new Integer(count.intValue() + 1);
                tempMap.put(card.getRank(), count);
            } else {
                tempMap.put(card.getRank(), new Integer(1));
            }
        }

        for (Integer key : tempMap.keySet()) {
            if (tempMap.get(key) == 3) {
                one = one + 1;
            }
            if (tempMap.get(key) == 2){
                two = two + 1;
            }
        }
        if(one == 1 & two ==1)
        {
            return "FULLHOUSE";
        }
        else{
            return  "NOTHING";
        }
    }
	
	
	
}
