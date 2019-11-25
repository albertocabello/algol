package algol.ui;

import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TextFieldFactory {

   public static JTextField createTextFieldWithLabel(Container container, int size, String labelText) {
      Box box = new Box(BoxLayout.X_AXIS);
      box.add(new JLabel(labelText + ": "));
      JTextField textField = new JTextField(size);
      box.add(textField);
      container.add(box);
      return textField;
   }
   
}
