package F2;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main{

	public static void main(String[] args){
		JFrame f = new JFrame("Space War");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 650);
		f.getContentPane().setLayout(new BorderLayout());
		
		SpaceShip v = new SpaceShip(180, 550, 20, 20);
		GamePanel gp = new GamePanel();
		GameEngine en = new GameEngine(gp, v);
		f.addKeyListener(en);
		f.getContentPane().add(gp, BorderLayout.CENTER);
		f.setVisible(true);
		en.start();
	}



}