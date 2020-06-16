package submarino;


public class Juego {
    
    public static void main(String[] args) {      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TableroGUI tablero = new TableroGUI();
                tablero.setLocationRelativeTo(null);
                tablero.setVisible(true);
            }
        });
        
    }
    
}
