package algol.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import algol.dao.Coord;
import algol.dao.Estrella;

public class FicheroEstrellas implements DatosEstrellas {


   public FicheroEstrellas(String ruta, String separador) {
      this.ruta = ruta;
      this.separador = separador;
   }

   @Override
   public Estrella getDatos(String estrellaID) {
      try {
         String linea;
         BufferedReader br = new BufferedReader(new FileReader(this.ruta));

         linea = br.readLine();
         String[] campos = linea.split(this.separador);
         for(int i = 0; i < campos.length; i++) {
            if (campos[i].equals("Nombre"))   { this.campoNombre = i;   }
            if (campos[i].equals("AR"))       { this.campoAr = i;       }
            if (campos[i].equals("Dec"))      { this.campoDec = i;      }
            if (campos[i].equals("Espectro")) { this.campoEspectro = i; }
            if (campos[i].equals("Magnitud")) { this.campoMagnitud = i; }
         }
         while ((linea = br.readLine()) != null) {
            String[] valores = linea.split(this.separador);
            if(valores[this.campoNombre].equals(estrellaID)) {
               Estrella est = new Estrella(estrellaID);
               est.setAr(new Coord(valores[this.campoAr]));
               est.setDec(new Coord(valores[this.campoDec]));
               est.setEspectro(valores[this.campoEspectro]);
               if(this.campoMagnitud != -1) {
                  est.setMagnitud(Double.parseDouble(valores[this.campoMagnitud]));
               }
               br.close();
               return est;
            }
         };
      } catch(Exception ex) {
         System.err.println(ex.toString());
      }
      return null;
   }
   
   protected String ruta;
   protected String separador;

   protected int campoNombre   = -1;
   protected int campoAr       = -1;
   protected int campoDec      = -1;
   protected int campoEspectro = -1;
   protected int campoMagnitud = -1;

}
