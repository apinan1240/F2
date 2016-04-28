package F2;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.io.IOException;					
import java.awt.image.BufferedImage;

public abstract class Sprite{
	int x;
	int y;
	int w;
	int h;
	private BufferedImage sheetP = null;
 	private SpriteSheet ssp;
 	BufferedImage player;

	public Sprite(int x ,int y, int w , int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;

		BufferedImageLoader loaderP = new BufferedImageLoader();
 		
 		try{
 			sheetP = loaderP.loadImage("/F2/Pictures/ship.png");
 		}catch(IOException e){
 			e.printStackTrace();
 		}
 		ssp = new SpriteSheet(sheetP);
 		player = ssp.grabImage(1 , 1, 94, 100);

	}
	abstract public void draw(Graphics2D g);
	public Double getRec() {
		return new Rectangle2D.Double(x, y, w, h);
	}

}