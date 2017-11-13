import java.awt.Color;
import java.awt.Graphics;
 
 
public class Tree{
    int x;
    int y;
	int x1;
	int y1;
    Color blue;
     
    public Tree(){
        x = (int)(Math.random() * 800);//random 0-800
        y = (int)(Math.random() * 400 +395);//random 0-600
		x1 = (int) (Math.random() * 125);
		y1 = (int) (Math.random() * 125);
		
        blue = new Color(0,255,0);
    }
	public void drawMe(Graphics g)
	{
		g.setColor(blue);
		g.fillRect(x,y,40,50);
	}
	
	public void move()
	{
		y++;
		if(y> 600)
		{
			y =-5;
		}
	}
     
}

