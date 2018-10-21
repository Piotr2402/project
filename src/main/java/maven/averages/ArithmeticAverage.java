package maven.averages;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticAverage implements Average {
  private final Scanner input;
  
  ArithmeticAverage() {
    input = new Scanner(System.in);
  }
  
  @Override
  public void enterData() {
    try {
      System.out.print("Wprowadz ilosc wartosci:");
      int number = input.nextInt();
      if (number < 1) {
        System.out.println("Błędna dana");
        return;
      }
      double[] values = new double[number];
      for (int i = 0;i < number;i++) {
        System.out.print("Wprowadz wartosc" + (i + 1) + ": ");
        values[i] = input.nextDouble();
      }
      double avg = calculateAverage(values, null);
      printData(values,null,avg);
    } catch (InputMismatchException e) {
      System.out.println("Błędna dana");
      return;
    }
  }
  
  @Override
    public double calculateAverage(final double[] values, final int[] weights) {
    double sum = 0;
    for (int i = 0;i < values.length;i++) {
      sum += values[i];
    }
    return sum / values.length;
  }
  
  @Override
    public void printData(final double[] values, final int[] weights, final double avg) {
    System.out.println("");
    for (int i = 0;i < values.length;i++) {
      System.out.println("Wartosc" + (i + 1) + " = " + values[i]);
    }
    System.out.println("SREDNIA WYNOSI: " + avg);
    System.out.println("");
  }
}
