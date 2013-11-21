import java.awt.*;
import java.applet.*;
public class Runner extends Applet{
        private image [] pictures;
        private image [] pictures1;
        private Deck deck;
        private int width = 50;
        private int height = 70;

        public void init() {
                // this.pictures = new image[52];
                // this.pictures1 = new image[52];
                // Card temp;
                // deck = new Deck();
                // // deck.shuffle();
                // for (int i = 0;i < 52; i++) {
                //         temp = deck.dealCard();
                //         pictures[i] = new image(temp.getCardImage());

                // }
                // deck.shuffle();
                // for (int i = 0;i < 52; i++) {
                //         temp = deck.dealCard();
                //         pictures1[i] = new image(temp.getCardImage());

                // }
        }

        public void cardPanel(){
                
        }

        public void paint(Graphics g) {
                // int countrow=0;
                // int x=50;
                // int y=50;
                // for (int i = 0;i < 52;i++) {
                //         if ((i+1)%13==0) {
                //                 x=75+(width*(i%13)+(25*(i%13)));
                //         }else {
                //                 x=75+(width*((i)%13))+(25*((i)%13));
                //         }
                //         if ((i%13==0) && (i>9)) {
                //                 countrow++;
                //         }
                //         y=50+(countrow*height);
                //         pictures[i].draw(g,new Rectangle(x,y,width,height));
                // }
                // countrow=countrow+2;
                // for (int i = 0;i < 52;i++) {
                //         if ((i+1)%13==0) {
                //                 x=75+(width*(i%13)+(25*(i%13)));
                //         }else {
                //                 x=75+(width*((i)%13))+(25*((i)%13));
                //         }
                //         if ((i%13==0) && (i>9)) {
                //                 countrow++;
                //         }
                //         y=50+(countrow*height);
                //         pictures1[i].draw(g,new Rectangle(x,y,width,height));
                // }
        }
}
