
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class HiloTraslacionArriba extends Thread{
    
    
    int opc;
    JLabel areaDibujo;
    public HiloTraslacionArriba(int opc ,JLabel areaDibujo) //Opc indica que boton se está usando y areaDibujo la etiqueta dentro de panel
    {
      this.opc=opc;
      this.areaDibujo=areaDibujo;
    }
    public void run()
    {
     int x=0,y=0;
     switch(opc)
     {
         case 1:
           while(true)
            {
              areaDibujo.setLocation(areaDibujo.getX(), areaDibujo.getY()+y);   // mover -10 pixeles la etiqueta
              y=-10;                                                            // aumentar segun se deje presionado
              dormir();                                                         // mandar llamar la funcion de sleep
            }
         case 2:
           while(true)
           {
              areaDibujo.setLocation(areaDibujo.getX(), areaDibujo.getY()+y);
              y=+10;
              dormir();
           }
         case 3:
           while(true)
           {
              areaDibujo.setLocation(areaDibujo.getX()+x, areaDibujo.getY());
              x=+10;
              dormir();
           }
         case 4:
           while(true)
           {
              areaDibujo.setLocation(areaDibujo.getX()+x, areaDibujo.getY());
              x=-10;
              dormir();
           }
     }
    
    }
    void dormir()
    {
     try {
              Thread.sleep(100);
          } catch (InterruptedException ex) {
              Logger.getLogger(HiloTraslacionArriba.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
}
