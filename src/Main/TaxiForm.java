package Main;

import UI.Home;
import javax.swing.*;

public class TaxiForm {

    public static void main(String[] args) {
        if (checkLibraries()){
            start();
        } else {
            System.err.println("The program could not be executed.");
            //TODO: Crear lista de numeros de error.
        }
    }

    private static boolean checkLibraries() {
        // Todo: Crear metodo para validar que existan todas las librerias necesarias.
        return true;
    }

    private static void start() {
        System.out.println("Stating Program...");
        if (FramesManager.getOpenFrames() == 0){
            FramesManager.addNewFrame();

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    JFrame homeFrame = new Home();
                    homeFrame.setVisible(true);
                }
            });

        } else {
            JOptionPane.showMessageDialog(null, "¡Error Critico! El programa ya esta en ejecución. Cierre todas las ventanas abiertas y vuelva a ejecutar.");
        }
    }
}
