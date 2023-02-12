// Create a separate class Gorilla 
public class Gorilla extends Mammal {

  // that can throwSomething(),
  public void throwSomething() {
    // For the throwSomething() method, have it print out a message indicating that
    // the gorilla has thrown something,
    System.out.println("Watch out! The Gorilla threw something!");
    // as well as decrease the energy level by 5
    this.setEnergy(getEnergy() - 5);
    ;
    displayEnergy();
  }

  // eatBananas(),
  public void eatBananas() {
    // For the eatBananas() method, have it print out a message indicating the
    // gorilla's satisfaction
    System.out.println("Bananas, get in mah belly!!!");
    // and increase its energy by 10
    this.setEnergy(getEnergy() + 10);
    displayEnergy();
  }

  // and climb()
  public void climb() {
    // For the climb() method, have it print out a message indicating the gorilla
    // has climbed a tree
    System.out.println("Up the tree goes the Gorilla!");
    // and decrease its energy by 10
    this.setEnergy(getEnergy() - 10);
    displayEnergy();
  }

}
