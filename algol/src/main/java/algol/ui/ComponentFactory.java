package algol.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ComponentFactory {

   public static JTextField createTextFieldWithLabel(Container container, int size, String labelText) {
      Box box = new Box(BoxLayout.X_AXIS);
      box.add(new JLabel(labelText + ":"));
      box.add(new Box.Filler(new Dimension(10, 10), new Dimension(10, 10), new Dimension(10, 10)));
      JTextField textField = new JTextField(size);
      box.add(textField);
      container.add(box);
      return textField;
   }

   public static JButton createButtonWithLabel(Container container, String labelText) {
      JButton button = new JButton(labelText);
      container.add(button);   
      return button;
   }   

}
