package algol.dao;

public class Estrella {

   public Estrella(String nombre) {
      this.setNombre(nombre);
   }

   public Estrella(String nombre, Coord ar, Coord dec,
                   double magnitud, String espectro) {
      this.setNombre(nombre);
      this.setAr(ar);
      this.setDec(dec);
      this.setMagnitud(magnitud);
      this.setEspectro(espectro);
   }
   
   public Estrella(Estrella est){
      this.setNombre(est.getNombre());
      this.setAr(est.getAr());
      this.setDec(est.getDec());
      this.setMagnitud(est.getMagnitud());
      this.setEspectro(est.getEspectro());
   }

   public String getNombre() { return this.nombre; }
   public Coord getAr() { return this.ar; }
   public Coord getDec() { return this.dec; }
   public double getMagnitud() { return this.magnitud; }
   public String getEspectro() { return this.espectro; }

   public void setNombre(String nombre) { this.nombre = nombre; }
   public void setAr(Coord ar) { this.ar = ar; }
   public void setDec(Coord dec) { this.dec = dec; }
   public void setMagnitud(double magnitud) { this.magnitud = magnitud; }
   public void setEspectro(String espectro) { this.espectro = espectro; }

   private String nombre;
   private Coord ar;
   private Coord dec;
   protected double magnitud;
   private String espectro;

}
