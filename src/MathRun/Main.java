package MathRun;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Random;

public class Main
{
    public static int getRandom(int[] array)
    {
        int rnd = new Random().nextInt(array.length);
        System.out.println(rnd);
        return array[rnd];
    }
    public static void  main(String[] args)
    {
//        int[][][] arr = new int[10][90][900];
//
//       int[] Sing_digit = IntStream.iterate(0,i->i<10, i->i+1).toArray();    // value to be added in array starts from 0 and goes till less than 10
//        int[] S_digit = IntStream.range(0,10).toArray();//Single digit Array   // Value to be added in array starts from 0 and goes till less than 10
//        int[] D_digit = IntStream.range(10,100).toArray();//Double digit Array
//        int[] T_digit = IntStream.range(100,1000).toArray();//Triple digit Array

//        int n = T_digit.length;

//        for(int i =0; i<n;i++)                   //printing arrays
//        {
////            System.out.print(S_digit[i]+" ");
////            System.out.print(D_digit[i]+" ");
//            System.out.print(T_digit[i]+" ");
//        }

        int arr[][] = new int[3][];      // Defining a jaggedArray : Array that have fixed row but every row might have different coloumns

//        arr[0] = new int[10];        // defining different rows column size in jaggedArrays : jaggedArrays are those arrays in which we have different column for different rows
//        arr[1] = new int[90];
//        arr[2] = new int[900];

        arr[0] = IntStream.range(0,10).toArray();
        arr[1] = IntStream.range(10,100).toArray();
        arr[2] = IntStream.range(100,1000).toArray();

//        for (int i=0; i<arr.length; i++)                        // think of some logic to create a insertion of single, double amd triple digit number in 2D array in their assigned rows
//        {
//            for(int j=0; j<arr[i].length;j++)
//            {
//                arr[i][j] =
//            }
//        }

        // printing the values of 2D Jagged array
        System.out.println("The values of 2D jagged array");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.printf(arr[i][j] + " ");
            System.out.println();
        }

        int  index1, index2, index3;
//        index1 = (int)(Math.random()*10);           // for row 1 we need 0-9 index__but we are getting numbers from 0-10 as Math.random() gives output from 0 to 1
//        index2 = (int)(Math.random()*100);          // for row 2 we need 0-90 index__but we are getting numbers from 0-100
//        index3 = (int)(Math.random()*1000);         // for row 3 we need 0-900 index__but we are getting numbers from 0-1000
        // So instead we do this

        Random rand = new Random();
        index1 = rand.nextInt(10);              // Will work for [0 - 9].
        index2 = rand.nextInt(91);              // will work for 0-90
        index3 = rand.nextInt(901);             // will work for 0-900


        System.out.println(index1+" "+index2+" "+index3);

        int[] column = {index1, index2, index3};
        int[] row = {0,1,2};
        int rowIn = getRandom(row);
        int rowIn1 = getRandom(row);

        int colIn, colIn1;
        if (rowIn == 0 || rowIn1==0)
        {
            colIn = index1;
            colIn1 = index1;
        }
        else if(rowIn == 1 || rowIn1==1)
        {
            colIn = index2;
            colIn1 = index2;
        }
        else
        {
            colIn = getRandom(column);
            colIn1 = getRandom(column);
        }

        System.out.println(rowIn+" "+colIn);
        System.out.println(rowIn1+" "+colIn1);
        System.out.println("Random Number between 0-999 from my array \"arr\" is as follows :- ");
        int Num1 = arr[rowIn][colIn];
        int Num2 = arr[rowIn1][colIn1];
        System.out.println(Num1+" "+Num2);


    }
}
