// Create a Mammal class
public class Mammal {
  // that has an energyLevel member variable (default 100)
  private int energyLevel;

  // ====== CONSTRUCTOR ======
  public Mammal() {
    energyLevel = 100;
  }

  // and displayEnergy() method.
  public int displayEnergy() {
    // The displayEnergy() method should show the animal's energy level
    System.out.println("Energy Level: " + this.energyLevel);
    // as well as return it.
    return this.energyLevel;
  }

  // ==== GETTER & SETTER ====
  public int getEnergyLevel() {
    return energyLevel;
  }

  public void setEnergyLevel(int energyLevel) {
    this.energyLevel = energyLevel;
  }

}
