package by.shtabnoy.lesson4.staticmodifier;

public class Car {

  static int speed1;
  int speed2;

  public void printInfo() {
    System.out.println("Speed1: " + speed1);
    System.out.println("Speed2: " + speed2);
  }

  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car();

    System.out.println("Car 1");
    car1.printInfo();
    System.out.println("Car 2");
    car2.printInfo();

    car1.speed2 = 50;
    car1.speed1 = 10; //Bad
    //Car.speed1 = 10;  //Good

    System.out.println("Car 1");
    car1.printInfo();
    System.out.println("Car 2");
    car2.printInfo();

//    System.out.println(speed1);
//    System.out.println(speed2);
  }
}
