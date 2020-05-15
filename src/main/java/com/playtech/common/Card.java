package com.playtech.common;

import static com.playtech.common.CardSuit.CLUBS;
import static com.playtech.common.CardSuit.DIAMONDS;
import static com.playtech.common.CardSuit.HEARTS;
import static com.playtech.common.CardSuit.SPADES;

/**
 * Use this enum as a start to generate card deck, calculations etc
 */
public enum Card {
    C2(CLUBS, CardValue.TWO),
    C3(CLUBS, CardValue.THREE),
    C4(CLUBS, CardValue.FOUR),
    C5(CLUBS, CardValue.FIVE),
    C6(CLUBS, CardValue.SIX),
    C7(CLUBS, CardValue.SEVEN),
    C8(CLUBS, CardValue.EIGHT),
    C9(CLUBS, CardValue.NINE),
    C10(CLUBS, CardValue.TEN),
    CJ(CLUBS, CardValue.JACK),
    CQ(CLUBS, CardValue.QUEEN),
    CK(CLUBS, CardValue.KING),
    CA(CLUBS, CardValue.ACE),
    D2(DIAMONDS, CardValue.TWO),
    D3(DIAMONDS, CardValue.THREE),
    D4(DIAMONDS, CardValue.FOUR),
    D5(DIAMONDS, CardValue.FIVE),
    D6(DIAMONDS, CardValue.SIX),
    D7(DIAMONDS, CardValue.SEVEN),
    D8(DIAMONDS, CardValue.EIGHT),
    D9(DIAMONDS, CardValue.NINE),
    D10(DIAMONDS, CardValue.TEN),
    DJ(DIAMONDS, CardValue.JACK),
    DQ(DIAMONDS, CardValue.QUEEN),
    DK(DIAMONDS, CardValue.KING),
    DA(DIAMONDS, CardValue.ACE),
    S2(SPADES, CardValue.TWO),
    S3(SPADES, CardValue.THREE),
    S4(SPADES, CardValue.FOUR),
    S5(SPADES, CardValue.FIVE),
    S6(SPADES, CardValue.SIX),
    S7(SPADES, CardValue.SEVEN),
    S8(SPADES, CardValue.EIGHT),
    S9(SPADES, CardValue.NINE),
    S10(SPADES, CardValue.TEN),
    SJ(SPADES, CardValue.JACK),
    SQ(SPADES, CardValue.QUEEN),
    SK(SPADES, CardValue.KING),
    SA(SPADES, CardValue.ACE),
    H2(HEARTS, CardValue.TWO),
    H3(HEARTS, CardValue.THREE),
    H4(HEARTS, CardValue.FOUR),
    H5(HEARTS, CardValue.FIVE),
    H6(HEARTS, CardValue.SIX),
    H7(HEARTS, CardValue.SEVEN),
    H8(HEARTS, CardValue.EIGHT),
    H9(HEARTS, CardValue.NINE),
    H10(HEARTS, CardValue.TEN),
    HJ(HEARTS, CardValue.JACK),
    HQ(HEARTS, CardValue.QUEEN),
    HK(HEARTS, CardValue.KING),
    HA(HEARTS, CardValue.ACE);

    private final CardSuit suit;
    private final CardValue value;

    Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return value;
    }
}
