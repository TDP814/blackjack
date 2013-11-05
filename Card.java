class Card {
	
	private int number;
	private int suit;
	private int value;

	public Card(int number, int suit){
		this.setNumber(number);
		this.setSuit(suit);
		this.setValue();
	}

	public int number(){
		return this.number;
	}

	public int suit(){
		return this.suit;
	}

	public void setNumber(int number){
		//if (number <= 13 && number >= 1) {
			this.number = number;
		//}
	}

	public void setSuit(int suit){
		this.suit = suit;
	}

	public void reduce(){
		if (this.number ==1) {
			this.value = 1;
		}
	}

	public void setValue(){
		if (this.number < 11 && this.number > 1) {
			this.value = value;
		} else if(this.number > 10 && this.number <= 13){
			this.value = 10;
		} else if(this.number ==1){
			this.value = 11;
		}
	}

	public int value(){
		return this.value;
	}

	public static void main(String[] args) {
		Card c = new Card();
		System.out.println(c.number()+ " "+c.suit()+" "+ c.value());
	}
}