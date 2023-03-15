/**
 * @author : agboola
 * @created : 2023-03-14
**/

package com.learnjava;

public class LearnJavaClasses {
  public static void main(String[] args) {
    // Bicycle Demo
    System.out.println(">>>> Bicycle Demo");
    System.out.println();

    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    // Invoke methods on
    // those objects
    bike1.changeCadence(50);
    System.out.println("bike1 cadence now " + bike1.cadence);

    // speedUp
    bike1.speedUp(10);
    System.out.println("bik1 speed was formerly lower but now is " + bike1.speed);

    // printStates()
    bike1.printStates();

    // Try an ACMEBicycle
    var bikeACME = new ACMEBicycle();

    System.out.println("bikeACME");
  }
}

class Bicycle {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  void changeCadence(int newValue) {
    cadence = newValue;
  }

  void changeGear(int newGearValue) {
    gear = newGearValue;
  }

  void speedUp(int increment) {
    speed += increment;
  }

  void applyBrakes(int decrement) {
    speed -= decrement;
  }

  void printStates() {
    System.out.println("cadence:" + cadence + " speed:" +
        speed + " gear: " + gear);
  }
}

interface BicycleI {
  
  // wheel revolutions per minute
  void changeCadence(int newValue);

  void changeGear(int newValue);

  void speedUp(int increment);

  void applyBrakes(int decrement);
}

class MountainBike extends Bicycle {
  // some code
}

class ACMEBicycle implements BicycleI {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  // The compiler will now require that methods
  // changeCadence, changeGear, speedUp, and applyBrakes
  // all be implemented. Compilation will fail if those
  // methods are missing from this class.

  public void changeCadence(int newValue) {
    cadence = newValue;
  }

  public void changeGear(int newValue) {
    gear = newValue;
  }

  public void speedUp(int increment) {
    speed += increment;
  }

  public void applyBrakes(int decrement) {
    speed -= decrement;
  }

  public void printStates() {
    System.out.println("cadence:" + 
        cadence + " speed:" + speed + 
        " gear:" + gear);
  }
}
