/**
 * 
 */
package Sorting;

import java.applet.*;

/**
 * @author aelay
 *
 */
public class AnimationApplet extends Applet implements Runnable {
	protected Thread animationThread;
	protected int delay=1000;
	public void start(){
		animationThread = new Thread(this);
		animationThread.start();
	}
	
	public void stop(){
		animationThread=null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(Thread.currentThread() == animationThread){
			try{
				Thread.currentThread().sleep(delay);
			}
			catch(Exception e){
				
			}
			repaint();
		}
		
	}
	final public void setDelay(int delay){
		this.delay=delay;
	}
	final public int getDelay(){
		return delay;
	}

}
