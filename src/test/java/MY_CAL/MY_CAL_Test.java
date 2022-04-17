package MY_CAL;
import org.junit.Test;
import org.junit.Assert;

public class MY_CAL_Test{
   private static final double precision = 1e-3;
   Calc mycal = new Calc();
   @Test 
   public void test1() {                             //TRUE POSITIVE
      double val = mycal.sqrt_func(4.0);
      double ans = 2;
      Assert.assertEquals(val,ans, precision);
   }
   @Test
   public void test2() {                             //TRUE POSITIVE
      double val = mycal.fact_func(4.0);
      double ans = 24;
      Assert.assertEquals(val,ans, precision);
   }
   @Test
   public void test3() {                             //TRUE POSITIVE
      double val = mycal.log_func(4.0);
      double ans = 1.38629;
      Assert.assertEquals(val,ans, precision);
   }
   @Test
   public void test4() {                              //TRUE POSITIVE
      double val = mycal.pow_func(4.0,2);
      double ans = 16;
      Assert.assertEquals(val,ans, precision);
   }
   
   
   
   
   
   @Test
   public void test5() {                              //FALSE POSITIVE
      double val = mycal.sqrt_func(9.0);
      double ans = 2;
      Assert.assertNotEquals(val,ans, precision);
   }
   @Test
   public void test6() {                              //FALSE POSITIVE
      double val = mycal.fact_func(5.0);
      double ans = 2;
      Assert.assertNotEquals(val,ans, precision);
   }
   @Test
   public void test7() {                               //FALSE POSITIVE
      double val = mycal.log_func(4.0);
      double ans = 0.38629;
      Assert.assertNotEquals(val,ans, precision);
   }
   @Test
   public void test8() {                               //FALSE POSITIVE
      double val = mycal.pow_func(4.0,6);
      double ans = 16;
      Assert.assertNotEquals(val,ans, precision);
   }
   
}
