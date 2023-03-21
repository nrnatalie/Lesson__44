import Homework__44.CanFly;
import Homework__44.CanRun;
import Homework__44.CanSwim;

public class Airplane implements CanFly, CanRun, CanSwim {
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
