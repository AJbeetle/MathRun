//2nd try_____________________________________________________________________________________________________________________________________________________________________________________________________________
//===============================================================================================================================================================================================================

package MathRun;

import java.util.Arrays;                   //DONE
import java.util.Random;                   //DONE
import java.util.Scanner;                  //DONE
import java.util.stream.IntStream;         //DONE
import java.lang.Math;                     //DONE
public class Main
{
    public static float truncate(double value, int places)
    {
        float multiplier = (float) Math.pow(10, places);
        return (float) Math.floor(multiplier * value) / multiplier;
    }
    public static int getRandom(int[] array)
    {
        int rnd = new Random().nextInt(array.length);
//        System.out.println(rnd);
        return array[rnd];
    }
    public static void main(String[] args)
    {
        int arr[][] = new int[3][];

        arr[0] = IntStream.range(2,10).toArray();                // removing one and zero from the array as the basic maths operations with these numbers is either not defined or very simple to be asked for
        arr[1] = IntStream.range(10,100).toArray();
        arr[2] = IntStream.range(100,1000).toArray();

//        System.out.println("The values of 2D jagged array");
//        for(int i = 0; i < arr.length; i++)
//        {
//            for (int j = 0; j < arr[i].length; j++)
//                System.out.printf(arr[i][j] + " ");
//            System.out.println();
//        }

        char status = 'n';
        Scanner sc = new Scanner(System.in);
        while(status=='n' || status=='N')
        {
            int rnd = new Random().nextInt(arr[0].length);
            int rndNew = new Random().nextInt(arr[0].length);
            int no_gen = arr[0][rnd];
            int no_genNew = arr[0][rndNew];
//            System.out.println("Random number from the arr[0]= "+no_gen);

            int rnd2 = new Random().nextInt(arr[1].length);
            int rnd2New = new Random().nextInt(arr[1].length);
            int no_gen1 = arr[1][rnd2];
            int no_gen1New = arr[1][rnd2New];
//            System.out.4println("Random number from the arr[1]= "+no_gen1);

            int rnd3 = new Random().nextInt(arr[2].length);
            int rnd3New = new Random().nextInt(arr[2].length);
            int no_gen2 = arr[2][rnd3];
            int no_gen2New = arr[2][rnd3New];
//            System.out.println("Random number from the arr[2]= "+no_gen2);

            int[] randNum = {no_gen, no_gen1, no_gen2};
            int[] randNumNew = {no_genNew, no_gen1New, no_gen2New};

//        System.out.println("randNum[0] : "+randNum[0]);                      // checking if randNum array generated is right or not
//        System.out.println("randNum[1] : "+randNum[1]);
//        System.out.println("randNum[2] : "+randNum[2]);
            float Num1 = getRandom(randNum);
            float Num2 = getRandom(randNumNew);           // generated a whole newSetup for second number to reduce the possiblity of getting same number as Num1 and Num2

            System.out.println("Num1 : "+Num1+", Num2 : "+Num2);

            // Basic Math operations I need used to solve are : Addition, Subtraction, Multiplication, Division + adding complex operations : square, square_root, cube, cube_root, x percentage of y
            int[] op = {1,2,3,4,5,6,7,8,9};  // 1add, 2multiply, 3subtract, 4divide, 5square, 6squareRoot, 7cube, 8cubeRoot, 9x percentage of y
            int rd = new Random().nextInt(op.length);
//            System.out.println(rd);                                                  // checking which operation is going to be asked
//            System.out.println("Random number from the op["+rd+"]= "+op[rd]);

            int choice = op[rd],x=0,y=0;
//            int choice = 5,x=0,y=0;                 // checking each mathematical operation individually
            float answer,sysOp;

            // DataModification : This is done to make program a realistic Questioning Platform __there is still room for improvement
            if (choice == 9)       //x percent of y [ModifiedDataSet]
            {
                // Creating a new set of data for 9th operation : x percentage of y,
                // x will have 1-digit numners, 2 digit number and 5,10,15,20,...85,90
                // y can be a 3-digit number and 50,100,150.....850,900,950

                // value to be added in array starts from 0 and goes till less than 100 going as 5,10,15,20 and so on
                int[] NewData = IntStream.iterate(0,i->i<100, i->i+5).toArray();
                int[] xchoices = {no_gen, no_gen1, getRandom(NewData)};
//            System.out.println(xchoices[0]+" "+xchoices[1]+" "+xchoices[2]);

                int[] NewDataY = IntStream.iterate(0,i->i<1000,i->i+50).toArray();
                int[] ychoices = {no_gen2, getRandom(NewDataY)};
//            System.out.println(ychoices[0]+" "+ychoices[1]);

                x = getRandom(xchoices);
                y = getRandom(ychoices);
            }
            else if (choice == 7)  //Cube [ModifiedDataSet]
            {
                // Creating a new set of data for 7th operation : cube of a number,
                // Number can be
                // 1. either 1digit number or
                // 2. 2digit number 2digit numbers such as 10,20,30,....90, and
                // 3. 2digit number rangin from 11,12,....45.

                // getting 3type __subarray from 2nd row of our jagged array as we want limited two digit numbers
                int sub[] = Arrays.copyOfRange(arr[1],0,(45-10)+1); // 45-10 is last index upto which we need data from arr[1] row;
                // understand this with an example say our array start from1 10 and goes till 20 so tell what is index of 15, it will be 15-10 = 5th index
                // so in arr from 10-20, 15 comes at index 5 count it on your finger to crosscheck

//            displaying subarray to conifrm if values are as desired or not
//            for (int i = 0; i<=sub.length-1; i++)
//            {
//                System.out.print(sub[i]+" ");
//            }
//            System.out.println("  ");

                // getting 2type __value to be added in array starts from 10 and goes till less than 100 going as 10,20,30,40 and so on
                int[] ND = IntStream.iterate(10,i->i<100, i->i+10).toArray();
                int[] Num7 = {no_gen, getRandom(ND), getRandom(sub)};   // Num7 is data set for cube of number operation__choose one number out of theese three
                Num1 = getRandom(Num7);
            }
            else if (choice == 5)  //Square [ModifiedDataSet]
            {
                // Creating a new set of data for 7th operation : cube of a number,
                // Number can be
                // 1. either 1digit number or
                // 2. 2digit number

                int[] Num5 = {no_gen, no_gen1};
                Num1 = getRandom(Num5);           // Num5 is data set for square of number operation__choose one number out of theese three
            }



            while(choice>0)
            {
                if (choice==1)                      // Addition
                {
                    System.out.print("Do the operation : "+(Num1+" + "+Num2)+" = ");
                    sysOp = Num1 + Num2;
                    answer = sc.nextInt();
                    if (answer == sysOp)
                    {
                        System.out.println("*_* Your answer is correct");
                        break; //Run full code again
                    }
                    else
                    {
                        choice = 1;
                    }
                }
                else if(choice==2)                 // Multiplication
                {
                    System.out.print("Do the operation : "+(Num1+" X "+Num2)+" = ");
                    sysOp = Num1 * Num2;
                    answer = sc.nextInt();
                    if (answer == sysOp)
                    {
                        System.out.println("*_* Your answer is correct");
                        break; //Run full code again
                    }
                    else
                    {
                        choice = 2;
                    }
                }
                else if(choice==3)                 // Subtraction
                {
                    System.out.print("Do the operation : "+(Num1+" - "+Num2)+" = ");
                    sysOp = Num1 - Num2;
                    answer = sc.nextInt();
                    if (answer == sysOp)
                    {
                        System.out.println("*_* Your answer is correct");
                        break; //Run full code again
                    }
                    else
                    {
                        choice = 3;
                    }
                }
                else if(choice==4)                 // Division
                {
                    if (Num1>Num2 || Num1==Num2)
                    {
                        System.out.print("Do the operation [upto 2 decimalPlaces] : "+(Num1+" / "+Num2)+" = ");
                        sysOp = Num1 / Num2;
                    }
                    else
                    {
                        System.out.print("Do the operation [upto 2 decimalPlaces] : "+(Num2+" / "+Num1)+" = ");
                        sysOp = Num2 / Num1;
                    }

                    answer = sc.nextFloat();
                    if (answer == truncate(sysOp,2))
                    {
                        System.out.println("*_* Your answer is correct");
                        break; //Run full code again
                    }
                    else
                    {
                        choice = 4;
                    }
                }
                else if(choice==5)                 // square of number
                {
                    System.out.print("Do the operation : ("+Num1+")^2 = ");
                    sysOp = (float)Math.pow(Num1,2);
                    answer = sc.nextInt();
                    if (answer == sysOp)
                    {
                        System.out.println("*_* Your answer is correct");
                        break; //Run full code again
                    }
                    else
                    {
                        choice = 5;
                    }
                }
                else if(choice==6)                 // squareRoot of number
                {
                    System.out.print("Do the operation [upto 2 decimalPlaces] : sqrRoot("+Num1+") = ");
                    sysOp = (float) Math.pow(Num1,0.5);
                    answer = sc.nextFloat();
                    if (answer== truncate(sysOp,2))
                    {
                        System.out.println("*_* Your answer is correct");
                        break; //Run full code again
                    }
                    else
                    {
                        choice = 6;
                    }
                }
                else if(choice==7)                 // cube of number
                {
                    System.out.print("Do the operation : ("+Num1+")^3 = ");
                    sysOp = (float)Math.pow(Num1,3);
                    answer = sc.nextInt();
                    if (answer == sysOp)
                    {
                        System.out.println("*_* Your answer is correct");
                        break; //Run full code again
                    }
                    else
                    {
                        choice = 7;
                    }
                }
                else if(choice==8)                 // cubeRoot of number
                {
                    System.out.print("Do the operation [upto 2 decimalPlaces] : cubeRoot("+Num1+") = ");
                    sysOp = (float) Math.pow(Num1,0.333);
                    answer = sc.nextFloat();
                    if (answer == truncate(sysOp,2))
                    {
                        System.out.println("*_* Your answer is correct");
                        break; //Run full code again
                    }
                    else
                    {
//                        System.out.println("sysOp : "+truncate(sysOp,2)+" ans by user : "+truncate(answer,2));
                        choice = 8;
                    }
                }
                else                               // x percentage of y
                {
                    System.out.print("Do the operation [write upto 2 decimal places, truncated value] : "+x+" % of "+y+" = ");
                    sysOp = ((float) (x*y))/(100);
                    answer = sc.nextFloat();
                    if (answer == truncate(sysOp,2))
                    {
                        System.out.println("*_* Your answer is correct");
                        break; //Run full code again
                    }
                    else
                    {
//                        System.out.println("sysOp : "+truncate(sysOp,2)+" ans by user : "+answer);
                        choice = 9;
                    }


                }
            }
            System.out.println("-------------------------------------------------------------------------------");
            System.out.print("For next Operation press n or N else press any key : ");
            status = sc.next().charAt(0);
            System.out.println("-------------------------------------------------------------------------------");
        }

        System.out.println("END OF CODE");
    }
}


