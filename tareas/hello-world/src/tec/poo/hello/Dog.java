package tec.poo.hello;

public class Dog {

  // variables de instancia 
  // miembros de clase
  int size;
  int weight;
  String breed;
  String name;

  // metodos
  void setWeight(int weight) {
    this.weight = weight;
  }

  /**
   * Tablas de verdad
   * 
   * true y true = true
   * true y false = false
   * false y true = false
   * false y false = false
   * 
   * true o true = true
   * true o false = true
   * false o true = true
   * false o false = false
   */

  void setSize(int size) {
    if (size > 0 && size < 100) {
      this.size = size;
    }
  }

  void setName(String name) {
    this.name = name;
  }

  void setBreed(String breed) {
    // validaciones
    // logica de negocios en general
    this.breed = breed;
  }

  void bark() {
    if (this.breed.equals("German shepperd")) {
      System.out.println("woof woof (in german)");
    } else if(this.breed.equals("Bulldog")) {
      System.out.println("woof (in english)");
    } else {
      System.out.println("woof! (in zaguate)");
    }    
  }


}
