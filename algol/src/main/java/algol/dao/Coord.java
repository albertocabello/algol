package algol.dao;

public class Coord {

   public Coord(int c1, int c2, double c3) {
      this.c1 = c1;
      this.c2 = c2;
      this.c3 = c3;
   }
   
   public Coord(String coords) {
      String[] valores = coords.split(":");
      this.c1 = Integer.parseInt(valores[0]);
      this.c2 = Integer.parseInt(valores[1]);
      this.c3 = Double.parseDouble(valores[2]);
   }

   public int getC1() { return this.c1; }
   public int getC2() { return this.c2; }
   public double getC3() { return this.c3; }

   public void setC1(int c1) { this.c1=c1; }
   public void setC2(int c3) { this.c2=c2; }
   public void setC3(double c3) { this.c3=c3; }

   private int c1;
   private int c2;
   private double c3;

}
