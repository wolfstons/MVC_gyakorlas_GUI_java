
package mvc_gyakorlas_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Kontroller {
    private Nezet  nezet;
    

    public Kontroller(Nezet nezet) {
        this.nezet = nezet;
    
    
    
   
        JButton btn =nezet.getjButton1();
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nezet.getjCheckBox1().setSelected(true);
                nezet.getJtextField1("lefutott!\n");
                nezet.getJComboBox("új elem");
                System.out.println("a kattintás lefutott");
            }
        } );
                
    }
    
}
