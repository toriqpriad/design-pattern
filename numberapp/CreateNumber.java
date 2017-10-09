

public class CreateNumber {

	String CountNumber;
	String NumberNotes;

	public static void main(String[] args) {
		
		System.out.println("------{CREATE CountNumber}-------");		

		CountNumber op = new CountNumber();							

		op.quickSort();
		op.mergeSort();		


		System.out.println("------{CREATE NumberNotes}-------");		

		NumberNotes op2 = new NumberNotes();							

		op2.quickSort();
		op2.mergeSort();
		
	}

	

}

