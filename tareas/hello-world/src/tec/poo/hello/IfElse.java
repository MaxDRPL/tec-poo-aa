package tec.poo.hello;

public class IfElse {
  
  public static void main(String[] args) {
    
    int x = 8;
    String name = "Dirk";

    if (args.length > 0) {
      System.out.println("Pos 0 is: " + args[0]);
      System.out.println("Pos 1 is: " + args[1]);
    } else {
      System.out.println("Args is empty");
    }

    

    if (x == 10) {
      System.out.println("x must be 10");
    } else {
      System.out.println("x isn't 10");
    }
    if ((x < 3) && (name.equals("Dirk"))) {
      System.out.println("Gently");
    }
    System.out.print("this line runs no matter what");    
  }
}
