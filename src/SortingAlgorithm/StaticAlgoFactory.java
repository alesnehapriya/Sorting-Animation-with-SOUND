package SortingAlgorithm;

public class StaticAlgoFactory implements AlgorithmFactory{
	protected AlgorithmAnimator animator;
	public StaticAlgoFactory(AlgorithmAnimator animator){
		this.animator = animator;
	}
	
	public SortAlgorithm makeSortAlgorithm(String algName){
		if("BubbleSort".equals(algName)){
			return new BubbleSortAlgorithm(animator);
		}
		else if("QuickSort".equals(algName)){
			return new QuickSortAlgorithm(animator);
		}
		else{
			return new BubbleSortAlgorithm(animator);
		}
	}

}
