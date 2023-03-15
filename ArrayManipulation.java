/**
 * @author : agboola
 * @created : 2023-03-14
**/

public class ArrayManipulation {
  public static void main(String[] args) {
    if (args.length == 1) {
      if (args[0] == "arrays") {
        Arrays.main();
        return;
      } 
      InstanceOf.main();
      return;
    }
    Arrays.main();
  }
}

class Arrays {
  public static void main() {
    String[] copyFrom = {
      "Affogato", "Americano", "Cappucino", "Corretto", "Cortado", "Doppio",
      "Espresso", "Frapuccino", "Freddo", "Lungo", "Macchiato",
      "Morocchino", "Ristretto"
    };

    String[] copyTo = new String[7];
    System.arraycopy(copyFrom, 2, copyTo, 0, 7);
    
    // Print all of copyTo
    System.out.println("Print all of copyTo");
    for (String coffee: copyTo) {
      System.out.print(coffee + " ");
    }

    /*
     * However, it is easier to do it this way instead
     * and use java.util.Arrays.copyOfRange,
     * like this:
     */
    System.out.println();
    System.out.println(";;;;;;;; using `java.util.Arrays.copyOfRange`;;;;;;;;;");
    String[] anotherCopyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
    // and printing it out is as easy as saying
    System.out.println(java.util.Arrays.toString(anotherCopyTo));
    System.out.println();
    
    // This prints the above in the same way as `java.util.Arrays...`
    System.out.println(":::::::::::::::Another way to print:::::::::::::::");
    java.util.Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);

  }
}

class InstanceOf {
  public static void main() {
    Parent obj1 = new Parent();
    Parent obj2 = new Child();
    
    System.out.println("ob1 instance of Parent: " + (obj1 instanceof Parent));
    System.out.println("obj1 instanceof Child: "
            + (obj1 instanceof Child));
    System.out.println("obj1 instanceof MyInterface: "
        + (obj1 instanceof MyInterface));
    System.out.println("obj2 instanceof Parent: "
        + (obj2 instanceof Parent));
    System.out.println("obj2 instanceof Child: "
        + (obj2 instanceof Child));
    System.out.println("obj2 instanceof MyInterface: "
        + (obj2 instanceof MyInterface));
  }
}

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}
