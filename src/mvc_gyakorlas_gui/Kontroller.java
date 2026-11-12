package mvc_gyakorlas_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Kontroller {

    private Nezet nezet;

    public Kontroller(Nezet nezet) {
        this.nezet = nezet;

        JCheckBox cb = nezet.getjCheckBox1();

        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    nezet.getjTextArea1().append("a checkbox be van pipálva\n");
                } else {
                    nezet.getjTextArea1().append("a checkbox nincs pipálva\n");
                }
            }
        });

        JButton btn = nezet.getjButton1();

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nezet.getjCheckBox1().setSelected(true);
                nezet.getJtextField1("lefutott!");
                nezet.getJComboBox("új elem");

                System.out.println("a kattintás lefutott");
            }
        });
    }
}