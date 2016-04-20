package F2;
import java.awt.Color;
import java.awt.Graphics2D;
public class SpaceShip extends Sprite{

	int step = 8;
	
	public SpaceShip(int x, int y, int w, int h) {
		super(x, y, w, h);
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, w, h);
		
	}

	public void move(int direction){
		x += (step * direction);
		if(x < 0)
			x = 0;
		if(x > 400 - w)
			x = 400 - w;
	}

}