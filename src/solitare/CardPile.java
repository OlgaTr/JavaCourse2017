package solitare;

import java.awt.Color;
import java.awt.Graphics;

class CardPile {

    // coordinates of the card pile
    protected int x;
    protected int y;
    private Card firstCard;

    CardPile(final int xCoord, final int yCoord) {
        x = xCoord;
        y = yCoord;
        firstCard = null;
    }

    // access to cards are not overridden

    public Card top() {
        return firstCard;
    }

    public boolean empty() {
        return firstCard == null;
    }

    public void push(final Card aCard) {
        aCard.link = firstCard;
        firstCard = aCard;
    }

    public void push(Card start, Card stop) {
        stop.link = firstCard;
        firstCard = start;
    }

    public int getLength() {
        int length = 0;
        for (Card card = top(); card != null; card = card.link) {
            length++;
        }

        return length;
    }

    public Card getCardByIndex(int index) {
        Card result = top();
        for (int i = 0; (i < index) && (result != null); i++) {
            result = result.link;
        }

        return result;
    }

    public void remove(Card card) {

        Card newTop = card.link;

        if (card == firstCard) {
            pop();
        }

        else {
            for (Card curCard = top(); curCard != null; curCard = curCard.link) {
                if (curCard == card) {
                    firstCard = card.link;
                }
            }
        }

        if (newTop != null && !newTop.isFaceUp()) {
            newTop.flip();
        }
    }

    public Card pop() {
        Card result = null;
        if (firstCard != null) {
            result = firstCard;
            firstCard = firstCard.link;
        }
        return result;
    }

    // the following are sometimes overridden

    public boolean includes(final int clickX, final int clickY) {
        return x <= clickX && clickX <= x + Card.width && y <= clickY
                && clickY <= y + Card.height;
    }

    public void select(final int tx, final int ty) {
        // do nothing
    }


    public void display(final Graphics g) {
        g.setColor(Color.black);
        if (firstCard == null) {
            g.drawRect(x, y, Card.width, Card.height);
        } else {
            firstCard.draw(g, x, y);
        }
    }

    public boolean canTake(final Card aCard) {
        return false;
    }

}