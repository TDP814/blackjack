class Hand {
	
	private Card[] hand = new Card[11];
	private int cardsInHand;
	private int totalValue;

	public Hand(Card c1, Card c2){
		this.hand[0] = c1;
		this.hand[1] = c2;
		this.cardsInHand = 2;
		totalValue = c1.value() + c2.value();
	}

	public void hit(){
		this.hand[cardsInHand] = Deck.deal();
		this.totalValue += this.hand[cardsInHand].value();
		cardsInHand++;
	}

	public void stay(){

	}

	public static void main(String[] args) {
		Deck d = new Deck();
		Hand h = new Hand();
	}

}