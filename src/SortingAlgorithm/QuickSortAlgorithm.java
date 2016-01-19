package SortingAlgorithm;

public class QuickSortAlgorithm extends SortAlgorithm{
	
	protected void qsort(int a[],int lo0, int hi0){
		int lo= lo0;
		int hi=hi0;
		int mid;
		pause();
		
		if(hi0>lo0){
			mid= a[(lo0+hi0)/2];
			while(lo<=hi){
				while((lo<hi0) && (a[lo]<mid)){
					lo++;
				}
				while((hi> lo0) && (a[hi]>mid)){
					hi--;
				}
				if(lo<=hi){
					swap(a,lo,hi);
					pause();
					lo++;
					hi--;
				}
			}
			if(lo0<hi){
				qsort(a,lo0,hi);
			}
			if(lo<hi0){
				qsort(a,lo,hi0);
			}
		}
	}
	
	protected QuickSortAlgorithm(AlgorithmAnimator animator) {
		super(animator);
		// TODO Auto-generated constructor stub
	}

	public void sort(int[] a) {
		// TODO Auto-generated method stub
		qsort(a,0,a.length-1);
		
	}
	

}
