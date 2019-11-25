package algol.ui;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PanelCatalogos extends JPanel {

   public PanelCatalogos() {
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      panelEstrellas = new PanelEstrellas();
      add(panelEstrellas);
      panelCartas = new PanelCartas();
      add(panelCartas);
      setVisible(true);
   }

   protected PanelEstrellas panelEstrellas;
   protected PanelCartas panelCartas;

}
