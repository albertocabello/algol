package algol.data;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;

public class DiaJulianoTest {

   @Test
   public void test1 () {
      String dateString = "1/1/1970 01:00";
      double dateDouble = 2440587.5;
      SimpleDateFormat formatter = new SimpleDateFormat("d/M/YYYY HH:mm");
      Assert.assertEquals(dateDouble, DiaJuliano.Date2JD(dateString), 0.001);
      Assert.assertEquals(dateString, formatter.format(DiaJuliano.JD2Date(dateDouble)));
   }

   @Test
   public void test2 () {
      String dateString = "1/1/1980 13:00";
      double dateDouble = 2444240.0;
      SimpleDateFormat formatter = new SimpleDateFormat("d/M/YYYY HH:mm");
      // Assert.assertEquals(dateDouble, DiaJuliano.Date2JD(dateString));
      Assert.assertEquals(dateString, formatter.format(DiaJuliano.JD2Date(dateDouble)));
   }

   @Test
   public void test3 () {
      String dateString = "25/4/2016 22:25";
      double dateDouble = 2457504.3507;
      SimpleDateFormat formatter = new SimpleDateFormat("d/M/YYYY HH:mm");
      // Assert.assertEquals(dateDouble, DiaJuliano.Date2JD(dateString));
      Assert.assertEquals(dateString, formatter.format(DiaJuliano.JD2Date(dateDouble)));
   }

}
