package maven.averages;

/**
 * Interface for calculating average.
 * @author Piotr
 */
public interface Average {
  /**
  * Method for entering data.
  */
  void enterData();
  
  /**
   * Method for calculating average.
   * @param values Array with values from which average is calculated.
   * @param weights Array with weights of each values.
   * @return average from entered values.
   */
  double calculateAverage(double[] values, int[] weights);
  
  /**
   * Method for printing data and average.
   * @param values Array with values from which data are printed.
   * @param weights Array with weights from which data are printed.
   * @param avg Calculated average.
   */
  void printData(double[]values, int[] weights, double avg);
}
