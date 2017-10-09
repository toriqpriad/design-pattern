

public class MyMoveTest {
	
	String MyMove;

	public static void main(String[] args) {
		MyMove gomove = new MyMove();			
		gomove.moveNow("You",new Attack());
		gomove.moveNow("You",new Defend());
		gomove.moveNow("You",new Run());		
	}

}

