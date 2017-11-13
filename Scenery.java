import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Font;
 
public class Scenery extends JPanel{
	RainDrop[] rain;
	Tree [] tree; 
	double angle;
    double pi;
	
	public Scenery()
	{
        angle = 0;
        pi = 3.14;
		rain = new RainDrop[100];
		for(int i = 0;i < rain.length; i++)
		{
			rain[i] = new RainDrop(); 
		}
		tree = new Tree[10];
		for(int t = 0; t < tree.length; t++)
		{
			tree[t] = new Tree();
		}
		
	}
 
     
    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(800,600);
    }
	
 
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Color red = new Color(247, 108, 108);
        Color orange = new Color(255, 183, 68); 
        Color yellow = new Color(242, 237, 101); 
        Color green = new Color(24, 109, 54); 
        Color blue = new Color(87, 229, 222); 
        Color black = new Color(0, 0, 0); 
        Color white = new Color(255, 255, 255); 
        Color grey = new Color(154, 159, 168); 
        Font font = new Font("Helvetica", Font.BOLD, 35);
        if( (int)(400 + 500 * Math.cos(angle)) <= 340 )
        {
            g.setColor(blue);
            g.fillRect(0, 0, 800, 600); 
            g.setColor(yellow); 
            g.fillOval((int)(400 + 500 * Math.sin(angle)), (int)(400 + 450 * Math.cos(angle)), 75, 75);
            g.setColor(green);
            g.fillRect(0, 350, 800, 450); 
            g.setFont(font);
            g.setColor(white);
            g.setColor(grey); 
           // g.fillRect(0, 500, 800, 50);
            g.fillRect(0, 650, 800, 50);
			g.setColor(yellow);
			g.setFont(font);
			g.drawString("Summer!", 372, 160);
			g.setColor(grey);
            int[] xRoad = new int[4];
            int[] yRoad = new int[4];
            xRoad[0] = 300;
            yRoad[0] = 800;
            xRoad[1] = 350;
            yRoad[1] = 800;
            xRoad[2] = 650;
            yRoad[2] = 350;
            xRoad[3] = 600;
            yRoad[3] = 350;
            g.setColor(grey);
            g.fillPolygon(xRoad, yRoad, 4);
			for(int t = 0; t < tree.length;t++)
			{
				tree[t].drawMe(g);
			}

        }
        else 
        {
            g.setColor(grey);
            g.fillRect(0, 0, 800, 600); 
            g.setColor(white); 
            g.fillOval((int)(400 - 500 * Math.sin(angle)), (int)(400 - 450 * Math.cos(angle)), 75, 75);
            g.setColor(green);
            g.fillRect(0, 350, 800, 450); 
            g.setFont(font);
			g.setColor(black);
            g.setColor(grey);
            //g.fillRect(0, 500, 800, 50);
            g.fillRect(0, 650, 800, 50);
			g.setColor(blue);
			g.setFont(font);
			g.drawString("Spring!", 372, 160);
			g.setColor(grey);
            int[] xRoad = new int[4];
            int[] yRoad = new int[4];
            xRoad[0] = 300;
            yRoad[0] = 800;
            xRoad[1] = 350;
            yRoad[1] = 800;
            xRoad[2] = 650;
            yRoad[2] = 350;
            xRoad[3] = 600;
            yRoad[3] = 350;
            g.setColor(grey);
            g.fillPolygon(xRoad, yRoad, 4);
			for(int i=0; i< rain.length;i++)
			{
				rain[i].drawMe(g);
			}
        }
         
        g.setColor(yellow);
        g.fillRect(0, 751, 800, 300);

		 
		
     
         
    }
 
    public void animate(){
        while(true)
        {
			angle+=0.0066; 
			for(int i =0; i < rain.length; i++)
			{
				rain[i].move();
			}
            //wait for .01 second
            try {
                Thread.sleep(10);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
 
            //repaint the graphics drawn
            repaint();
        }
 
    }
     
     
     
}
