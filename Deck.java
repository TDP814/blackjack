import java.util.Random;

class Deck {
	
	private Card[] cards = new Card[52];
	private Random r = new Random();

	public Deck(Card[] cards){
		for (int i=0; i<cards.length; i++) {
			cards[i].setNumber((i % 13)+1);
			if (i<13) {
				cards[i].setSuit(1);
			} else if(i<26){
				cards[i].setSuit(2);
			} else if(i<39){
				cards[i].setSuit(3);
			} else{
				cards[i].setSuit(4);
			}
		}
		card = -1;
	}

	public void print(){
		for (int i=0; i<cards.length; i++) {
			if (cards[i].suit()==1) {
				System.out.println(cards[i].number()+" of hearts ");
			} else if(cards[i].suit()==2){
				System.out.println(cards[i].number()+" of spades ");
			} else if(cards[i].suit()==3){
				System.out.println(cards[i].number()+" of diamonds ");
			} else{
				System.out.println(cards[i].number()+" of clubs ");
			}
		}
	}

	public void shuffle(){
		int n;
		Card temp;
		for (int i=0; i<cards.length; i++) {
			n=r.nextInt(51);
			temp = cards[n];
			cards[n] = cards[i];
			cards[i] = temp;
		}
	}

}