/**
 * @author : agboola
 * @version     Current version of the program.
 * @since        When this part of the program was first added.
 * @param         For describing the different parameters for a method.
 * @return        For describing what the method returns.
 * @deprecated  For showing the code is outdated or shouldn't be used.
 * @see         Links to another part of documentation.
 * @created : 2023-03-13
**/

import java.util.*;

public class LearnJavaScanner {
  public static void main(String[] args) {
    /*
     * Using Scanners
     */
    Scanner scanner = new Scanner(System.in);
    /* 
     * `System.in` above is presumed to just be whatever
     * the machine itself takes in as the input
     */

    // #ONTO Strings and common types however making use of `scanner` from above
    // read string input
    String name = scanner.next();
    //print stuff in the end
    System.out.println("Your name is " + name);

    // read byte input
    byte numByte = scanner.nextByte();

    // read int input
    int numInt = scanner.nextInt();

    // read long input
    float numFloat = scanner.nextFloat();

    // read double input
    double numDouble = scanner.nextDouble();

    // read boolean input
    boolean bool = scanner.nextBoolean();

  }
}
