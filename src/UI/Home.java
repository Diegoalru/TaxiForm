package UI;

import Main.FramesManager;

import javax.swing.*;

public class Home  extends JFrame {
    private JButton Btn_RegisterTicket;
    private JButton Btn_SeekTicket;
    private JButton Btn_UpdateTicket;
    private JPanel Pnl_Home;
    private JLabel Lbl_Title;

    public Home() {
        initComponents();

        Btn_RegisterTicket.addActionListener(e -> {
            hideForm();
            FramesManager.addNewFrame();
            new Register(getFrame());
        });

        Btn_SeekTicket.addActionListener(e -> JOptionPane.showMessageDialog(null, "Está función aún no ha sido implementada.", "Mensaje", JOptionPane.INFORMATION_MESSAGE));

        Btn_UpdateTicket.addActionListener(e -> JOptionPane.showMessageDialog(null, "Está función aún no ha sido implementada.", "Mensaje", JOptionPane.INFORMATION_MESSAGE));
    }

    private void initComponents() {
        setTitle("Inicio");
        setName("Inicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Pnl_Home);
        setMinimumSize(new java.awt.Dimension(235, 325));
        setMaximumSize(new java.awt.Dimension(235, 325));
        setSize(235, 325);
        setLocationRelativeTo(null);
        pack();
    }

    private void hideForm() {
        this.setVisible(false);
    }

    public Home getFrame(){
        return this;
    }
}

