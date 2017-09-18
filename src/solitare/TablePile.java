package solitare;

import java.awt.*;

class TablePile extends CardPile {

    TablePile(int x, int y, int c) {
        // initialize the parent class
        super(x, y);
        // then initialize our pile of cards
        for (int i = 0; i < c; i++) {
            push(Solitare.deckPile.pop());
        }
        // flip topmost card face up
        top().flip();
    }

    @Override
    public boolean canTake(Card aCard) {
        if (empty()) {
            return aCard.getRank() == 12;
        }
        Card topCard = top();
        return (aCard.getColor() != topCard.getColor())
                && (aCard.getRank() == topCard.getRank() - 1);
    }

    @Override
    public boolean includes(int tx, int ty) {
        // don't test bottom of card
        return x <= tx && tx <= x + Card.width && y <= ty;
    }

    @Override
    public void select(int tx, int ty) {

        // if face down, then flip
        Card topCard = top();
        if (!topCard.isFaceUp()) {
            topCard.flip();
            return;
        }

        if ( (Solitare.lastTouchedCard != null) &&
                (Solitare.lastTouchedPile != this) &&
                canTake(Solitare.lastTouchedCard) ) {
            Card firstPileCard = Solitare.lastTouchedPile.top();

            Solitare.lastTouchedPile.remove(Solitare.lastTouchedCard);

            push(firstPileCard, Solitare.lastTouchedCard);

            Solitare.lastTouchedCard = null;
            Solitare.lastTouchedPile = null;

            return;
        }

        if (empty()) {
            Solitare.lastTouchedPile = null;
            Solitare.lastTouchedCard = null;

            return;
        }

        int chosenCardIndex = getCardIndex(ty);

        Solitare.lastTouchedPile = this;
        Solitare.lastTouchedCard = getCardByIndex(chosenCardIndex);

    }

    private int getCardIndex(int ty) {
        int pileSize = getLength();
        int index = (ty - y) / 35;
        return pileSize - index - 1;
    }

    private int stackDisplay(Graphics g, Card aCard) {
        int localy;
        if (aCard == null) {
            return y;
        }
        localy = stackDisplay(g, aCard.link);
        aCard.draw(g, x, localy);
        return localy + 35;
    }

    @Override
    public void display(Graphics g) {
        stackDisplay(g, top());
    }

}