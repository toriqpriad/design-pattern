

public class CreateRobot {

	String iRobo;

	public static void main(String[] args) {
		
		System.out.println("------{CREATE ROBOT IROBO WITH POWER ON AND OFF}-------");		
		iRobo robo1 = new iRobo();					
		robo1.setPower("on");		
		robo1.setName("robo1");		
		robo1.getName();		
		robo1.getType();		
		robo1.getPowerStatus();		
		robo1.attack();		
		robo1.run();		
		robo1.defend();		

		System.out.println("");		
		iRobo robo2 = new iRobo();					
		robo2.setPower("off");		
		robo2.setName("robo2");		
		robo2.getName();		
		robo2.getType();		
		robo2.getPowerStatus();		
		robo2.attack();		
		robo2.run();		
		robo2.defend();		

		System.out.println("---------------------{END}--------------------------");		
		System.out.println("");		

		System.out.println("------{CREATE ROBOT RoboGame WITH POWER ON AND OFF}-------");		
		RoboGame RoboGame1 = new RoboGame();					
		RoboGame1.setPower("on");		
		RoboGame1.setName("RoboGame1");		
		RoboGame1.getName();		
		RoboGame1.getType();		
		RoboGame1.getPowerStatus();		
		RoboGame1.attack();		
		RoboGame1.run();		
		RoboGame1.defend();		

		System.out.println("");		
		RoboGame RoboGame2 = new RoboGame();					
		RoboGame2.setPower("off");		
		RoboGame2.setName("RoboGame2");		
		RoboGame2.getName();		
		RoboGame2.getType();		
		RoboGame2.getPowerStatus();		
		RoboGame2.attack();		
		RoboGame2.run();		
		RoboGame2.defend();		

		System.out.println("---------------------{END}--------------------------");		
		System.out.println("");	

	}

	

}

