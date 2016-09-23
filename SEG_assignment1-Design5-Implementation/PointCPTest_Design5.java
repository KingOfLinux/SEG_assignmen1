
import java.util.Random;


public class PointCPTest_Design5
{

    public static void main(String[] args)
    {
        long before;
        long after;
        int numberOfPoints = 10000000;
        int numberOfRuns = 25;
        long max1 = 0, max2 = 0;
        long min1 = 1000000000, min2 = 1000000000;
        long med1, med2;
        long[] medianArray1 = new long[100];
        long[] medianArray2 = new long[100];

        Random r = new Random();
        Random r2 = new Random();



        for (int k = 0; k<numberOfRuns; k++){
          double randomValue1 =  (100) * r.nextDouble();
          double randomValue2 =  (100) * r2.nextDouble();

        System.out.println("Running Design 1...");

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


        System.out.println("Running Design 5...");

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
      }
      if (numberOfRuns % 2 != 0 ){
        numberOfRuns--;
      }
      System.out.println("Minimum time for implementation 1 " +min1);
      System.out.println("Maximum time for implementation 1 " +max1);
      System.out.println("Median for inmplemetation 1 " + medianArray1[numberOfRuns/2]);
      System.out.println();
      System.out.println("Minimum time for implementation 2 " +min2);
      System.out.println("Maximum time for implementation 2 " +max2);
      System.out.println("Median for inmplemetation 2 " + medianArray2[numberOfRuns/2]);

    }
}
