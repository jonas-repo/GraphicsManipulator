
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSlider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonas
 */
public class HiloEscalado extends Thread {
    
    ImageIcon imagen;
    JLabel areaDibujo;
    boolean opc;
    JSlider deslizador;
    
    public HiloEscalado(ImageIcon imagen,JLabel areaDibujo,boolean opc, JSlider deslizador)
    {
     this.areaDibujo=areaDibujo;
     this.imagen=imagen;
     this.opc=opc;
     this.deslizador=deslizador;
    }
    public void run()
    {
     if(opc)
     {
      int x=0;
      
      while(true)
      {
        if(deslizador.getValue()<100)
        {
        Icon icono1 = new ImageIcon(imagen.getImage().getScaledInstance(areaDibujo.getWidth()+x, areaDibujo.getHeight()+x,Image.SCALE_DEFAULT));
        areaDibujo.setIcon(icono1);
        areaDibujo.setBounds(areaDibujo.getX(), areaDibujo.getY(), areaDibujo.getWidth()+x, areaDibujo.getHeight()+x);
        dormir();
        x=+10;
       
        deslizador.setValue(deslizador.getValue()+3);
        }
      }
     }
     else
     {
      int x=0;
      
      while(true)
      {
        if(deslizador.getValue()>0)
        {
        Icon icono1 = new ImageIcon(imagen.getImage().getScaledInstance(areaDibujo.getWidth()+x, areaDibujo.getHeight()+x,Image.SCALE_DEFAULT));
        areaDibujo.setIcon(icono1);
         areaDibujo.setBounds(areaDibujo.getX(), areaDibujo.getY(), areaDibujo.getWidth()+x, areaDibujo.getHeight()+x);
        dormir();
        x=-10;
        
        deslizador.setValue(deslizador.getValue()-3);
        }
      }
     }
    }
    
    
    void dormir()
    {
     try 
     {
      Thread.sleep(100);
     }
     catch (InterruptedException ex) 
     {
      Logger.getLogger(HiloTraslacionArriba.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    
}
