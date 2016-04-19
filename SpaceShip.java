package F2;
import java.awt.Color;
import java.awt.Graphics2D;
public class SpaceShip extends Sprite{

	
	
	public SpaceShip(int x, int y, int w, int h) {
		super(x, y, w, h);
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, w, h);
		
	}

}