package SortingAlgorithm;

public class BubbleSortAlgorithm extends SortAlgorithm {

	protected BubbleSortAlgorithm(AlgorithmAnimator animator) {
		super(animator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=a.length; --i>=0;){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					swap(a,j,j+1);
				}
				pause();
			}
		}
		
	}

	
}
