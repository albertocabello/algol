package algol.data;

import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import algol.dao.Coord;
import algol.dao.Estimacion;

public class FicheroEstimaciones implements DatosEstimaciones {


   public FicheroEstimaciones(String ruta, String separador) {
      this.ruta = ruta;
      this.separador = separador;
   }

   @Override
   public Estimacion getDatos(String EstimacionID) {
      try {
         String linea;
         BufferedReader br = new BufferedReader(new FileReader(this.ruta));

         linea = br.readLine();
         String[] campos = linea.split(this.separador);
         for(int i = 0; i < campos.length; i++) {
            if (campos[i].equals("ID"))       { this.campoID = i;       }
            if (campos[i].equals("Estrella")) { this.campoEstrella = i; }
            if (campos[i].equals("Magnitud")) { this.campoMagnitud = i; }
            if (campos[i].equals("Magn"))     { this.campoMagnitud = i; }
            if (campos[i].equals("Comp1"))    { this.campoComp1 = i;    }
            if (campos[i].equals("Comp2"))    { this.campoComp2 = i;    }
            if (campos[i].equals("Fecha"))    { this.campoFecha = i;    }
            if (campos[i].equals("Carta"))    { this.campoCarta = i;    }
         }
         if ((this.campoID==-1)||(this.campoEstrella==-1)||(this.campoMagnitud==-1)||(this.campoComp1==-1)||(this.campoComp2==-1)||(this.campoFecha==-1)||(this.campoCarta==-1)) {
            System.err.println("" + this.campoID + this.campoEstrella + this.campoMagnitud + this.campoComp1 + this.campoComp2 + this.campoFecha + this.campoCarta);
            throw new java.lang.RuntimeException("Falta algún campo requerido.");
		 }
         while ((linea = br.readLine()) != null) {
            String[] valores = linea.split(this.separador);

            if(valores[this.campoID].equals(EstimacionID)) {
               Boolean faint = false;
               double magnitud;
               if(valores[this.campoMagnitud].substring(0, 1).equals("<")){
                  faint = true;
                  valores[this.campoMagnitud] = valores[this.campoMagnitud].substring(1);
               }
               magnitud = Double.parseDouble(valores[this.campoMagnitud]);
               Estimacion est =
                  new Estimacion(valores[this.campoEstrella],
                                 magnitud,
                                 faint,
                                 valores[this.campoComp1],
                                 DiaJuliano.JD2Date(Double.parseDouble(valores[this.campoFecha])),
                                 valores[this.campoCarta]
                                );
               if(!(valores[this.campoComp2]).equals("na")) {
                  est.setComp2(valores[this.campoComp2]);
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

   protected int campoID       = -1;
   protected int campoEstrella = -1;
   protected int campoMagnitud = -1;
   protected int campoFaint    = -1;
   protected int campoComp1    = -1;
   protected int campoComp2    = -1;
   protected int campoFecha    = -1;
   protected int campoCarta    = -1;

}
