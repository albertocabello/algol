package algol.ui;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class PanelEstimacion extends JPanel {

   public PanelEstimacion() {
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            
      JPanel datosEstrella = new JPanel();
      datosEstrella.setLayout(new BoxLayout(datosEstrella, BoxLayout.X_AXIS));
      estrella = ComponentFactory.createTextFieldWithLabel(datosEstrella, 6, "Estrella");
      carta = ComponentFactory.createTextFieldWithLabel(datosEstrella, 8, "Carta");
      datosEstrella.setMaximumSize(datosEstrella.getPreferredSize());
      add(datosEstrella);
      
      JPanel horaEstimacion = new JPanel();
      horaEstimacion.setLayout(new BoxLayout(horaEstimacion, BoxLayout.X_AXIS));
      fecha = ComponentFactory.createTextFieldWithLabel(horaEstimacion, 10, "Fecha");
      hora = ComponentFactory.createTextFieldWithLabel(horaEstimacion, 5, "Hora");
      diaJuliano = ComponentFactory.createTextFieldWithLabel(horaEstimacion, 12, "Día Juliano");
      horaEstimacion.setMaximumSize(horaEstimacion.getPreferredSize());
      add(horaEstimacion);

      JPanel datosEstimacion = new JPanel();
      datosEstimacion.setLayout(new BoxLayout(datosEstimacion, BoxLayout.X_AXIS));
      magn = ComponentFactory.createTextFieldWithLabel(datosEstimacion, 5, "Magn.");
      comp1 = ComponentFactory.createTextFieldWithLabel(datosEstimacion, 4, "Comp. 1");
      comp2 = ComponentFactory.createTextFieldWithLabel(datosEstimacion, 4, "Comp. 2");
      datosEstimacion.setMaximumSize(datosEstimacion.getPreferredSize());
      add(datosEstimacion);

      estimaciones = new TablaEstimaciones();
      JScrollPane scrollTablaEstimaciones = new JScrollPane(estimaciones,
         JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
         JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      scrollTablaEstimaciones.setPreferredSize(new Dimension(600, 400));
      add(scrollTablaEstimaciones);
      estimaciones.setPanelEstimacion(this);

      setVisible(true);

   }

   public JTextField getEstrella() {
      return this.estrella;
   }

   public JTextField getCarta() {
      return this.carta;
   }

   public JTextField getFecha() {
      return this.fecha;
   }

   public JTextField getHora() {
      return this.hora;
   }

   public JTextField getDiaJuliano() {
      return this.diaJuliano;
   }

   public JTextField getMagn() {
      return this.magn;
   }

   public JTextField getComp1() {
      return this.comp1;
   }

   public JTextField getComp2() {
      return this.comp2;
   }

   public TablaEstimaciones estimaciones() {
      return this.estimaciones;
   }

   private JTextField estrella;
   private JTextField carta;
   private JTextField fecha;
   private JTextField hora;
   private JTextField diaJuliano;
   private JTextField magn;
   private JTextField comp1;
   private JTextField comp2;

   private TablaEstimaciones estimaciones;

}
