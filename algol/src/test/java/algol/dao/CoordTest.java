package algol.dao;

import junit.framework.Assert;
import org.junit.Test;

public class CoordTest {

   @Test
   public void test1() {
      Coord ar = new Coord("19:30:12.85");
      Assert.assertEquals(30, ar.getC2());
      Coord dec = new Coord("+27:53:19.4");
      Assert.assertEquals(27, dec.getC1());
      Assert.assertEquals(19.4, dec.getC3());
   }

   @Test
   public void test2() {
      Coord dec = new Coord("-27:53:19.4");
      Assert.assertEquals(-27, dec.getC1());
      Assert.assertEquals(19.4, dec.getC3());
   }

}
