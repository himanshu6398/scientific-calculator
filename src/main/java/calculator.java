import java.lang.Math;
import java.math.BigInteger;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class calculator {
    private static final Logger logger = LogManager.getLogger(calculator.class);

    public calculator() {

    }
    public static void main(String args[])
    {
        int flag=0,ch,num;
        double num1,num2;
        calculator calc = new calculator();
        Scanner reader = new Scanner(System.in);
        System.out.println("Scientific Calculator");
        do
        {
            System.out.println("Option Menu");
            System.out.println("");
            System.out.println("1) Square Root");
            System.out.println("2) Factorial");
            System.out.println("3) Power function");
            System.out.println("4) Natural Logarithm(base e)");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            ch = reader.nextInt();
            if(ch==5)
            {
                flag = 1;
            }
            else
            {
                switch(ch)
                {
                    case 1:
                        System.out.println("square root");
                        System.out.print("Enter the number: ");
                        num1 = reader.nextDouble();
                        System.out.println("Square root of "+num1+" = "+calc.squareRoot(num1));
                        break;
                    case 2:
                        System.out.println("Factorial");
                        boolean f=true;
                        while(f) {
                            System.out.print("Enter the number: ");
                            num1 = reader.nextDouble();
                            if((Math.floor(num1) == num1) && (num1 >= 0)) {
                                f = false;
                                System.out.println((int)num1+"! = "+calc.factorial(num1));
                            }
                            else
                                System.out.println("!!!!!!!!! please enter only non-negative integers for factorial function !!!!!!!!!");
                        }

                        break;
                    case 3:
                        System.out.println("Power function");
                        System.out.println("Enter the base and power");
                        System.out.print("base: ");
                        num1 = reader.nextDouble();
                        System.out.print("power: ");
                        num2 = reader.nextDouble();
                        System.out.println(num1+"^("+num2+") = "+calc.power(num1,num2));
                        break;
                    case 4:
                        System.out.println("Natural Logarithm(base e)");
                        System.out.print("Enter the number: ");
                        num1 = reader.nextDouble();
                        System.out.println("ln ("+num1+") = "+calc.naturalLog(num1));
                        break;
                    default: System.out.println("Exiting program due to invalid input");
                        flag=1;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }

    public double squareRoot(double N) {
        logger.info("[Square Root] - " + N + " ");
        double result = Math.sqrt(N);
        logger.info("[RESULT - Square Root] - " + result);
        return result;
    }
    /*
        public BigInteger factorial(double N)
        {
            // Initialize result
            BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
            // Multiply f with 2, 3, ...N
            for (int i = 2; i <= N; i++)
                f = f.multiply(BigInteger.valueOf(i));
            return f;
        }
    */
    public long factorial(double N) {
        logger.info("[Factorial] - "+N+"! ");
        long result = 1;

        for (int i = 2; i <= N; i++) {
            result *= i;
        }
        logger.info("[RESULT - Factorial] - "+result);
        return result;
    }

    public double power(double b, double p) {
        logger.info("[Power function] - "+ b +"^"+ p);
        double result = Math.pow(b, p);
        logger.info("[RESULT - Power function] - " + result);
        return result;
    }

    public double naturalLog(double N) {
        logger.info("[Natural Log(base e)] - " + N + " ");
        double result = Math.log(N);
        logger.info("[RESULT - Natural Log(base e)] - " + result);
        return result;
    }
}