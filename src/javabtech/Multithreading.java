package javabtech;
//Write a java program to make animated board using multi-threading
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Multithreading extends JPanel implements Runnable {
	protected Thread banner;
	protected String text;
	protected Font font;
	protected int width;
	protected int height;
	protected int x, y;
	protected int delay;
	protected int offset;
	protected Dimension size;
	protected Image image;
	protected Graphics offScreen;

	public Multithreading(int aWidth, int aHeight) {
		width = aWidth;
		height = aHeight;
		setSize(width, height);
		text = new String("Welcome to RSCOE");
		font = new Font("Sans-serif", Font.BOLD, 24);
		delay = 100;

		x = width / 2;
		y = height / 2;
		offset = 1;

		banner = new Thread(this);
		banner.start();
	}

	public void paintComponent(Graphics g) {
		size = this.getSize();
		if (image == null) {
			image = createImage(size.width, size.height);
			offScreen = image.getGraphics();
		}
		offScreen.setFont(font);
		FontMetrics fm = g.getFontMetrics();
		int length = fm.stringWidth(text);
		x = x - offset;
		if (x < -length)
			x = size.width;
		offScreen.setColor(Color.black);
		offScreen.fillRect(0, 0, size.width, size.height);
		offScreen.setColor(Color.red);
		offScreen.drawString(text, x, y);
		g.drawImage(image, 0, 0, this);
	}

	public void update(Graphics g) {
		paintComponent(g);
	}

	public void run() {
		while (Thread.currentThread() == banner) {
			repaint();
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				System.out.println("Exception: " + e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Scrolling Banner");
		Multithreading panel = new Multithreading(400, 400);
		frame.getContentPane().add(panel);
		frame.setSize(panel.width, panel.height);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});
	}
}