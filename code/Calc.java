package MY_CAL
import java.util.*;
import java.lang.Math;
import org.apache.logging.log4j.Logger;


class Calc{
  Calc() {
    System.out.println("Calculator started running");
  }
  private static org.apache.log4j.Logger log = Logger.getLogger(Calc.class);


  public static void main(String args[]){
     Calc mycal = new Calc();
     Scanner scan = new Scanner(System.in);
     System.out.print("Please enter a valid double input value to the calculator: ");
     double input =0;
     try{
     input = scan.nextDouble();}
     catch(InputMismatchException error){
       System.out.println("Invalid double value entered");
       log.error("Invalid double value entered");
      }
     
     System.out.println("\nPlease enter the corresponding operator");
     System.out.println("Enter 'SQRT' : for square root \nEnter 'FACT' : for factorial \nEnter 'LOG' : for natural logarithm \nEnter 'POW' : for power");
     System.out.print("---->");
  
     String operator = scan.next();  
     System.out.print("\n");        
     if(operator.equals("SQRT")){            //CASE1
        log.info("SQUARE ROOT of "+input);
        double res = Math.sqrt(input);
        log.info("result of square root is "+res);
        System.out.println("The result for square root of " + input + " is " + res);
     }
     else if(operator.equals("FACT")){       //CASE2
        log.info("FACTORIAL of "+input);
        double res=0;
        
        if(input < 0){ System.out.println("Invalid input");}
        else if(input == 0){ res = 1;}
        else{
        res = 1;
          for(double a = input;a>0;a--){
           res*=a;
          }
        }
        log.info("result of factorial is "+res);
        System.out.println("The result for factorial of " + input + " is " + res);
     }
     else if(operator.equals("LOG")){        //CASE3
        log.info("LOG of "+input);
        double res = Math.log(input);
        log.info("result of logarithm is "+res);
        System.out.println("The result for logarithm of " + input + " is " + res);
     }
     else if(operator.equals("POW")){        //CASE4
        
        System.out.print("Enter the power value to be calculated:");
        int power = scan.nextInt();
        log.info(input+ " POWER "+power);
        double res = Math.pow(input,power);
        log.info("result of power is "+res);
        System.out.println("\nThe result for " + input + " power " + power+  " is " + res);
     }
     else {
        System.out.println("Invalid operator input");
        log.error("Invalid operator input");
        
     }
     
  }

}
