
package spp.equipoamarillo.pf.p2;
import java.util.*;
import javax.swing.*;
public class SPPEquipoAmarilloPFP2 {

    public static void main(String[] args) {
        int i = 0;
        double dummy = 0, gastoT = 0;
        double [] gasto = new double [100]; 
        
        do{
            gasto [i] = pedirgasto();
            dummy = gasto[i];
            if (gasto[i] > 0){
                gastoT = gastoT + gasto[i];
            }
            i++;
        } while (dummy > 0);
        JOptionPane.showMessageDialog(null, "Los gastos fueron " + gastosM(gasto) + ". Tu gasto total fue de " + gastoT + ".");
    }    
    
    public static double pedirgasto (){
        boolean flag;
        String gastoP = "";
        double gasto = 0;
        do{
                gastoP = JOptionPane.showInputDialog(null, "Introduce tu gasto");
                try{
                    gasto = Double.parseDouble(gastoP);
                    flag = false;
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Error, el dato no es un numero");
                    flag = true;
                }
                } while (flag);
        return gasto;
    }
    
    public static String gastosM (double [] matriz){
        int i = 0;
        String x = "", y = "";
        while (matriz[i] > 0) {
            x = String.valueOf(matriz[i]);
            y = x + "  " + y;
            i++;
        }
        return y;
    }   
}
