package algol.ui;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelGrafico extends JPanel {

   public PanelGrafico() {

      estrella = ComponentFactory.createTextFieldWithLabel(this, 6, "Estrella");
      fechaInicial = ComponentFactory.createTextFieldWithLabel(this, 10, "Fecha inicial");
      fechaFinal = ComponentFactory.createTextFieldWithLabel(this, 10, "Fecha final");
      magMax = ComponentFactory.createTextFieldWithLabel(this, 5, "Mag. máx.");
      magMin = ComponentFactory.createTextFieldWithLabel(this, 5, "Mag. mín.");

      setVisible(true);
   }

   public JTextField getEstrella() {
      return this.estrella;
   }

   public JTextField getFechaInicial() {
      return this.fechaInicial;
   }

   public JTextField getFechaFinal() {
      return this.fechaFinal;
   }

   public JTextField getMagMax() {
      return this.magMax;
   }

   public JTextField getMagMin() {
      return this.magMin;
   }

   private JTextField estrella;
   private JTextField fechaInicial;
   private JTextField fechaFinal;
   private JTextField magMax;
   private JTextField magMin;

}
