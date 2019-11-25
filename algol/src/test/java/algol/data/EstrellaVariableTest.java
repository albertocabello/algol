package algol.data;

import org.junit.Assert;
import org.junit.Test;

import algol.dao.EstrellaVariable;

public class EstrellaVariableTest {

   @Test
   public void testLeerEstrelladeFichero1 () {
      String path = "src/main/resources/variables.csv";
      FicheroEstrellasVariables ficheroEV = new FicheroEstrellasVariables(path, ";");
      EstrellaVariable ev = ficheroEV.getDatos("AF Cyg");
      Assert.assertEquals("SRB", ev.getTipo());
      Assert.assertEquals(7.1, ev.getMagnitud(), 0.001);
      Assert.assertEquals("M4-M8", ev.getEspectro());
   }
   
   @Test
   public void testLeerEstrelladeFichero2 () {
      String path = "src/main/resources/variables.csv";
      FicheroEstrellasVariables ficheroEV = new FicheroEstrellasVariables(path, ";");
      EstrellaVariable ev = ficheroEV.getDatos("omi Cet");
      Assert.assertEquals("M", ev.getTipo());
      Assert.assertEquals(-2, ev.getDec().getC1());
      Assert.assertEquals(2.0, ev.getMagnitudMax(), 0.001);
      Assert.assertEquals(10.1, ev.getMagnitudMin(), 0.001);
   }

}
