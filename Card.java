public class Card {
        private int value;
        private String[] stringValue = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        private int suit;
        private String[] suitString = {"Clubs","Hearts","Diamonds","Spades"};
        public Card(int decksuit, int deckvalue){
                this.value = deckvalue;
                this.suit = decksuit;
        }
        public int getValue(){
                return this.value;
        }
        public int getSuit(){
                return this.suit;
        }
        public String getStrCard(){
                String cardInfo = stringValue[value-1] + " of "+ suitString[suit];
                return cardInfo;
        }
        public String getCardImage() {
                String temp;
                if (stringValue[value-1].equals("10")) {
                        temp = "10";
                }else {
                        temp=stringValue[value-1].substring(0,1);
                }
                return temp+suitString[suit];
        }
}
