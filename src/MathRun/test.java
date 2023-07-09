// Test Programs
package MathRun;
import java.util.Random;
import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {

        // generating random numbers
        /*Random rand = new Random();

// Will work for [0 - 9].
        int n = rand.nextInt(10);
        int m = rand.nextInt(1000);
        System.out.println(n+" "+m);*/

        // Selecting any random operation from char array
        /*char[] op = {'+','-','/','*'};
        System.out.println(op[0]);
        System.out.println("Adding : "+(1+op[0]+2));                // failed
        */

        int Num1 = 4;
        int Num2 = 2;
        int[] op = {1,2,3,4};
        int rnd = new Random().nextInt(op.length);
        System.out.println(rnd);
        System.out.println("Random number from the op["+rnd+"]= "+op[rnd]);

        int choice = op[rnd];
        Scanner sc = new Scanner(System.in);
        int answer,sysOp;

        while(choice>0)
        {
            if (choice==1)                      // Addition
            {
                System.out.print("Do the operation : "+(Num1+"+"+Num2)+" = ");
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
            else if(choice==2)               //Multiplication
            {
                System.out.print("Do the operation : "+(Num1+"X"+Num2)+" = ");
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
            else if(choice==3)                 //Subtraction
            {
                System.out.print("Do the operation : "+(Num1+"-"+Num2)+" = ");
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
            else                               //division
            {
                System.out.print("Do the operation : "+(Num1+"/"+Num2)+" = ");
                sysOp = Num1 / Num2;
                answer = sc.nextInt();
                if (answer == sysOp)
                {
                    System.out.println("*_* Your answer is correct");
                    break; //Run full code again
                }
                else
                {
                    choice = 4;
                }
            }
        }



    }
}
