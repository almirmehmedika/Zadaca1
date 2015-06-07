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
		g.setFont(new Font("Cambria", Font.BOLD, 24));
		g.drawRect(25, 25, 850, 475);
		g.drawRect(100, 75, 250, 400);
		g.drawRect(400, 75, 250, 400);
		g.drawRect(700, 75, 150, 400);
		g.drawRect(145, 125, 185, 155);
		g.drawRect(145, 300, 185, 70);
		g.drawRect(145, 390, 185, 70);
		g.drawRect(445, 125, 185, 155);
		g.drawRect(445, 300, 185, 70);
		g.drawRect(445, 390, 185, 70);
		g.drawRect(175, 175, 145, 40);
		g.drawRect(175, 230, 145, 40);
		g.drawRect(475, 175, 145, 40);
		g.drawRect(475, 230, 145, 40);
		g.setColor(Color.BLUE);
		g.drawString("java", 30, 45);
		g.drawString("lang", 105, 95);
		g.drawString("awt", 405, 95);
		g.drawString("util", 705, 95);
		g.setColor(Color.green);
		g.setFont(new Font("Cambria", Font.BOLD, 20));
		g.drawString("Math", 150, 155);
		g.drawString("Graphics", 450, 155);
		g.drawString("String", 150, 330);
		g.drawString("Color", 450, 330);
		g.drawString("Integer", 150, 420);
		g.drawString("Font", 450, 420);
		g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.BOLD, 20));
		g.drawString("sqrt()", 220, 200);
		g.drawString("drawRect()", 495, 200);
		g.drawString("random()", 203, 255);
		g.drawString("setColor()", 503, 255);
		// *******************
		w.setImage(img);
	}
}
