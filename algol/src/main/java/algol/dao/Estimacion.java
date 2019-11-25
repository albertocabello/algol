package algol.dao;

import java.text.DecimalFormat;
import java.util.Date;

import algol.data.DiaJuliano;

public class Estimacion {

   private static DecimalFormat df4 = new DecimalFormat(".####");

   public Estimacion(Estrella estrella, double magnitud, Boolean faint, String comp1, Date fecha, String carta) {
      this.estrella = estrella;
      this.magnitud = magnitud;
      this.faint = faint;
      this.comp1 = comp1;
      this.fecha = fecha;
      this.carta = carta;
   }

   public Estimacion(Estrella estrella, double magnitud, Boolean faint, String comp1, String comp2, Date fecha, String carta) {
      this.estrella = estrella;
      this.magnitud = magnitud;
      this.faint = faint;
      this.comp1 = comp1;
      this.comp2 = comp2;
      this.fecha = fecha;
      this.carta = carta;
   }

   public Estimacion(String estrella, double magnitud, Boolean faint, String comp1, Date fecha, String carta) {
      this.estrella = new Estrella(estrella);
      this.magnitud = magnitud;
      this.faint = faint;
      this.comp1 = comp1;
      this.fecha = fecha;
      this.carta = carta;
   }

   public Estimacion(String estrella, double magnitud, Boolean faint, String comp1, String comp2, Date fecha, String carta) {
      this.estrella = new Estrella(estrella);
      this.magnitud = magnitud;
      this.faint = faint;
      this.comp1 = comp1;
      this.fecha = fecha;
      this.comp2 = comp2;
      this.carta = carta;
   }

   public String toString() {
      if (comp2==null) {
         comp2="na";
      }
      String menorQue = "";
      if (faint) {
         menorQue = "<";
      }
      // long julianDay = Math.round((fecha.getTime()/(1000.0*86400.0) + 2440587.5)*10000);
      // return estrella.getNombre() + ";" + julianDay/10000.0 + ";" + menorQue+magnitud + ";" + "na_faint" + ";" + comp1 + ";" + comp2string + ";" + carta + ";" + "na" ;
      return estrella.getNombre() + ";" + DiaJuliano.Date2JD(fecha) + ";" + menorQue + magnitud + ";" + "na_faint" + ";" + comp1 + ";" + comp2 + ";" + carta + ";" + "na" ;
   }

   public String[] toStrings() {
      String[] campos = {this.getNombreEstrella(), "" + magnitud, comp1,
                         "" + comp2, "" + DiaJuliano.Date2JD(fecha), carta};
      return campos;
   }

   public String tipoEstimacion() {
      if (comp2.equals("na")) {
         return "Una sola comparación.";
      } else {
         return "Dos comparaciones.";
      }
   }

   public String getNombreEstrella() { return this.estrella.getNombre(); }
   
   public Estrella getEstrella()     { return this.estrella; }
   public double getMagnitud()       { return this.magnitud; }
   public Boolean getFaint()         { return this.faint; }
   public String getComp1()          { return this.comp1; }
   public String getComp2()          { return this.comp2; }
   public Date getFecha()            { return this.fecha; }
   public String getCarta()          { return this.carta; }

   public void setEstrella(Estrella estrella) { this.estrella = estrella; }
   public void setMagnitud(double magnitud)   { this.magnitud = magnitud; }
   public void setFaint(Boolean faint)        { this.faint = faint; }
   public void setComp1(String comp1)         { this.comp1 = comp1; }
   public void setComp2(String comp2)         { this.comp2 = comp2; }
   public void setFecha(Date fecha)           { this.fecha = fecha; }
   public void setCarta(String carta)         { this.carta = carta; }

   private Estrella estrella;
   private Double magnitud;
   private Boolean faint;
   private String comp1;
   private String comp2;
   private Date fecha;
   private String carta;

}
