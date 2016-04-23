package F2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;
public class GamePanel extends JPanel{

	private BufferedImage b;
	Graphics2D b1;
	ArrayList<Sprite> sp = new ArrayList<Sprite>();

	public GamePanel(){
		b = new BufferedImage(400, 600,BufferedImage.TYPE_INT_ARGB);
		b1 = (Graphics2D) b.getGraphics();
		b1.setBackground(Color.BLACK);
	}

	public void updateGameUI(GameReporter reporter){
		b1.clearRect(0 ,0 , 400,600);
		b1.setColor(Color.WHITE);
		b1.drawString(String.format("%08d", reporter.getScore()), 300, 20);
		for(Sprite s : sp){
			s.draw(b1);
		}
		repaint();
	}
	@Override
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(b,null,0,0);
	}


}