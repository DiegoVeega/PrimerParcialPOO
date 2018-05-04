package Sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
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
        Menu menu= Menu.getInstance();
        //agregar menu. mostrar este pedira un parametro para lograr mostrar todos los campos
    }
}