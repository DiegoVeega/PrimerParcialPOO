/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class MainClass {
    
    public static void main(String [] args){
        String PASS;
        do{
            //JOptionPane. 
           PASS=JOptionPane.showInputDialog("Bienvenido, por favor ingresa el PASSWORD: ");
           if(PASS.equals("ViñaRafinha")){
               JOptionPane.showMessageDialog(null, "Se inicio correctamente.");
           }
           else{
               JOptionPane.showMessageDialog(null, "El PASSWORD es incorrecto. Intentalo de nuevo.");
           }
        }while(PASS.equals("ViñaRafinha")==false);
        //MENU.
        Menu menu= new Menu();
        //agregar menu. mostrar
    }
}
