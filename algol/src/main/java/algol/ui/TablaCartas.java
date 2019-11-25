package algol.ui;

import java.awt.Dimension;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;

import algol.data.FicheroCartas;

public class TablaCartas extends JTable {
   
   public TablaCartas() {
      
      String[] columnas = {"Estrella", "Magn.", "Campo", "Carta"};
      setModel(new DefaultTableModel(columnas, 0));
      
      String path = "src/main/resources/cartas.csv";
      FicheroCartas ficheroCartas = new FicheroCartas(path, ";");
      int i = 1;
      while(ficheroCartas.getDatos("" + i) != null) {
         try {
            ((DefaultTableModel)getModel()).addRow((Object [])ficheroCartas.getDatos("" + i).toStrings());
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
         panelCartas.getEstrella().setText(model.getValueAt(getSelectedRow(), 0).toString());
         panelCartas.getFov().setText(model.getValueAt(getSelectedRow(), 1).toString());
         /* panelCartas.getMagn().setText(model.getValueAt(getSelectedRow(), 2).toString()); */
         panelCartas.getCarta().setText(model.getValueAt(getSelectedRow(), 3).toString());
      }
   }

   public PanelCartas getPanelCartas() {
      return this.panelCartas;
   }
   
   public void setPanelCartas(PanelCartas panelCartas) {
      this.panelCartas = panelCartas;
   }

   private PanelCartas panelCartas;
}
