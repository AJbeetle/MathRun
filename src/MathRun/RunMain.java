package MathRun;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class RunMain
{

    public static int getRandom(int[] array)
    {
        int rnd = new Random().nextInt(array.length);
        System.out.println(rnd);
        return array[rnd];
    }
    public static void main(String[] args)
    {
        int arr[][] = new int[3][];

        arr[0] = IntStream.range(0,10).toArray();
        arr[1] = IntStream.range(10,100).toArray();
        arr[2] = IntStream.range(100,1000).toArray();

        System.out.println("The values of 2D jagged array");
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
                System.out.printf(arr[i][j] + " ");
            System.out.println();
        }
        int rnd = new Random().nextInt(arr[0].length);
        System.out.println("Random number from the arr[0]= "+arr[0][rnd]);

        int rnd2 = new Random().nextInt(arr[1].length);
        System.out.println("Random number from the arr[0]= "+arr[1][rnd2]);

        int rnd3 = new Random().nextInt(arr[2].length);
        System.out.println("Random number from the arr[0]= "+arr[2][rnd3]);

        int[] randNum = {rnd, rnd2, rnd3};
        System.out.println("randNum[0] : "+randNum[0]);
        System.out.println("randNum[1] : "+randNum[1]);
        System.out.println("randNum[2] : "+randNum[2]);
        int Num1 = getRandom(randNum);
        int Num2 = getRandom(randNum);

        System.out.println(Num1+" "+Num2);

    }
}
