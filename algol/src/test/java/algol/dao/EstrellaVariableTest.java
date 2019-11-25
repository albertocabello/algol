package algol.dao;

import org.junit.Assert;
import org.junit.Test;

import algol.data.FicheroEstrellasVariables;

public class EstrellaVariableTest {

   @Test
   public void test1 () {
      EstrellaVariable ev = new EstrellaVariable("S Lep", "SRB", 6.0, 7.6, 97.3);
      Assert.assertEquals(6.8, ev.getMagnitud(), 0.001);
   }

   @Test
   public void test2 () {
      Estrella ev = new EstrellaVariable("AF Cyg", "SRB", 6.4, 7.7, 92.5);
      Assert.assertEquals(7.1, ev.getMagnitud(), 0.001);
   }

}
