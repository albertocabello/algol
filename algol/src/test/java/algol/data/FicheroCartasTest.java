package algol.data;

import org.junit.Assert;
import org.junit.Test;

import algol.dao.Carta;

public class FicheroCartasTest {

   @Test
   public void testCartasFichero1 () {
      String path = "src/test/resources/cartas.csv";
      FicheroCartas ficheroCartas = new FicheroCartas(path, ";");
      /*
      Estimacion est = ficheroEst.getDatos("2");
      Assert.assertEquals("V Boo", est.getNombreEstrella());
      Assert.assertEquals(8.0, est.getMagnitud(), 0.001);
      Assert.assertEquals(false, est.getFaint());
      try {
         System.out.println(est.getComp2());
      } catch(java.lang.NullPointerException e) {
         System.out.println("Comp 2 is null.");         
      }
      */
   }

}
