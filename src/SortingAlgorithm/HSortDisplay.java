package SortingAlgorithm;

import java.awt.*;
public class HSortDisplay implements SortDisplay {

	@Override
	public int getArraySize(Dimension d) {
		// TODO Auto-generated method stub
		return d.height/2;
	}

	@Override
	public void display(int[] a, Graphics g, Dimension d) {
		// TODO Auto-generated method stub
		double f = d.width /(double) a.length;
		g.setColor(Color.white);
		g.fillRect(0, 0, d.width, d.height);
		int y= d.height -1;
		g.setColor(Color.BLACK);
		y= d.height-1;
		for(int i= a.length;--i>=0;y -=2)
			g.drawLine(0, y, (int)(a[i]*f), y);
		
		
	}

	@Override
	public void scramble(int[] a, Dimension d) {
		// TODO Auto-generated method stub
		
	}

	
}
