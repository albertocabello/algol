package algol.ui;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class PanelCartas extends JPanel {

   public PanelCartas() {

      estrella = ComponentFactory.createTextFieldWithLabel(this, 6, "Estrella");
      fov = ComponentFactory.createTextFieldWithLabel(this, 6, "Campo de visión");
      carta = ComponentFactory.createTextFieldWithLabel(this, 10, "Chart ID");

      anadir = ComponentFactory.createButtonWithLabel(this, "Añadir");
      borrar = ComponentFactory.createButtonWithLabel(this, "Borrar");
      guardar = ComponentFactory.createButtonWithLabel(this, "Guardar");

      cartas = new TablaCartas();
      JScrollPane scrollTablaCartas = new JScrollPane(cartas,
         JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
         JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      scrollTablaCartas.setPreferredSize(new Dimension(600, 400));
      add(scrollTablaCartas);
      cartas.setPanelCartas(this);
      
      setVisible(true);
   }

   public JTextField getEstrella() {
      return this.estrella;
   }

   public JTextField getFov() {
      return this.fov;
   }

   public JTextField getCarta() {
      return this.carta;
   }

   public JButton getAnadir() {
      return this.anadir;
   }

   public JButton getBorrar() {
      return this.borrar;
   }

   public JButton getGuardar() {
      return this.guardar;
   }

   public TablaCartas cartas() {
      return this.cartas;
   }


   private JTextField estrella;
   private JTextField fov;
   private JTextField carta;
   
   private JButton anadir;
   private JButton guardar;
   private JButton borrar;

   private TablaCartas cartas;


}
