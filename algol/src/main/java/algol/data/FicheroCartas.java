package algol.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import algol.dao.Carta;

public class FicheroCartas implements DatosCartas {


   public FicheroCartas(String ruta, String separador) {
      this.ruta = ruta;
      this.separador = separador;
   }

   @Override
   public Carta getDatos(String cartaID) {
      try {
         String linea;
         BufferedReader br = new BufferedReader(new FileReader(this.ruta));

         linea = br.readLine();
         String[] campos = linea.split(this.separador);
         for(int i = 0; i < campos.length; i++) {
            if (campos[i].equals("Estrella")) { this.campoEstrella = i; }
            if (campos[i].equals("Carta"))    { this.campoCarta = i;    }
            if (campos[i].equals("Campo"))    { this.campoCampo = i;    }
            if (campos[i].equals("Magn"))     { this.campoMagnitud = i; }
         }
         while ((linea = br.readLine()) != null) {
            String[] valores = linea.split(this.separador);
            if(valores[this.campoEstrella].equals(cartaID)) {
               Carta carta = new Carta(cartaID);
               if(this.campoMagnitud != -1) {
                  carta.setMagnitud(Double.parseDouble(valores[this.campoCampo]));
               }
               if(this.campoMagnitud != -1) {
                  carta.setMagnitud(Double.parseDouble(valores[this.campoMagnitud]));
               }
               carta.setEstrella(valores[this.campoEstrella]);
               return carta;
            }
            br.close();
         };
      } catch(Exception ex) {
         System.err.println(ex.toString());
      }
      return null;
   }
   
   protected String ruta;
   protected String separador;

   protected int campoEstrella = -1;
   protected int campoCampo    = -1;
   protected int campoCarta    = -1;
   protected int campoMagnitud = -1;

}
