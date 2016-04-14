package F2;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main{

	public static void main(String[] args){
		JFrame f = new JFrame("Space War");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 650);
		f.getContentPane().setLayout(new BorderLayout());
		
		GamePanel gp = new GamePanel();
		GameEngine en = new GameEngine(gp);
		f.getContentPane().add(gp, BorderLayout.CENTER);
		f.setVisible(true);
	}



}