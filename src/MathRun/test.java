package MathRun;
import java.util.Random;
public class test
{
    public static void main(String[] args)
    {
        Random rand = new Random();

// Will work for [0 - 9].
        int n = rand.nextInt(10);
        int m = rand.nextInt(1000);
        System.out.println(n+" "+m);
    }
}
