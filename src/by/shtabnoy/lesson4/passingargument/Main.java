package by.shtabnoy.lesson4.passingargument;

public class Main {

  public static void change(int x) {
    x = 5;
    System.out.println(x);
  }

  public static void change(Person x) {
    x.setAge(5);
//    x = new Person(); //не повлияет на ссылку person
//    x.setAge(10);
  }

  public static void main(String[] args) {
    int y = 0;
    change(y);
    System.out.println(y);

    Person person = new Person();
    System.out.println(person);

    change(person);
    System.out.println(person);


//    Integer a = new Integer(0);
//    Integer b = new Integer(0);
//
//    b = a;
//    a = 1;
//    System.out.println(b);
  }
}





//Мы можем изменить объект, на котороый ссылается person, но мы не можем взять и изменить ссылку person и переадресовать её на другой объект