import java.util.ArrayList;

public abstract class CardGame {
	private String gameName;
	private int numPlayersMin;
	private int numPlayersMax;
	private int numRoundsMin;
	private int numRoundsMax;
	private boolean dealerGame;
	private ArrayList<Player> playerList;
	
	public CardGame(String gameName, int numPlayersMin, int numPlayersMax, int numRoundsMin, int numRoundsMax, boolean dealerGame) {
		this.gameName = gameName;
		this.numPlayersMin = numPlayersMin;
		this.numPlayersMax = numPlayersMax;
		this.numRoundsMin = numRoundsMin;
		this.numRoundsMax = numRoundsMax;
		this.dealerGame = dealerGame;
	}
	
	public boolean addPlayer(String playerName) {
		boolean addPlayerResult = false;
		addPlayerResult = this.playerList.add(new Player(playerName));
		return addPlayerResult;
	}
	
	public boolean removePlayer() {
		boolean removePlayerResult = false;
		
		return removePlayerResult;
		
	}
	
}
