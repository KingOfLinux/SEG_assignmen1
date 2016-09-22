public class PointCPTest_Design5
{

    public static void main(String[] args)
    {
        long before;
        long after;
        int numberOfPoints = 1000;

        System.out.println("Running Design 1...");

        before = System.nanoTime();
        for (int i = 0; i<numberOfPoints; i++)
        {
            PointCP point = new PointCP('C', 1, 1);
            point.getRho();
            point.getTheta();
        }
        after= System.nanoTime();

        System.out.println("Time elapsed (nanoseconds): " + (after-before));


        System.out.println("Running Design 5...");

        before = System.nanoTime();
        for (int i = 0; i<numberOfPoints; i++)
        {
            PointCP_Abstract point = new PointCP_Design3('C', 1, 1);
            point.convertStorageToPolar();
        }
        after= System.nanoTime();

        System.out.println("Time elapsed (nanoseconds): " + (after-before));
    }
}
