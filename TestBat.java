// Create a BatTest class 
public class TestBat {

  public static void main(String[] args) {
    // to instantiate a bat
    Bat bat = new Bat();

    // displayEnergy - should be 300
    bat.displayEnergy();

    // and have it attack three towns,
    bat.attackTown();
    bat.attackTown();
    bat.attackTown();

    // eat two humans,
    bat.eatHumans();
    bat.eatHumans();

    // and fly twice.
    bat.fly();
    bat.fly();
  }
}
