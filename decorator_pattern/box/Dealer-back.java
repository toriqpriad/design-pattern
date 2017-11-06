
public class Dealer {

  public static void main(String[] args) {

    Car ferrari = new SportsCar();
    ferrari = new MusicSystem(ferrari);
    ferrari = new BumperSticker(ferrari, "RED");

    System.out.println("Car information = " + ferrari.getDetails() + ", cost " + ferrari.calculateCost());
  }
}

interface Car {
  public abstract String getDetails();

  public abstract double calculateCost();
}

class SportsCar implements Car{

  @Override
  public String getDetails() {
    return "A sports car";
  }

  @Override
  public double calculateCost() {
    return 100000;
  }

}

 abstract class AccessoriesDecorator implements Car {

  protected Car car;

}

class MusicSystem extends AccessoriesDecorator {


  public MusicSystem(Car car) {
    this.car = car;
  }

  @Override
  public String getDetails() {
    return car.getDetails() + ", MusicSystem =" + getMusicSystemDetails();
  }

  @Override
  public double calculateCost() {
    return car.calculateCost() + 20000;
  }

  public String getMusicSystemDetails() {
    return "Surround Sound System";
  }
}

class BumperSticker extends AccessoriesDecorator {

  private String color;

  public BumperSticker(Car car, String color) {
    this.car = car;
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String getDetails() {
    return car.getDetails() + ", bumper stickers with color = " + color;
  }

  @Override
  public double calculateCost() {
    return car.calculateCost() + 250;
  }

}