package SortingAlgorithm;

import java.awt.*;

public class VSortDisplay implements SortDisplay {

	@Override
	public int getArraySize(Dimension d) {
		// TODO Auto-generated method stub
		return d.width/2;
	}

	@Override
	public void scramble(int[] a, Dimension d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display(int[] a, Graphics g, Dimension d) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillRect(0, 0, d.width, d.height);
		int x= d.width -1;
		double f= d.height /(double) a.length;
		g.setColor(Color.black);
		for(int i=a.length;-i>=0;x -=2)
			g.drawLine(x, 0, x, (int)(a[i]*f));

	}

}
