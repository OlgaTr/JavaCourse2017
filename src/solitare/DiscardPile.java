package solitare;

class DiscardPile extends CardPile {

    DiscardPile(int x, int y) {
        super(x, y);
    }

    @Override
    public void push(Card aCard) {
        if (!aCard.isFaceUp()) {
            aCard.flip();
        }
        super.push(aCard);
    }

    @Override
    public void select(int tx, int ty) {
        if (empty()) {
            Solitare.lastTouchedPile = null;
            Solitare.lastTouchedCard = null;

            return;
        }

        Solitare.lastTouchedPile = this;
        Solitare.lastTouchedCard = top();
    }
}
