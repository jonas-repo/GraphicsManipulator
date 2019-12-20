
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonas
 */
public class ClaseDibujar {
    
    public void dibuja(ImageIcon image,JLabel area)
    {
     Icon icono1 = new ImageIcon(image.getImage().getScaledInstance(area.getWidth(), area.getHeight(),Image.SCALE_DEFAULT));
     area.setIcon(icono1);  
    }
    
    public void cambiarColor(JButton boton)
    {
     boton.setOpaque(false);
     boton.setContentAreaFilled(false);
     boton.setBorderPainted(false);
    }
    public void devolverColor(JButton boton)
    {
     boton.setOpaque(true);
     boton.setContentAreaFilled(true);
     boton.setBorderPainted(true);
    }
}
