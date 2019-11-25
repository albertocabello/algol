package algol.dao;

import java.text.DecimalFormat;

public class EstrellaVariable extends Estrella {

   public EstrellaVariable(String nombre) {
      super(nombre);
   }
   
   public EstrellaVariable(String nombre, String tipo,
                           double magnitudMax, double magnitudMin,
                           double periodo){
      super(nombre);
      this.setTipo(tipo);
      this.setMagnitudMax(magnitudMax);
      this.setMagnitudMin(magnitudMin);
      this.setPeriodo(periodo);
   }

   public EstrellaVariable(Estrella est){
      super(est);
   }
      
   public String getTipo() { return this.tipo; }
   @Override 
   public double getMagnitud() {
      this.magnitud = (this.getMagnitudMax() + this.getMagnitudMin())/2.0;
      this.magnitud = Math.round(this.magnitud*10)/10.0;
      return this.magnitud;
   }
   public double getMagnitudMax() { return this.magnitudMax; }
   public double getMagnitudMin() { return this.magnitudMin; }
   public double getPeriodo() { return this.periodo; }


   public void setTipo(String tipo) { this.tipo = tipo; }
   @Override
   public void setMagnitud(double magnitud) {
      this.magnitud = (this.getMagnitudMax() + this.getMagnitudMin())/2.0;
   }
   public void setMagnitudMax(double magnitudMax) { this.magnitudMax = magnitudMax; }
   public void setMagnitudMin(double magnitudMin) { this.magnitudMin = magnitudMin; }
   public void setPeriodo(double periodo) { this.periodo = periodo; }


   private String tipo;
   private double magnitudMax;
   private double magnitudMin;
   private double periodo;

}
