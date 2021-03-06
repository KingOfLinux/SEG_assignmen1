
import java.util.Random;


public class PointCPTest_Design5
{

    public static void main(String[] args)
    {
        long before;
        long after;
        int numberOfPoints = 10000000;
        int numberOfRuns = 25;
        long max1 = 0, max2 = 0, max3 = 0, max4 = 0;
        long min1 = 1000000000, min2 = 1000000000, min3 = 1000000000, min4 = 1000000000;
        long[] medianArray1 = new long[100];
        long[] medianArray2 = new long[100];
        long[] medianArray3 = new long[100];
        long[] medianArray4 = new long[100];


        Random r = new Random();
        Random r2 = new Random();



        for (int k = 0; k<numberOfRuns; k++){
          double randomValue1 =  (100) * r.nextDouble();
          double randomValue2 =  (100) * r2.nextDouble();

        System.out.println("Running Design 1...");
//begining of test for design number 1
        before = System.nanoTime();
        for (int i = 0; i<numberOfPoints; i++)
        {
            PointCP point = new PointCP('C', randomValue1, randomValue2);
            point.getRho();
            point.getTheta();
        }
        after= System.nanoTime();

        medianArray1[k] = after-before;

        if (after-before<min1 ){
          min1 = after-before;
          System.out.println();
          System.out.println("Minimum time " +min1);
          System.out.println();

        }
        if (after-before>max1){
          max1 = after-before;
          System.out.println();

          System.out.println("Maximum time " +max1);
          System.out.println();

        }

        System.out.println("Time elapsed (nanoseconds): " + (after-before));

//begining for test of design #5 concrete design #2
        System.out.println("Running Design 5-2...");

        before = System.nanoTime();
        for (int i = 0; i<numberOfPoints; i++)
        {
            PointCP_Abstract point = new PointCP_Design2('C', randomValue1, randomValue2);
            point.convertStorageToPolar();
        }
        after= System.nanoTime();

        System.out.println("Time elapsed (nanoseconds): " + (after-before));
        medianArray2[k] = after-before;
        if (after-before<min2 ){
          min2 = after-before;
          System.out.println();
          System.out.println("Minimum time " +min2);
          System.out.println();

        }
        if (after-before>max2){
          max2 = after-before;
          System.out.println();
          System.out.println("Maximum time " +max2);
          System.out.println();

        }

        System.out.println("Running Design 5-3...");

        before = System.nanoTime();
        for (int i = 0; i<numberOfPoints; i++)
        {
            PointCP_Abstract point = new PointCP_Design3('C', randomValue1, randomValue2);
            point.convertStorageToPolar();
        }
        after= System.nanoTime();

        System.out.println("Time elapsed (nanoseconds): " + (after-before));
        medianArray2[k] = after-before;
        if (after-before<min4 ){
          min4 = after-before;
          System.out.println();
          System.out.println("Minimum time " +min4);
          System.out.println();

        }
        if (after-before>max4){
          max4 = after-before;
          System.out.println();
          System.out.println("Maximum time " +max4);
          System.out.println();

        }


        //begining for test of design #3

        System.out.println("Running design 3...");
        before = System.nanoTime();
        for (int i = 0; i<numberOfPoints; i++)
        {
            PointCPDesign3 point = new PointCPDesign3('C', randomValue1, randomValue2);
            point.convertStorageToPolar();
        }
        after= System.nanoTime();

        System.out.println("Time elapsed (nanoseconds): " + (after-before));
        medianArray3[k] = after-before;
        if (after-before<min3 ){
          min3 = after-before;
          System.out.println();
          System.out.println("Minimum time " +min3);
          System.out.println();

        }
        if (after-before>max3){
          max3 = after-before;
          System.out.println();
          System.out.println("Maximum time " +max3);
          System.out.println();

        }
      }
      if (numberOfRuns % 2 != 0 ){
        numberOfRuns--;
      }
      System.out.println("Minimum time for implementation 1 " +min1);
      System.out.println("Maximum time for implementation 1 " +max1);
      System.out.println("Median for inmplemetation 1 " + medianArray1[numberOfRuns/2]);
      System.out.println();
      System.out.println("Minimum time for implementation 5-2 " +min2);
      System.out.println("Maximum time for implementation 5-2 " +max2);
      System.out.println("Median for inmplemetation 5-2 " + medianArray2[numberOfRuns/2]);
      System.out.println();
      System.out.println("Minimum time for implementation 5-2 " +min4);
      System.out.println("Maximum time for implementation 5-2 " +max4);
      System.out.println("Median for inmplemetation 5-3 " + medianArray4[numberOfRuns/2]);
      System.out.println();
      System.out.println("Minimum time for implementation 3 " +min3);
      System.out.println("Maximum time for implementation 3 " +max3);
      System.out.println("Median for inmplemetation 3 " + medianArray3[numberOfRuns/2]);

    }
}
