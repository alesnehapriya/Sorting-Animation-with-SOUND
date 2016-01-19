package SortingAlgorithm;

import java.awt.*;

public class Sort3 extends Sort2{
	protected SortDisplay theDisplay;
	protected SortDisplayFactory displayFactory;
	
	protected void initAnimator(){
		String att= getParameter("dis");
		displayFactory = new StaticSortDisplayFactory();
		theDisplay = displayFactory.makeSortDisplay(att);
		super.initAnimator();
	}
	
	public void scramble(){
		int n= theDisplay.getArraySize(getSize());
		arr = new int[n];
		for(int i=arr.length; --i>=0;)
			arr[i]=i;
		for(int i= arr.length; --i>=0;){
			int j=(int)(i*Math.random());
			SortAlgorithm.swap(arr, i, j);
		}
			
	}
	public void paintFrame(Graphics g){
		theDisplay.display(arr, g, getSize());
	}

}
