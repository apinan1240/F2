package F2;
import java.awt.Color;
import java.awt.Graphics2D;
public class SpaceShip extends Sprite{

	int step = 18;
	
	public SpaceShip(int x, int y, int w, int h) {
		super(x, y, w, h);
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(player, x, y, w , h, null);
		
	}

		public void move_X(int direction){
			x += (step * direction);
			if(x < 0)
				x = 0;
			if(x > 400 - w)
				x = 400 - w;
		}

		public void move_Y(int direction){
			y += (step * direction);
			if(y < 0)
				y = 0;
			if(y > 600 - h)
				y = 600 - h;
		}
	
	

}