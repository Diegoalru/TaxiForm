package UI;

import Main.FramesManager;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Register extends JFrame {
    private Home home;
    private JPanel Pnl_Register;
    private JTabbedPane TbP_Regster;
    private JLabel Lbl_Title;
    private JPanel Pnl_Fecha;
    private JPanel Pnl_Kilometraje;
    private JPanel Pnl_Ganancias;
    private JPanel Pnl_Gastos;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton Btn_validarDatos;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JProgressBar progressBar1;

    public Register(Home home) {
        this.home = home;

        initComponets();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(WindowEvent event){
                getFrame().dispose();
                home.setVisible(true);
                FramesManager.removeFrame();
            }
        });

        Btn_validarDatos.addActionListener(e -> {
            Thread thread = new Thread(() -> {

            });
            thread.start();
        });
    }

    private void initComponets() {
        setTitle("Registro");
        setName("Registro");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(Pnl_Register);
        setMinimumSize(new java.awt.Dimension(650, 550));
        setMaximumSize(new java.awt.Dimension(650, 550));
        setSize(650, 550);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }

    public Register getFrame(){
        return this;
    }

}
