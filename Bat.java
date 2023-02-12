// Create a Bat class 
public class Bat extends Mammal {

  // ====== CONSTRUCTOR ======
  // that has a default energy level of 300,
  public Bat() {
    setEnergyLevel(300);
  }

  // can fly(),
  public void fly() {
    // For the fly() method, print the sound of a bat taking off
    System.out.println("Whoooosshhhh!!! Eeeek eeek eeek eeek!");
    // and decrease its energy by 50.
    setEnergyLevel(getEnergyLevel() - 50);
    displayEnergy();
  }

  // eatHumans(),
  public void eatHumans() {
    // For the eatHumans() method, print the so- well, never mind,
    System.out.println("The human-eating bat strikes again!");
    // just increase its energy by 25.
    setEnergyLevel(getEnergyLevel() + 25);
    displayEnergy();
  }

  // and attackTown()
  public void attackTown() {
    // For the attackTown() method, print the sound of a town on fire
    System.out.println("Call the Fire Department! The town is on fire!");
    // and decrease its energy by 100.
    setEnergyLevel(getEnergyLevel() - 100);
    displayEnergy();
  }

}
