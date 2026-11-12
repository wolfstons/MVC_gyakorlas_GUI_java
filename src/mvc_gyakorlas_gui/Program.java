
package mvc_gyakorlas_gui;


public class Program {

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Kontroller kontroller = new Kontroller(new Nezet());
                new Nezet().setVisible(true);
            }
        });
    }
    
}
