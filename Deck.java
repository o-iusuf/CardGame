
public class Deck {
	private String deckName;
	private int deckID;
	private PlayingCard[] deckCards = new PlayingCard[52];
	
	public Deck(String deckName, int deckID) {
		this.deckName = deckName;
		this.deckID = deckID;
		
		for (int rank = PlayingCard.DEUCE; rank <= PlayingCard.ACE; rank ++) {
			for (int suit = PlayingCard.CLUBS; suit <= PlayingCard.SPADES; suit++) {
				deckCards[rank - 2 + (suit - 1) * 13] = new PlayingCard(rank, suit);
			}
		}
	}
}
