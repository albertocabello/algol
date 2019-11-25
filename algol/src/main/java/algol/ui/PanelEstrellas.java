package algol.ui;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEstrellas extends JPanel {

   public PanelEstrellas() {

      estrella = ComponentFactory.createTextFieldWithLabel(this, 6, "Estrella");
      ar = ComponentFactory.createTextFieldWithLabel(this, 12, "AR");
      dec = ComponentFactory.createTextFieldWithLabel(this, 12, "Dec");
      magnitud = ComponentFactory.createTextFieldWithLabel(this, 5, "Magnitud");
      espectro = ComponentFactory.createTextFieldWithLabel(this, 20, "Espectro");

      tipo = ComponentFactory.createTextFieldWithLabel(this, 10, "Tipo");
      magnitudMax = ComponentFactory.createTextFieldWithLabel(this, 5, "Máx");
      magnitudMin = ComponentFactory.createTextFieldWithLabel(this, 5, "Mín");
      periodo = ComponentFactory.createTextFieldWithLabel(this, 8, "Periodo");
      
      setVisible(true);
   }

   public JTextField getEstrella() {
      return this.estrella;
   }

   public JTextField getAr() {
      return this.ar;
   }

   public JTextField getDec() {
      return this.dec;
   }

   public JTextField getMagnitud() {
      return this.magnitud;
   }

   public JTextField getEspectro() {
      return this.espectro;
   }

   public JTextField getTipo() {
      return this.tipo;
   }

   public JTextField getMagnitudMax() {
      return this.magnitudMax;
   }

   public JTextField getMagnitudMin() {
      return this.magnitudMin;
   }

   public JTextField getPeriodo() {
      return this.periodo;
   }

   private JTextField estrella;
   private JTextField ar;
   private JTextField dec;
   private JTextField magnitud;
   private JTextField espectro;

   private JTextField tipo;
   private JTextField magnitudMax;
   private JTextField magnitudMin;
   private JTextField periodo;

}
