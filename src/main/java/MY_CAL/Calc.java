package MY_CAL;
import java.util.*;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


class Calc{

  Calc() {
    System.out.println("Calculator started running");
  }
  
  private static final Logger log = LogManager.getLogger(Calc.class);

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
        log.info("[ROOT] - " +input);
        double res = mycal.sqrt_func(input);
        log.info("[RESULT - ROOT] - " +res);
        System.out.println("The result for square root of " + input + " is " + res);
     }
     else if(operator.equals("FACT")){       //CASE2
        log.info("[FACTORIAL] - "+input);
        double res = mycal.fact_func(input);
        log.info("[RESULT - FACTORIAL] - " +res);
        System.out.println("The result for factorial of " + input + " is " + res);
     }
     else if(operator.equals("LOG")){        //CASE3
        log.info("[LOG] - "+input);
        double res = mycal.log_func(input);
        log.info("[RESULT - LOG] - " +res);
        System.out.println("The result for logarithm of " + input + " is " + res);
     }
     else if(operator.equals("POW")){        //CASE4
        
        System.out.print("Enter the power value to be calculated:");
        int power = scan.nextInt();
        log.info("[POWER] - "+input+ ", "+power);
        double res = mycal.pow_func(input,power);
        log.info("[RESULT - POWER] - " +res);
        System.out.println("\nThe result for " + input + " power " + power+  " is " + res);
     }
     else {
        System.out.println("Invalid operator input");
        log.error("Invalid operator input");
        
     }
     
  }
  public double sqrt_func(double inp){       //SQRT function
     return Math.sqrt(inp);
  }
  public double fact_func(double inp){       //FACTORIAL function
     if(inp < 0){ return Double.NaN;}
     else if(inp ==0){ return 1;}
     double res = 1;
     for(double i=inp;i>0;i--){
        res*=i;
       }
       return res;
     
  }
  public double log_func(double inp){          // LOGARITHM function
     return Math.log(inp);
  }
  public double pow_func(double inp, int pow){  // POWER function
     return Math.pow(inp,pow);
  }

}
