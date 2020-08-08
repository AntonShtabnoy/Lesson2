package by.shtabnoy.lesson4.passingargument;

public class Person {

  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "age=" + age +
        '}';
  }
}
