package maven.averages;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AveragesTest {
  @Test 
  public void arithmeticTest() {
    Average objectUnderTest = new ArithmeticAverage();
    double expectedResult = 4.0;
    double[] tab = {3.5,2.5,5,3,6};
    assertEquals(expectedResult, objectUnderTest.calculateAverage(tab,null),0);
  }
  
  @Test
  public void weightedTest() {
    Average objectUnderTest = new WeightedAverage();
    double expectedResult = 2.1;
    double[] tab1 = {10,5,1,-1,2.5};
    int[] tab2 = {1,2,3,4,5};
    assertEquals(expectedResult, objectUnderTest.calculateAverage(tab1, tab2),0);
  }
}
