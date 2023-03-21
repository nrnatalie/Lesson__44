package Homework__44;
//Задача 1
   // Напишите интерфейсы "Умеет летать" CanFly с методом fly(), "Умеет бегать"
   // CanRun с методом run и "умеет плавать"
   // CanSwim с методом swim и реализуйте их в классе "Супермен" Superman.
public class SupermanMain implements CanFly, CanRun, CanSwim {

  @Override
  public int getFly() {
    return 0;
  }

  @Override
  public int getRun() {
    return 0;
  }

  @Override
  public int getSwim() {
    return 0;
  }

  @Override
  public void faster(int difference) {

  }

  @Override
  public void slower(int difference) {

  }
}
