package algol.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class VentanaPrincipal extends JFrame {

   public VentanaPrincipal() {
      setSize(760, 550);
      setLocation(100, 100);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setContentPane(new JTabbedPane());
      panelEstimacion = new PanelEstimacion();
      getContentPane().add("Estimaciones", panelEstimacion);
      panelGrafico = new PanelGrafico();
      getContentPane().add("Gráfica", panelGrafico);
      panelCatalogos = new PanelCatalogos();
      getContentPane().add("Catálogos", panelCatalogos);
      panelPlan = new PanelPlan();
      getContentPane().add("Plan", panelPlan);
      setVisible(true);
   }

   public PanelEstimacion panelEstimacion;
   public PanelGrafico panelGrafico;
   public PanelCatalogos panelCatalogos;
   public PanelPlan panelPlan;

}
