

public class RoboGame {
	
	String Robot;

	private String name;

	private String power;

	private String type = "RoboGame";
	

	// public void setPower(Boolean t ){
	// 	this.power= t;
	// }

	public void setName(String n){
		this.name = n;

	}

	public void setPower(String n){
		this.power = n;
	}
	public void getName(){
		// return this.name;
		System.out.println("Robot Name : " + this.name);
	}

	public void getType(){
		// return this.name;
		System.out.println("Robot Type : " + this.type);
	}	

	public void getPowerStatus(){		
		System.out.println("Robot Power : " + this.power);		
	}	

	public  void attack(){
		Robot gomove = new Robot();			
		gomove.moveNow(this.power, this.type,new Attack());
	}

	public  void defend(){
		Robot gomove = new Robot();			
		gomove.moveNow(this.power,this.type,new Defend());

	}

	public  void run(){
		Robot gomove = new Robot();			
		gomove.moveNow(this.power,this.type,new Run());
	}

}

