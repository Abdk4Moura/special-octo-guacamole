/**
 * @author : agboola
 * @created : 2023-03-14
 **/

public class SwitchDemo {
  public static void main(String[] args) {

    if (args.length > 1) {
      System.out.println("Arguments length exceed 1");
      return;
    }
    if (args[0] == "second" || args[0] == "2")
      MultipleCases.main();
    else
      FirstSwitchDemo.main();
  }
}}

class FirstSwitchDemo {
  public static void main() {

    int month = java.util.Ints.fromString(args[0]);
    String monthString;
    switch (month) {
    case 1:
      monthString = "January";
      break;
    case 2:
      monthString = "February";
      break;
    case 3:
      monthString = "March";
      break;
    case 4:
      monthString = "April";
      break;
    case 5:
      monthString = "May";
      break;
    case 6:
      monthString = "June";
      break;
    case 7:
      monthString = "July";
      break;
    case 8:
      monthString = "August";
      break;
    case 9:
      monthString = "September";
      break;
    case 10:
      monthString = "October";
      break;
    case 11:
      monthString = "November";
      break;
    case 12:
      monthString = "December";
      break;
    }
  }

class MultipleCases {
  public static void main() {
    
    int month = 2;
    int year = 2000;
    int numDays = 0;

    switch (month) {
      case 1: case 3: case 5:
      case 7: case 8: case 10:
      case 12:
        numDays = 31;
        break;
      case 4: case 6:
      case 9: case 11:
        numDays = 30;
        break;
      case 2:
        if ((year % 4 == 0) &&
            !(year % 100 == 0)
          || ((year % 400) == 0))
          numDays = 29;
        else
          numDays = 28;
        break;
      default:
        System.out.println("Invalid month.");
        break;
    }
    System.out.println("Number of Days = " + numDays);
  }
}
