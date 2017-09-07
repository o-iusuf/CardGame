public class PlayingCard {
	private final int rank;
    private final int suit;

    // Kinds of suits, default ranking of suits
    public final static int CLUBS    = 1;
    public final static int DIAMONDS = 2;
    public final static int HEARTS   = 3;
    public final static int SPADES   = 4;

    // Kinds of ranks, default ranking of ranks
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR  = 4;
    public final static int FIVE  = 5;
    public final static int SIX   = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE  = 9;
    public final static int TEN   = 10;
    public final static int JACK  = 12;
    public final static int QUEEN = 13;
    public final static int KING  = 14;
    public final static int ACE   = 15;
    
    public PlayingCard(int rank, int suit) {
        if (isValidRank(rank) && isValidSuit(suit)) {
        	this.rank = rank;
        	this.suit = suit;
        } else {
        	this.rank = 0;
        	this.suit = 0;
        };
    }
    
    private boolean isValidRank(int rank) {
    	return DEUCE <= rank && ACE >= rank; 
    }
    
    private boolean isValidSuit(int suit) {
    	return CLUBS <= suit && SPADES >= suit;
    }
    
    public static String rankToString(int rank) {
        switch (rank) {
        case ACE:
            return "Ace";
        case DEUCE:
            return "Deuce";
        case THREE:
            return "Three";
        case FOUR:
            return "Four";
        case FIVE:
            return "Five";
        case SIX:
            return "Six";
        case SEVEN:
            return "Seven";
        case EIGHT:
            return "Eight";
        case NINE:
            return "Nine";
        case TEN:
            return "Ten";
        case JACK:
            return "Jack";
        case QUEEN:
            return "Queen";
        case KING:
            return "King";
        default:
            return null;
        }    
    }
    
    public static String suitToString(int suit) {
        switch (suit) {
        case DIAMONDS:
            return "Diamonds";
        case CLUBS:
            return "Clubs";
        case HEARTS:
            return "Hearts";
        case SPADES:
            return "Spades";
        default:
            return null;
        }    
    }

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}
    
    

}