//1st Try__________________________________________________________________________________________________________________________________________________________________________________________________________
//===============================================================================================================================================================================================================
/*
package MathRun;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Random;

public class Main
{
    public static int getRandom(int[] array)      //testtin something else !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    {
        int rnd = new Random().nextInt(array.length);
        System.out.println(rnd);
        return array[rnd];
    }
    public static void main(String[] args) {
        int[][][] arr1 = new int[10][90][900];

        int[] Sing_digit = IntStream.iterate(0, i -> i < 10, i -> i + 1).toArray();    // value to be added in array starts from 0 and goes till less than 10
        int[] S_digit = IntStream.range(0, 10).toArray();//Single digit Array   // Value to be added in array starts from 0 and goes till less than 10
        int[] D_digit = IntStream.range(10, 100).toArray();//Double digit Array
        int[] T_digit = IntStream.range(100, 1000).toArray();//Triple digit Array

        int n = S_digit.length;
        System.out.println(n);

        for (int i = 0; i < n; i++)                   //printing arrays
        {
            System.out.print(S_digit[i] + " ");
//            System.out.print(D_digit[i]+" ");
//            System.out.print(T_digit[i] + " ");
        }
        System.out.println("");


        int arr[][] = new int[3][];      // Defining a jaggedArray : Array that have fixed row but every row might have different coloumns

//        arr[0] = new int[10];        // defining different rows column size in jaggedArrays : jaggedArrays are those arrays in which we have different column for different rows
//        arr[1] = new int[90];
//        arr[2] = new int[900];

        arr[0] = IntStream.range(0, 10).toArray();
        arr[1] = IntStream.range(10, 100).toArray();
        arr[2] = IntStream.range(100, 1000).toArray();

//        for (int i=0; i<arr.length; i++)                        // think of some logic to create a insertion of single, double amd triple digit number in 2D array in their assigned rows
//        {
//            for(int j=0; j<arr[i].length;j++)
//            {
//                arr[i][j] =
//            }
//        }

        // printing the values of 2D Jagged array
        System.out.println("The values of 2D jagged array");
        for (int i = 0; i < arr.length; i++) {
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
        int rowIn, rowIn1;

        rowIn = getRandom(row);
        rowIn1 = getRandom(row);

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
*/
