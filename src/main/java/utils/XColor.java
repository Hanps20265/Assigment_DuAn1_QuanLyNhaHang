
package utils;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JComponent;

public class XColor {
    public static Color color = new Color(255,255,204);
    public static Color extraColor = new Color(255,204,102);
    
    public static Color chonMau(JComponent pnl) {
        Color initialBackground = pnl.getBackground();
//        Color background = JColorChooser.showDialog(null, "JColorChooser Sample", initialBackground);
//        if (background != null) {
//            pnl.setBackground(background);
//        }
        return JColorChooser.showDialog(null, "JColorChooser Sample", initialBackground);
    }
    
    public static void resetColor(){
        color = new Color(255,255,204);
        extraColor = new Color(255,204,102);
    }
}
