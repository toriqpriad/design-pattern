

public class Robot {
	
	public void moveNow(String Condition,String me, MoveAction moveMethod){				
		if(Condition == "on"){
			moveMethod.move(me);
		} else {
			System.out.println("Action disabled because your robot is actually death");		
		}
		
	}
	
}
