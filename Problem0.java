public class Problem0
{
  public static void main(String[] args)
  {
    double value = 2;
    System.out.print("Value: " + value); // value expected 2.0
    /*int value2 = 2.1;
    runSystem.out.print("Value2: " + value2); 
     
      Problem0.java:7: error: incompatible types: possible lossy conversion from double to int
      int value2 = 2.1;
      1 error
    */
    // Analysis: You can store an integer in a double and it will be converted, however if you try to store a double inside an integer, it will fail to convert.
  }
}