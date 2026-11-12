
package mvc_gyakorlas_gui;


public class Program {

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Nezet nezet = new Nezet();
                Kontroller kontroller = new Kontroller(nezet);
                nezet.setVisible(true);
            }
        });
    }
    
}
