
public class CreateBox {

  public static void main(String[] args) {
    
    BoxFill myBox = new Box();
    myBox = new Bread(myBox);  
    myBox = new Candy(myBox);  
    myBox = new Biscuit(myBox);  
    System.out.println("Box Fiil = " + myBox.getDetails() );
    System.out.println("Box Total Weight = " + myBox.TotalSize() + " GR");
  }
}

interface BoxFill {
  public abstract String getDetails();

  public abstract double TotalSize();
}

class Box implements BoxFill{

  @Override
  public String getDetails() {
    return "";
  }

  @Override
  public double TotalSize() {
    return 500;
  }

}

abstract class FillDecorator implements BoxFill {

  protected BoxFill fill;

}

class Bread extends FillDecorator {


  public Bread(BoxFill fill) {
    this.fill = fill;
  }

  @Override
  public String getDetails() {
    return fill.getDetails()  + getMyInfo();
  }

  @Override
  public double TotalSize() {
    return fill.TotalSize() + 100;
  }

  public String getMyInfo() {
    return "BREAD,";
  }
}

class Candy extends FillDecorator {


  public Candy(BoxFill fill) {
    this.fill = fill;
  }

  @Override
  public String getDetails() {
    return fill.getDetails()  + getMyInfo();
  }

  @Override
  public double TotalSize() {
    return fill.TotalSize() + 50;
  }

  public String getMyInfo() {
    return "CANDY,";
  }
}

class Biscuit extends FillDecorator {


  public Biscuit(BoxFill fill) {
    this.fill = fill;
  }

  @Override
  public String getDetails() {
    return fill.getDetails()  + getMyInfo();
  }

  @Override
  public double TotalSize() {
    return fill.TotalSize() + 400;
  }

  public String getMyInfo() {
    return "BISCUIT,";
  }
}