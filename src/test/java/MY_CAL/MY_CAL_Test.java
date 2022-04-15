package MY_CAL;
import org.junit.Test;
import org.junit.Assert;

public class MY_CAL_Test{
   private static final double DELTA = 1e-3;
   Calc mycal = new Calc();
   @Test
   public void test1() {
      double val = mycal.sqrt_func(4.0);
      double ans = 2;
      Assert.assertEquals(val,ans, DELTA);
   }
   @Test
   public void test2() {
      double val = mycal.fact_func(4.0);
      double ans = 24;
      Assert.assertEquals(val,ans, DELTA);
   }
   @Test
   public void test3() {
      double val = mycal.log_func(4.0);
      double ans = 1.38629;
      Assert.assertEquals(val,ans, DELTA);
   }
   @Test
   public void test4() {
      double val = mycal.pow_func(4.0,2);
      double ans = 16;
      Assert.assertEquals(val,ans, DELTA);
   }
   
}
