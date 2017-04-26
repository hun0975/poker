package com.edu.cnu.poker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by cse on 2017-04-17.
 */
public class EvaluatorTest {

    @Test
    public void SUIT가_5개가동일하면_플러쉬다() {
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(4,Suit.CLUBS),
                new Card(8,Suit.CLUBS),
                new Card(13,Suit.CLUBS),
                new Card(2,Suit.CLUBS)
        );
        String result = evaluator.evaluate(cardList);
        assertThat(result, is("FLUSH"));
    }
	
	@Test
    public void RANK가_2개가_동일한것이_1세트면_원페어다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.HEARTS),
                new Card(8,Suit.CLUBS),
                new Card(7,Suit.CLUBS),
                new Card(5,Suit.CLUBS)
        );
        String result = evaluator.evaluate_ONEPAIR(cardList);
        assertThat(result, is("ONEPAIR"));

    }
	
	@Test
    public void RANK가_2개가_동일한것이_2세트면_투페어다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.HEARTS),
                new Card(8,Suit.SPADES),
                new Card(8,Suit.CLUBS),
                new Card(7,Suit.HEARTS)
        );
        String result = evaluator.evaluate_TWOPAIR(cardList);
        assertThat(result, is("TWOPAIR"));

    }
	
	@Test
    public void RANK가_3개가_동일한것이_1세트면_트리플이다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.HEARTS),
                new Card(1,Suit.SPADES),
                new Card(8,Suit.CLUBS),
                new Card(7,Suit.HEARTS)
        );
        String result = evaluator.evaluate_TRIPLE(cardList);
        assertThat(result, is("TRIPLE"));

    }
	
	@Test
    public void RANK가_2개가_동일한것이_1세트_3개_동일한것_1세트_모두있으면_풀하우스다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.HEARTS),
                new Card(8,Suit.SPADES),
                new Card(8,Suit.CLUBS),
                new Card(8,Suit.CLUBS)
        );
        String result = evaluator.evaluate_FULLHOUSE(cardList);
        assertThat(result, is("FULLHOUSE"));

    }
	
	@Test
    public void RANK가_4개가_동일한것이_1세트면_포카드다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(1,Suit.HEARTS),
                new Card(1,Suit.SPADES),
                new Card(1,Suit.DIAMONDS),
                new Card(8,Suit.CLUBS)
        );
        String result = evaluator.evaluate_FOURCARD(cardList);
        assertThat(result, is("FOURCARD"));

    }
	
	@Test
    public void RANK가_5개가_연속으로이어지면_스트레이트다(){
        Evaluator evaluator = new Evaluator();
        List<Card> cardList = Arrays.asList(
                new Card(1,Suit.CLUBS),
                new Card(2,Suit.HEARTS),
                new Card(3,Suit.SPADES),
                new Card(4,Suit.DIAMONDS),
                new Card(5,Suit.CLUBS)
        );
        String result = evaluator.evaluate_STRAIGHT(cardList);
        assertThat(result, is("STRAIGHT"));

    }
	
}
