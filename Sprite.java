package F2;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public abstract class Sprite{
	int x , y , w ,h;

	public Sprite(int x ,int y, int w , int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	abstract public void draw(Graphics2D g);
	public Double getRec() {
		return new Rectangle2D.Double(x, y, w, h);
	}

}