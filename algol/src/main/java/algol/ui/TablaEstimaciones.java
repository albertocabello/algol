package algol.ui;

import java.awt.Dimension;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;

import algol.data.DiaJuliano;
import algol.data.FicheroEstimaciones;

public class TablaEstimaciones extends JTable {
   
   public TablaEstimaciones() {
      
      String[] columnas = {"Nombre", "Magn.", "Comp 1", "Comp 2", "Fecha", "Carta"};
      setModel(new DefaultTableModel(columnas, 0));
      
      String path = "src/main/resources/estimaciones.csv";
      FicheroEstimaciones ficheroEst = new FicheroEstimaciones(path, ";");
      int i = 1;
      while(ficheroEst.getDatos("" + i) != null) {
         try {
            ((DefaultTableModel)getModel()).addRow((Object [])ficheroEst.getDatos("" + i).toStrings());
         } catch (java.lang.NullPointerException ex) {
         }
         i++;
      }

      setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      setPreferredScrollableViewportSize(new Dimension(600, 400));
   }
   
   @Override
   public boolean isCellEditable(int row, int column) {
      return false;
   }
   
   @Override
   public void valueChanged(ListSelectionEvent event) {
      super.valueChanged(event);
      TableModel model = this.getModel();
      if(getSelectedRow() != -1) {
         panelEstimacion.getEstrella().setText(model.getValueAt(getSelectedRow(), 0).toString());
         panelEstimacion.getMagn().setText(model.getValueAt(getSelectedRow(), 1).toString());
         panelEstimacion.getComp1().setText(model.getValueAt(getSelectedRow(), 2).toString());
         panelEstimacion.getComp2().setText(model.getValueAt(getSelectedRow(), 3).toString());
         panelEstimacion.getDiaJuliano().setText(model.getValueAt(getSelectedRow(), 4).toString());
         panelEstimacion.getCarta().setText(model.getValueAt(getSelectedRow(), 5).toString());
         {
            Double diaJuliano = Double.parseDouble(model.getValueAt(getSelectedRow(), 4).toString());
            panelEstimacion.getFecha().setText(DiaJuliano.JD2Day(diaJuliano));
            panelEstimacion.getHora().setText(DiaJuliano.JD2Hour(diaJuliano));
         }
      }
   }

   public PanelEstimacion getPanelEstimacion() {
      return this.panelEstimacion;
   }
   
   public void setPanelEstimacion(PanelEstimacion panelEstimacion) {
      this.panelEstimacion = panelEstimacion;
   }

   private PanelEstimacion panelEstimacion;
}
