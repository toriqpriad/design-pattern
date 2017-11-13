//MAIN CLASS
public class CreateBox {
  public static void main(String[] args) {
    BoxFill myBox = new Box();
    myBox = new Bread(myBox);
    myBox = new Candy(myBox);
    myBox = new Biscuit(myBox);
    System.out.println("Box Fiil = " + myBox.getDetails());
    System.out.println("Box Total Weight = " + myBox.Berat() + " GR");
  }
}

//Interface Component BoxFill
interface BoxFill {
  public abstract String getDetails();

  public abstract double Berat();
}

//Concrete Box
class Box implements BoxFill {
  @Override
  public String getDetails() {
    return "";
  }

  @Override
  public double Berat() {
    return 500;
  }
}

// FillDecorator
abstract class FillDecorator implements BoxFill {
  protected BoxFill fill;
}

// Concrete decorator Bread
class Bread extends FillDecorator {
  public Bread(BoxFill fill) {
    this.fill = fill;
  }

  @Override
  public String getDetails() {
    return fill.getDetails() + getMyInfo();
  }

  @Override
  public double Berat() {
    return fill.Berat() + 100;
  }

  public String getMyInfo() {
    return "BREAD,";
  }
}

// Concrete decorator Candy
class Candy extends FillDecorator {
  public Candy(BoxFill fill) {
    this.fill = fill;
  }

  @Override
  public String getDetails() {
    return fill.getDetails() + getMyInfo();
  }

  @Override
  public double Berat() {
    return fill.Berat() + 50;
  }

  public String getMyInfo() {
    return "CANDY,";
  }
}

// Concrete decorator BIscuit
class Biscuit extends FillDecorator {
  public Biscuit(BoxFill fill) {
    this.fill = fill;
  }

  @Override
  public String getDetails() {
    return fill.getDetails() + getMyInfo();
  }

  @Override
  public double Berat() {
    return fill.Berat() + 400;
  }

  public String getMyInfo() {
    return "BISCUIT,";
  }
}