/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio2;
import javax.swing.*;

/**
 *
 * @author Isaac
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        int result = 0;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor de X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor de Y"));
        
        if ((x<0)||(y<0)||(x>255)||(y>255)) 
        {
            result=-1;
            JOptionPane.showMessageDialog(null, "El resltado es "+result);
        }
        else
        {
            int[] array=new int[y];
            array[0]=x;
            for (int i = 1; i < array.length; i++) {
                x=x*(i+1);
                array[i]=x;
            }
            for (int i = 0; i < array.length; i++) {
                do {
                    result=array[i];
                } while (i==y);
            }
            JOptionPane.showMessageDialog(null, "El resultado es "+ result);

        }

    }
    
}

        

