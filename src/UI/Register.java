package UI;

import Main.FramesManager;
import javax.swing.*;;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.LinkedList;

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
    private JComboBox Cmb_FechaA;
    private JComboBox Cmb_FechaM;
    private JComboBox Cmb_FechaD;
    private JProgressBar Pgb_Estado;
    private JLabel Lbl_Validacion;

    public Register(Home home) {
        this.home = home;

        initComponets();
        setComboBoxModelFecha();

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

    private void setComboBoxModelFecha() {
        String[] listYear = new String[1];
        String[] listMonth = new String[12];
        String[] listDay = new String[31];

        listYear[0] = "2021";
        for (int i = 0; i < listMonth.length; i++) listMonth[i] = Integer.toString(i + 1);
        for (int i = 0; i < listDay.length; i++) listDay[i] = Integer.toString(i + 1);

        Cmb_FechaA.setModel(new javax.swing.DefaultComboBoxModel<>(listYear));
        Cmb_FechaM.setModel(new javax.swing.DefaultComboBoxModel<>(listMonth));
        Cmb_FechaD.setModel(new javax.swing.DefaultComboBoxModel<>(listDay));
    }

    private void initComponets() {
        setTitle("Registro");
        setName("Registro");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(Pnl_Register);
        setMinimumSize(new java.awt.Dimension(550, 450));
        setMaximumSize(new java.awt.Dimension(550, 450));
        setSize(550, 450);
        setLocationRelativeTo(null);
        setVisible(true);
        Pgb_Estado.setVisible(false);
        pack();
    }

    public Register getFrame(){
        return this;
    }

}
