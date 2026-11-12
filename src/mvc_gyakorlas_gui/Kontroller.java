
package mvc_gyakorlas_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;


public class Kontroller {
    private Nezet  nezet;
    

    public Kontroller(Nezet nezet) {
        this.nezet = nezet;
    }
    
    
    public void csere(){
        JCheckBox chb =nezet.getjCheckBox1();
        chb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("a kattintás lefutott");
            }
        } );
                
    }
    
}
