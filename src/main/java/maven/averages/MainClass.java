package maven.averages;

import java.util.Scanner;

/**
 * Class contains main method.
 * @author Piotr
 */
public class MainClass {
  /**
  * Main method.
  * @param args Parameters of the program call.
  */
  public static void main(final String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.println("1.Średnia arytmetyczna");
      System.out.println("2.Średnia ważona");
      System.out.println("0.Zakończ");
      System.out.print("Wybierz rodzaj średniej: ");
      String choose = input.next();
      try {
        int choice = Integer.parseInt(choose);
        if (choice == 1) {
          System.out.println("Średnia arytmetyczna");
          Average arithmetic = new ArithmeticAverage();
          arithmetic.enterData();
        } else if (choice == 2) {
          System.out.println("Średnia ważona");
          Average weighted = new WeightedAverage();
          weighted.enterData();
        } else if (choice == 0) {
          System.out.println("Zakończono");
          input.close();
          break;
        } else {
          System.out.println("Błędny wybór");
        }
      } catch (NumberFormatException e) {
        System.out.println("Błędny wybór");
      }
    }
  }
}
