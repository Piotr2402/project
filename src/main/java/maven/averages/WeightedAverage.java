package maven.averages;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightedAverage implements Average {
  private final Scanner input;

  WeightedAverage() {
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
      int[] weights = new int[number];
      for (int i = 0;i < number;i++) {
        System.out.print("Wprowadz wartosc" + (i + 1) + ": ");
        values[i] = input.nextDouble();
        System.out.print("Wprowadz waga" + (i + 1) + ": ");
        weights[i] = input.nextInt();
      }
      double avg = calculateAverage(values, weights);
      printData(values,weights,avg);
    } catch (InputMismatchException e) {
      System.out.println("Błędna dana");
      return;
    }
  }
  
  @Override
  public double calculateAverage(final double[] values,final int[] weight) {
    double sumv = 0;
    int sumw = 0;
    for (int i = 0;i < values.length;i++) {
      sumv += values[i] * weight[i];
      sumw += weight[i];
    }
    return sumv / sumw;
  }
  
  @Override
  public void printData(final double[] values, final int[] weights, final double avg) {
    System.out.println("");
    for (int i = 0;i < values.length;i++) {
      System.out.println("Wartosc" + (i + 1) + " = " + values[i]);
      System.out.println("Waga" + (i + 1) + " = " + weights[i]);
    }
    System.out.println("Średnia ważona wynosi: " + avg);
    System.out.println("");
  }
}
