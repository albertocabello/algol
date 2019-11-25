package algol.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import algol.dao.Estrella;
import algol.dao.EstrellaVariable;

public class FicheroEstrellasVariables extends FicheroEstrellas implements DatosEstrellasVariables {


   public FicheroEstrellasVariables(String ruta, String separador) {
      super(ruta, separador);
   }

   @Override
   public EstrellaVariable getDatos(String estrellaID) {
      try {
         String linea;
         BufferedReader br = new BufferedReader(new FileReader(this.ruta));

         linea = br.readLine();
         String[] campos = linea.split(this.separador);
         for(int i = 0; i < campos.length; i++) {
            if (campos[i].equals("Nombre"))  { this.campoNombre = i;      }
            if (campos[i].equals("Max"))     { this.campoMagnitudMax = i; }
            if (campos[i].equals("Min"))     { this.campoMagnitudMin = i; }
            if (campos[i].equals("Periodo")) { this.campoPeriodo = i;     }
            if (campos[i].equals("Rango"))   { this.campoRango = i;       }
            if (campos[i].equals("Tipo"))    { this.campoTipo = i;        }
         }
         while ((linea = br.readLine()) != null) {
            String[] valores = linea.split(this.separador);
            if(valores[this.campoNombre].equals(estrellaID)) {
               EstrellaVariable ev = new EstrellaVariable(super.getDatos(estrellaID));
               ev.setTipo(valores[this.campoTipo]);
               if(this.campoMagnitudMax != -1) {
                  ev.setMagnitudMax(Double.parseDouble(valores[this.campoMagnitudMax]));
               }
               if(this.campoMagnitudMin != -1) {
                  ev.setMagnitudMin(Double.parseDouble(valores[this.campoMagnitudMin]));
               }
               if(this.campoRango != -1) {
                  String[] extremos = valores[this.campoRango].split("-");
                  ev.setMagnitudMax(Double.parseDouble(extremos[0]));
                  ev.setMagnitudMin(Double.parseDouble(extremos[1]));
               }
               ev.setPeriodo(Double.parseDouble(valores[this.campoPeriodo]));
               br.close();
               return ev;
            }
         };
      } catch(Exception ex) {
         System.err.println(ex.toString());
      }
      return null;
   }
   
   protected int campoMagnitudMax = -1;
   protected int campoMagnitudMin = -1;
   protected int campoPeriodo     = -1;
   protected int campoRango       = -1;
   protected int campoTipo        = -1;

}
