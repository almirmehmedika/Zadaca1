package package3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		//The initial coordinates of the rectangle
		int x1 = 100;
		int y1 = 100;
		int x2 = 50;
		int y2 = 50;
		int x = 120;//Variable to move the random numbers
		//Print text
		g.drawString("An array of numbers", 270 , 90);
		g.drawString("Type: int", 315 , 170);
		//Loop for print 10 rectangles
		for(int i = 1; i <= 10; i++){
			g.drawRect(x1, y1, x2, y2);
			x1 += 50;
			int randomNum  = (int)(Math.random()*10);
			String randomString = "" + randomNum;//string=string+int
			g.drawString(randomString, x, 130);//printing random numbers in to rectangles
			x += 50;//Moving random numbers in to next rectangle
		}
		
		
		
		
		
		
		// *******************
		w.setImage(img);
	}
}
