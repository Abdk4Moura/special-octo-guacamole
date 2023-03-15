/**
 * @author : agboola
 * @created : 2023-03-14
 **/

public class Arrays {
  public static void main(Strings[] args) {
    // declares an array of integers
    int[] anArray;

    // allocates memory for 10 integers
    anArray = new int[10];

    // initialize first element
    anArray[0] = 100;
    // initialize second element
    anArray[1] = 200;
    // and so forth;
    anArray[2] = 300;
    anArray[3] = 400;
    anArray[4] = 500;
    anArray[5] = 600;
    anArray[6] = 700;
    anArray[7] = 800;
    anArray[8] = 900;
    anArray[9] = 1000;

    for (short i = 0; i < anArray.size(); i++) {
      System.out.println("Element at index " + i + ": " + anArray[i]);
    }

    // alternatively `anArray` above can be defined using
    // the style below
    int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
  }
}
