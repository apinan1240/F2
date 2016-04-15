package F2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Timer;

public class GameEngine{
	GamePanel gp;
	private ArrayList<Enemy> en = new ArrayList<Enemy>();
	
	private Timer time;
	private double diff = 0.1;

	public GameEngine(GamePanel gp){
		this.gp = gp;
		time = new Timer(50, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				process();
			}
		});
		time.setRepeats(true);
	}
	public void start(){
		time.start();
	}
	private void generateEnemy(){
		Enemy e = new Enemy(100,50);
		gp.sp.add(e);
		en.add(e);
	}
	private void process(){
		if(Math.random() < diff){
			generateEnemy();	
		}
		Iterator<Enemy> e_iter = en.iterator();
		while(e_iter.hasNext()){
			Enemy e = e_iter.next();
			e.proceed();
			if(!e.isAlive()){
				e_iter.remove();
				gp.sp.remove(e);
			}
		}
		gp.updateGameUI();
		Rectangle2D.Double er;
		for(Enemy e : en){
			er = e.getRec();
			
		}
	
	}

}