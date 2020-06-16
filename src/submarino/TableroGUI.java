package submarino;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class TableroGUI extends javax.swing.JFrame {
    Tablero tablero;
    boolean adivino;
    final JButton botones[][];
   
    public TableroGUI() {        
        String mensaje = "Bienvenido al juego \"Battle Ship\". El objetivo es \n"
                + "hundir los 5 barcos ocultos. Tienes solamente "+Tablero.NUM_MAX_INTENTOS+" intentos para lograrlo";
        JOptionPane.showMessageDialog(rootPane, mensaje);
        
        tablero = new Tablero();
        tablero.colocarSubmarinos();        
        botones = new JButton[5][5];
        
        setTitle("Battle Ship");
        initComponents();
        ordenarBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNumIntentos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNumBarcos = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuJuegoNuevo = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 400));
        setPreferredSize(new java.awt.Dimension(600, 420));

        jPanel2.setAlignmentY(0.6F);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Numero de Intentos");
        jPanel2.add(jLabel1);

        lblNumIntentos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNumIntentos.setForeground(new java.awt.Color(0, 51, 255));
        lblNumIntentos.setText("0");
        jPanel2.add(lblNumIntentos);

        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Barcos Hundidos");
        jPanel2.add(jLabel3);

        lblNumBarcos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNumBarcos.setForeground(new java.awt.Color(255, 0, 51));
        lblNumBarcos.setText("0");
        jPanel2.add(lblNumBarcos);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setLayout(new java.awt.GridLayout(5, 5));

        btn1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn1.setText("?");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn1);

        btn2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn2.setText("?");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel3.add(btn2);

        btn3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn3.setText("?");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel3.add(btn3);

        btn4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn4.setText("?");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel3.add(btn4);

        btn5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn5.setText("?");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel3.add(btn5);

        btn6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn6.setText("?");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel3.add(btn6);

        btn7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn7.setText("?");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel3.add(btn7);

        btn8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn8.setText("?");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel3.add(btn8);

        btn9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn9.setText("?");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel3.add(btn9);

        btn10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn10.setText("?");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel3.add(btn10);

        btn11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn11.setText("?");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel3.add(btn11);

        btn12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn12.setText("?");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel3.add(btn12);

        btn13.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn13.setText("?");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        jPanel3.add(btn13);

        btn14.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn14.setText("?");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        jPanel3.add(btn14);

        btn15.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn15.setText("?");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        jPanel3.add(btn15);

        btn16.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn16.setText("?");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        jPanel3.add(btn16);

        btn17.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn17.setText("?");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });
        jPanel3.add(btn17);

        btn18.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn18.setText("?");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });
        jPanel3.add(btn18);

        btn19.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn19.setText("?");
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });
        jPanel3.add(btn19);

        btn20.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn20.setText("?");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        jPanel3.add(btn20);

        btn21.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn21.setText("?");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        jPanel3.add(btn21);

        btn22.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn22.setText("?");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        jPanel3.add(btn22);

        btn23.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn23.setText("?");
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });
        jPanel3.add(btn23);

        btn24.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn24.setText("?");
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });
        jPanel3.add(btn24);

        btn25.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn25.setText("?");
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });
        jPanel3.add(btn25);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        mnuJuegoNuevo.setText("Juego Nuevo");
        mnuJuegoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuJuegoNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuJuegoNuevo);

        jMenuBar1.add(jMenu1);

        mnuAyuda.setText("Ayuda");

        mnuAbout.setText("Acerca de...");
        mnuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAbout);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accionBoton(int fila, int columna, JButton boton){
        if(tablero.getNumIntentos() < Tablero.NUM_MAX_INTENTOS)
            if(!tablero.estaHundido(fila, columna)){
                adivino = tablero.adivinar(fila, columna);
                boton.setText("");

                if(adivino){
                    boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/hundido.jpg")));            
                }else{
                    boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/incorrecto.png")));
                }

                lblNumIntentos.setText(tablero.getNumIntentos()+"");
                lblNumBarcos.setText(tablero.getNumHundidos()+"");
                
                if(tablero.veriPartidaGanada()){
                    JOptionPane.showMessageDialog(rootPane, "Ganaste");
                }else if(tablero.veriPartidaPerdida()){
                    JOptionPane.showMessageDialog(rootPane, "Perdiste"); 
                    deshabilitaBotones();
                    muestraBarcos();
                }
            }
        
    }   
    
    private void ordenarBotones(){
        botones[0][0] = btn1;
        botones[0][1] = btn2;
        botones[0][2] = btn3;
        botones[0][3] = btn4;
        botones[0][4] = btn5;
        botones[1][0] = btn6;
        botones[1][1] = btn7;
        botones[1][2] = btn8;
        botones[1][3] = btn9;
        botones[1][4] = btn10;
        botones[2][0] = btn11;
        botones[2][1] = btn12;
        botones[2][2] = btn13;
        botones[2][3] = btn14;
        botones[2][4] = btn15;
        botones[3][0] = btn16;
        botones[3][1] = btn17;
        botones[3][2] = btn18;
        botones[3][3] = btn19;
        botones[3][4] = btn20;
        botones[4][0] = btn21;
        botones[4][1] = btn22;
        botones[4][2] = btn23;
        botones[4][3] = btn24;
        botones[4][4] = btn25;
    } 
    
    private void deshabilitaBotones(){
        for(int i = 0; i<5; i++)
            for(int j = 0; j<5; j++)                
                botones[i][j].setEnabled(false);                
    }
    
    private void muestraBarcos(){
        for(int i = 0; i<5; i++)
            for(int j = 0; j<5; j++)
                if(!tablero.estaVacia(i, j)){
                    botones[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/hundido.jpg")));
                    botones[i][j].setEnabled(true);
                    botones[i][j].setText("");
                    botones[i][j].setBackground(Color.red);
                }            
    }
    
    private void mnuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutActionPerformed
        String mensaje = "Juego desarrollado por Luis Fernando Acosta Tovar\ncon número de control 17030801"
                + " \nAsignatura: POO";
        
        JOptionPane.showMessageDialog(rootPane, mensaje, "Creditos",3, new ImageIcon(getClass().getResource("/imagenes/yo.jpeg")));
    }//GEN-LAST:event_mnuAboutActionPerformed

    
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         accionBoton(0, 2, btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
         accionBoton(0, 3, btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
         accionBoton(0, 4, btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         accionBoton(1, 0, btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
         accionBoton(1, 1, btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         accionBoton(1, 2, btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
         accionBoton(1, 3, btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
         accionBoton(1, 4, btn10);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
         accionBoton(2, 0, btn11);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
         accionBoton(2, 1, btn12);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
         accionBoton(2, 2, btn13);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
         accionBoton(2, 3, btn14);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        accionBoton(2, 4, btn15);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        accionBoton(3, 0, btn16);
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        accionBoton(3, 1, btn17);
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        accionBoton(3, 2, btn18);
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        accionBoton(3, 3, btn19);
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        accionBoton(3, 4, btn20);
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        accionBoton(4, 0, btn21);
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        accionBoton(4, 1, btn22);
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        accionBoton(4, 2, btn23);
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        accionBoton(4, 3, btn24);
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        accionBoton(4, 4, btn25);
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       accionBoton(0, 0, btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         accionBoton(0, 1, btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void mnuJuegoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuJuegoNuevoActionPerformed
        TableroGUI tablero = new TableroGUI();
        tablero.setLocationRelativeTo(this);
        tablero.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuJuegoNuevoActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNumBarcos;
    private javax.swing.JLabel lblNumIntentos;
    private javax.swing.JMenuItem mnuAbout;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuJuegoNuevo;
    // End of variables declaration//GEN-END:variables
}
