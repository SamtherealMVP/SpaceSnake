package view.Figures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class BlackHole 
extends GameFigure {

	public BlackHole(double x, double y, double size, JComponent parent){
		super(x, y, size, parent);
		setColor(new Color(0,0,0));
	}

    /**
     * Paints itself.
     * @param g
     */
    @Override
    public void paintComponent(Graphics g_in) {
    	double centerx = size/2;
    	double centery = size/2;
    	double radius  = size/2;
    	
    	//super.paintComponent(g_in);
    	Graphics2D g = (Graphics2D)g_in;
    	g.setRenderingHint( RenderingHints.KEY_ANTIALIASING, 
    						RenderingHints.VALUE_ANTIALIAS_ON);
    	
    	//GradientPaint grad = new GradientPaint(5, 5, Color.red, 20, 20, Color.black, true);

    	Point2D center = new Point2D.Double(centerx, centery);
        Point2D focus = center;//new Point2D.Float(40, 40);
        float[] dist = {0.0f, 0.8f, 1.0f};
        Color[] colors = {new Color(0,0,0,0), new Color(0,0,0,255), new Color(0,0,0,0)};
        RadialGradientPaint rgrad = new RadialGradientPaint(center, (float) radius, focus, dist, colors, CycleMethod.NO_CYCLE);
        g.setPaint(rgrad);
        //g.fillRect(20, 20, 300, 40);
            
    	//g.setColor(Color.DARK_GRAY);
        g.fillOval(0, 0, (int)size, (int)size);
        //g.setColor(Color.BLACK);
        //g.drawOval(0, 0, (int)size, (int)size);
        
        //g.drawImage(Toolkit.getDefaultToolkit().getImage("3D_Geometrical_Figures_24.svg.png"), 0, 0, null);
    }

}