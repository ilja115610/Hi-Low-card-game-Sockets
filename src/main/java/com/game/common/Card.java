package com.game.common;

/**
 * Use this enum as a start to generate card deck, calculations etc
 */
public enum Card {
    C2(CardSuit.CLUBS, CardValue.TWO),
    C3(CardSuit.CLUBS, CardValue.THREE),
    C4(CardSuit.CLUBS, CardValue.FOUR),
    C5(CardSuit.CLUBS, CardValue.FIVE),
    C6(CardSuit.CLUBS, CardValue.SIX),
    C7(CardSuit.CLUBS, CardValue.SEVEN),
    C8(CardSuit.CLUBS, CardValue.EIGHT),
    C9(CardSuit.CLUBS, CardValue.NINE),
    C10(CardSuit.CLUBS, CardValue.TEN),
    CJ(CardSuit.CLUBS, CardValue.JACK),
    CQ(CardSuit.CLUBS, CardValue.QUEEN),
    CK(CardSuit.CLUBS, CardValue.KING),
    CA(CardSuit.CLUBS, CardValue.ACE),
    D2(CardSuit.DIAMONDS, CardValue.TWO),
    D3(CardSuit.DIAMONDS, CardValue.THREE),
    D4(CardSuit.DIAMONDS, CardValue.FOUR),
    D5(CardSuit.DIAMONDS, CardValue.FIVE),
    D6(CardSuit.DIAMONDS, CardValue.SIX),
    D7(CardSuit.DIAMONDS, CardValue.SEVEN),
    D8(CardSuit.DIAMONDS, CardValue.EIGHT),
    D9(CardSuit.DIAMONDS, CardValue.NINE),
    D10(CardSuit.DIAMONDS, CardValue.TEN),
    DJ(CardSuit.DIAMONDS, CardValue.JACK),
    DQ(CardSuit.DIAMONDS, CardValue.QUEEN),
    DK(CardSuit.DIAMONDS, CardValue.KING),
    DA(CardSuit.DIAMONDS, CardValue.ACE),
    S2(CardSuit.SPADES, CardValue.TWO),
    S3(CardSuit.SPADES, CardValue.THREE),
    S4(CardSuit.SPADES, CardValue.FOUR),
    S5(CardSuit.SPADES, CardValue.FIVE),
    S6(CardSuit.SPADES, CardValue.SIX),
    S7(CardSuit.SPADES, CardValue.SEVEN),
    S8(CardSuit.SPADES, CardValue.EIGHT),
    S9(CardSuit.SPADES, CardValue.NINE),
    S10(CardSuit.SPADES, CardValue.TEN),
    SJ(CardSuit.SPADES, CardValue.JACK),
    SQ(CardSuit.SPADES, CardValue.QUEEN),
    SK(CardSuit.SPADES, CardValue.KING),
    SA(CardSuit.SPADES, CardValue.ACE),
    H2(CardSuit.HEARTS, CardValue.TWO),
    H3(CardSuit.HEARTS, CardValue.THREE),
    H4(CardSuit.HEARTS, CardValue.FOUR),
    H5(CardSuit.HEARTS, CardValue.FIVE),
    H6(CardSuit.HEARTS, CardValue.SIX),
    H7(CardSuit.HEARTS, CardValue.SEVEN),
    H8(CardSuit.HEARTS, CardValue.EIGHT),
    H9(CardSuit.HEARTS, CardValue.NINE),
    H10(CardSuit.HEARTS, CardValue.TEN),
    HJ(CardSuit.HEARTS, CardValue.JACK),
    HQ(CardSuit.HEARTS, CardValue.QUEEN),
    HK(CardSuit.HEARTS, CardValue.KING),
    HA(CardSuit.HEARTS, CardValue.ACE);

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
