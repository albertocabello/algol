package algol.data;

import org.junit.Assert;
import org.junit.Test;

import algol.dao.Estimacion;

public class FicheroEstimacionesTest {

   @Test
   public void testEstimacionFichero1 () {
      String path = "src/test/resources/estimaciones.csv";
      FicheroEstimaciones ficheroEst = new FicheroEstimaciones(path, ";");
      Estimacion est = ficheroEst.getDatos("2");
      Assert.assertEquals("V Boo", est.getNombreEstrella());
      Assert.assertEquals(8.0, est.getMagnitud(), 0.001);
      Assert.assertEquals(false, est.getFaint());
/*    try {
         System.out.println(est.getComp2());
      } catch(java.lang.NullPointerException e) {
         System.out.println("Comp 2 is null.");         
      } */
   }

   @Test
   public void testEstimacionFichero2 () {
      String path = "src/test/resources/estimaciones.csv";
      FicheroEstimaciones ficheroEst = new FicheroEstimaciones(path, ";");
      Estimacion est = ficheroEst.getDatos("4");
      Assert.assertEquals("R Boo", est.getNombreEstrella());
      Assert.assertEquals(9.9, est.getMagnitud(), 0.001);
      Assert.assertEquals(true, est.getFaint());
/*    try {
         System.out.println(est.getComp2());
      } catch(java.lang.NullPointerException e) {
         System.out.println("Comp 2 is null.");         
      } */
   }

}
