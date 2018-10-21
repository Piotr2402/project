package maven.averages;

public interface Average {
  public void enterData();
  
  public double calculateAverage(double[] values, int[] weight);
  
  public void printData(double[]values, int[] weigth, double avg);
}
