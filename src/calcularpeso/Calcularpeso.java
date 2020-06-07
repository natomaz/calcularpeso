package calcularpeso;

import javax.swing.JOptionPane;

public class Calcularpeso {
    public static void main(String[] args) {
        double pesoatual, engordar, emagrecer;
        
        pesoatual = Double.parseDouble (JOptionPane.showInputDialog("Informar peso atual:"));
        
        engordar = pesoatual * 0.15;
        emagrecer = pesoatual * 0.20;
        
        JOptionPane.showMessageDialog(null, "Se engordar 15% a pessoa irá pesar: "+(engordar+pesoatual)+"kg.");
        JOptionPane.showMessageDialog(null, "Se emagrecer 20% a pessoa irá pesar: "+(pesoatual-emagrecer)+"kg.");
    }
    
}
