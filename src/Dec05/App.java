package Dec05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class App extends JFrame {
    private JPanel pnlMain;
    private JTextField tfName;
    private JButton btnOk;
    private JRadioButton rbF1;
    private JRadioButton rbF2;
    private JRadioButton rbF3;
    private JTextArea taOutput;
    private JComboBox cbProgram;
    private JCheckBox cbSerato;
    private JCheckBox cbArellano;
    private JCheckBox cbBacalso;

    private List<JRadioButton> bgSections;
    private List<JCheckBox> bgTeachers;

    public App() {
        taOutput.setBackground(Color.BLACK);
        taOutput.setForeground(Color.WHITE);
        bgSections = new ArrayList<>();
        bgSections.add(rbF1);
        bgSections.add(rbF2);
        bgSections.add(rbF3);
        bgTeachers = new ArrayList<>();
        bgTeachers.add(cbSerato);
        bgTeachers.add(cbArellano);
        bgTeachers.add(cbBacalso);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name_entered();
            }
        });

        tfName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    name_entered();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        App app = new App();
        app.setContentPane(app.pnlMain);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void name_entered() {
        int result = JOptionPane.showConfirmDialog(pnlMain, "ARE YOU SURE?");
        if (result != JOptionPane.YES_OPTION) {
            System.out.println("User not sure");
            return;
        } else {
            result = JOptionPane.showConfirmDialog(pnlMain, "ARE YOU REALLY REALLY SURE?");
            if (result != JOptionPane.YES_OPTION) {
                System.out.println("User not really really sure");
                return;
            }
        }
        int count_teachers = 0;
        for (JCheckBox cb : bgTeachers) {
            if (cb.isSelected()) {
                count_teachers++;
            }
        }
        if (count_teachers > 2) {
            JOptionPane.showMessageDialog(pnlMain, "You exceeded 2 teachers.");
            return;
        }
        String name = tfName.getText();

//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt", true))) {
            taOutput.setText(taOutput.getText() + name);
            for (JRadioButton rb : bgSections) {
                if (rb.isSelected()) {
                    taOutput.setText(taOutput.getText() + " belongs to section " + rb.getText() +"\n");
                }
            }
            taOutput.setText(taOutput.getText() + cbProgram.getSelectedItem());
        taOutput.setText(taOutput.getText() + "\nLIST OF TEACHERS:");
        for (JCheckBox cb : bgTeachers) {
            if (cb.isSelected()) {
                taOutput.setText(taOutput.getText() + cb.getText() + "\n");
            }
        }
//        } catch (IOException ex) {
//            System.err.println("ERROR");
//        }
        tfName.setEditable(false);
            btnOk.setEnabled(false);
    }
}
