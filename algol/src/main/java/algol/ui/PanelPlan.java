package algol.ui;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPlan extends JPanel {

   public PanelPlan() {
      fecha = ComponentFactory.createTextFieldWithLabel(this, 10, "Fecha");
      magLim = ComponentFactory.createTextFieldWithLabel(this, 5, "Mag. lím");
      setVisible(true);
   }

   public JTextField getFecha() {
      return this.fecha;
   }

   public JTextField getMagLim() {
      return this.magLim;
   }

   private JTextField fecha;
   private JTextField magLim;

}
