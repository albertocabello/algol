package algol.dao;

public class Carta {

   public Carta(String cartaID) {
      this.setCartaID(cartaID);
   }

   public Carta(String cartaID, double campo,
                double magnitud, String estrella) {
      this.setCartaID(cartaID);
      this.setCampo(campo);
      this.setMagnitud(magnitud);
      this.setEstrella(estrella);
   }

   public String[] toStrings() {
      String[] campos = { estrella, "" + magnitud, "" + campo, cartaID};
      return campos;
   }
   
   public String getCartaID()  { return this.cartaID;  }
   public double getCampo()    { return this.campo;    }
   public double getMagnitud() { return this.magnitud; }
   public String getEstrella() { return this.estrella; }

   public void setCartaID(String cartaID)   { this.cartaID = cartaID;   }
   public void setCampo(double campo)       { this.campo = campo;       }
   public void setMagnitud(double magnitud) { this.magnitud = magnitud; }
   public void setEstrella(String estrella) { this.estrella = estrella; }

   private String cartaID;
   protected double campo;
   protected double magnitud;
   private String estrella;

}
