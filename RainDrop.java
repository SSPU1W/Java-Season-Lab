import java.awt.Color;
import java.awt.Graphics;
 
 
public class RainDrop{
    int x;
    int y;
    Color blue;
     
    public RainDrop(){
        x = (int)(Math.random() * 801);//random 0-800
        y = (int)(Math.random() * 601);//random 0-600
        blue = new Color(0,0,255);
    }
	public void drawMe(Graphics g)
	{
		g.setColor(blue);
		g.fillRect(x,y,2,5);
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
