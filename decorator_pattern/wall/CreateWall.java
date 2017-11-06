
public class CreateWall {
 public static void main(String[] args) {
  WallComponent myWall = new Wall();
  myWall = new MyCalendar(myWall);
  myWall = new MyPaint(myWall);  
  myWall = new MyLampp(myWall);
  myWall.Info();
  System.out.println("");
  System.out.print("Adding New Paint .... ");
  myWall = new MyPaint(myWall);  
  myWall.Info();
 }
}

interface WallComponent{
 public void Info();
}

class Wall implements WallComponent{
 @Override
 public void Info() {
  System.out.println("This is a New Wall");
 }
}

abstract class AccessoriesDecorator implements WallComponent{
  WallComponent wall = null;
 public AccessoriesDecorator(WallComponent wall) {
  this.wall = wall;
 }
}

class MyCalendar extends AccessoriesDecorator{
 public MyCalendar(WallComponent wall) {
  super(wall);
 }
 @Override
 public void Info() {
  this.wall.Info();
  this.CanRun();
 }
 
 private void CanRun(){
  System.out.println("Calendar has set");
 }
}

class MyPaint extends AccessoriesDecorator{
 public MyPaint(WallComponent wall) {
  super(wall);
 }
 @Override
 public void Info() {
  this.wall.Info();
  this.CanRun();
 }
 
 private void CanRun(){
  System.out.println("Paint has set");
 }
}

class MyLampp extends AccessoriesDecorator{
 public MyLampp(WallComponent wall) {
  super(wall);
 }
 @Override
 public void Info() {
  this.wall.Info();
  this.CanRun();
 }
 
 private void CanRun(){
  System.out.println("Lampp has set");
 }
}