package tec.poo.hello;

public class DogTest {

  public static void main(String[] args) {
    
    Dog fido = new Dog();
    fido.setName("Fido");
    fido.setWeight(4);
    fido.setSize(5);
    fido.setBreed("German shepperd");

    System.out.println("Dog info: " + fido.name + ", Breed: " + fido.breed + ", Weight: " + fido.weight);

    fido.bark(); // <== cual es el valor

    Dog zaguate = new Dog();
    zaguate.setBreed("zaguate");
    zaguate.bark();
  }
  
}
