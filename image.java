import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class image {
        public String name;
        private Image cardImage;
        public image(String name) {
                this.name=name;
                this.cardImage = image.loadImage(name);
        }
        public void draw(Graphics g, Rectangle r) {
                g.drawImage(image, r.x, r.y, r.width, r.height, null);
        }
        private static Image loadImage(String name) {
                String path = null;
                Image cardImage = null;

        
                try{
                path = "cards" + File.separator + name + ".png";        
                File file = new File(path);
                cardImage = ImageIO.read(file);
                }catch (IOException e) {
                        System.out.println("Could not load image at path" + path);
                        System.exit(1);

                
                }
        return cardImage;}
}