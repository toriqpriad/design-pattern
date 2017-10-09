

public class NumberNotes {
	
	String NumberApp;

	public void quickSort(){

		NumberApp sorting = new NumberApp();
		sorting.sortNow(new Quick());
	}

	public void mergeSort(){

		NumberApp sorting = new NumberApp();
		sorting.sortNow(new Merge());
	}
}

