package SortingAlgorithm;

import java.awt.*;

public abstract class DBAnimationApplet extends AnimationApplet{
	protected Dimension dim;
	protected Image im;
	protected Graphics offscreen;
	protected boolean doubleBuffered;
	
	public void init(){
		dim=getSize();
		im=createImage(dim.width,dim.height);
		offscreen= im.getGraphics();
		initAnimator();
	}
	protected void initAnimator(){
		
	}
	abstract protected void paintFrame(Graphics g);
	
	public void update(Graphics g){
		if(doubleBuffered){
			paintFrame(offscreen);
			g.drawImage(im, 0, 0, this);
		}
		else{
			super.update(g);
		}
		
		}
	final public void paint(Graphics g){
		paintFrame(g);
	}
	protected DBAnimationApplet(boolean doubleBuffered){
		this.doubleBuffered= doubleBuffered;
	}
	protected DBAnimationApplet(){
		this.doubleBuffered=true;
	}

}
