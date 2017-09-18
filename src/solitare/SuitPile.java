package solitare;

class SuitPile extends CardPile {

    SuitPile(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canTake(Card aCard) {
        if (empty()) {
            return aCard.getRank() == 0;
        }
        Card topCard = top();
        return (aCard.getSuit() == topCard.getSuit())
                && (aCard.getRank() == 1 + topCard.getRank());
    }

    @Override
    public void select(int tx, int ty) {
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
    }
}
