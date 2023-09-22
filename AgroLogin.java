package login;

//sebas
import java.sql.*;

import javax.swing.JFrame;
import java.awt.Color;
public class Agrologin extends javax.swing.JFrame {
            
    public Agrologin() {
        initComponents();
        
        //Sebas
        this.setLocationRelativeTo(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        bg = new javax.swing.JPanel();
        minim = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cerrar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cuadrose = new javax.swing.JLabel();
        panelRound1 = new login.PanelRound();
        pausu = new login.PanelRound();
        usuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pacontra = new login.PanelRound();
        contraseña = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        entrar = new login.PanelRound();
        entrarJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deco = new javax.swing.JLabel();
        bgcampe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(20, 20, 20));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(570, 740));
        bg.setPreferredSize(new java.awt.Dimension(1000, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minim.setBackground(new java.awt.Color(108, 89, 49));

        jLabel4.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("—");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout minimLayout = new javax.swing.GroupLayout(minim);
        minim.setLayout(minimLayout);
        minimLayout.setHorizontalGroup(
            minimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        minimLayout.setVerticalGroup(
            minimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(minim, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, 30));

        cerrar.setBackground(new java.awt.Color(108, 89, 49));

        jLabel3.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("x");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, 30));

        cuadrose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuadrose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logoletra_1.png"))); // NOI18N
        cuadrose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(cuadrose, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -10, 390, 230));

        panelRound1.setBackground(new java.awt.Color(41, 41, 41));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pausu.setBackground(new java.awt.Color(60, 60, 60));
        pausu.setRoundBottomLeft(40);
        pausu.setRoundBottomRight(40);
        pausu.setRoundTopLeft(40);
        pausu.setRoundTopRight(40);

        usuario.setBackground(new java.awt.Color(60, 60, 60));
        usuario.setFont(new java.awt.Font("Gotham", 0, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        usuario.setAutoscrolls(false);
        usuario.setBorder(null);
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioMousePressed(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/usuarioICON.png"))); // NOI18N

        javax.swing.GroupLayout pausuLayout = new javax.swing.GroupLayout(pausu);
        pausu.setLayout(pausuLayout);
        pausuLayout.setHorizontalGroup(
            pausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pausuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pausuLayout.setVerticalGroup(
            pausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pausuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pausuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(usuario))
                .addContainerGap())
        );

        panelRound1.add(pausu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 310, 45));

        pacontra.setBackground(new java.awt.Color(60, 60, 60));
        pacontra.setRoundBottomLeft(40);
        pacontra.setRoundBottomRight(40);
        pacontra.setRoundTopLeft(40);
        pacontra.setRoundTopRight(40);

        contraseña.setBackground(new java.awt.Color(60, 60, 60));
        contraseña.setFont(new java.awt.Font("Gotham", 0, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña");
        contraseña.setAutoscrolls(false);
        contraseña.setBorder(null);
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaMousePressed(evt);
            }
        });
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/candadoICON.png"))); // NOI18N

        javax.swing.GroupLayout pacontraLayout = new javax.swing.GroupLayout(pacontra);
        pacontra.setLayout(pacontraLayout);
        pacontraLayout.setHorizontalGroup(
            pacontraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pacontraLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pacontraLayout.setVerticalGroup(
            pacontraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacontraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pacontraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelRound1.add(pacontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 310, 45));

        registrar.setFont(new java.awt.Font("Gotham", 0, 12)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("¿Sin cuenta aún? Registrate");
        registrar.setBorder(null);
        registrar.setBorderPainted(false);
        registrar.setContentAreaFilled(false);
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        panelRound1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 390, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 300, 10));

        entrar.setBackground(new java.awt.Color(108, 89, 49));
        entrar.setRoundBottomLeft(40);
        entrar.setRoundBottomRight(40);
        entrar.setRoundTopLeft(40);
        entrar.setRoundTopRight(40);

        entrarJLabel.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        entrarJLabel.setForeground(new java.awt.Color(255, 255, 255));
        entrarJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrarJLabel.setText("ENTRAR");
        entrarJLabel.setAlignmentY(0.0F);
        entrarJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        entrarJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarJLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarJLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarJLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout entrarLayout = new javax.swing.GroupLayout(entrar);
        entrar.setLayout(entrarLayout);
        entrarLayout.setHorizontalGroup(
            entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        entrarLayout.setVerticalGroup(
            entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelRound1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 310, 40));

        jLabel6.setFont(new java.awt.Font("Gotham", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INICIAR SESIÓN");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 390, -1));

        bg.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 390, 480));

        deco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Decoracioninterfaz (1).png"))); // NOI18N
        deco.setText("jLabel4");
        bg.add(deco, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -70, -1, -1));

        bgcampe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgcampe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/campeGODdesenfocado.jpg"))); // NOI18N
        bg.add(bgcampe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        System.exit(0);
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
         this.setState(JFrame.ICONIFIED);
    }                                    

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {                                     
        cerrar.setBackground(Color.red);
    }                                    

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {                                    
        cerrar.setBackground(new Color(108,89,49));
    }                                   

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {                                     
        minim.setBackground(Color.red);
    }                                    

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {                                    
        minim.setBackground(new Color(108,89,49));
    }                                   

    private void entrarJLabelMouseExited(java.awt.event.MouseEvent evt) {                                         
        entrar.setBackground(new Color(108,89,49));
    }                                        

    private void entrarJLabelMouseEntered(java.awt.event.MouseEvent evt) {                                          
        entrar.setBackground(new Color(61,53,37));
    }                                         

    private void entrarJLabelMouseClicked(java.awt.event.MouseEvent evt) {                                          
        Agrosuelos b = new Agrosuelos();
        this.setVisible(false);
        b.setVisible(true);
    }                                         

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Agroregister a = new Agroregister();
        this.setVisible(false);
        a.setVisible(true);
    }                                         

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void contraseñaMousePressed(java.awt.event.MouseEvent evt) {                                        
        if(contraseña.getText().equals("Contraseña")){
            contraseña.setText("");
        }
        if(usuario.getText().isEmpty()){
            usuario.setText("Usuario");
        }
    }                                       

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void usuarioMousePressed(java.awt.event.MouseEvent evt) {                                     
        if(usuario.getText().equals("Usuario")){
            usuario.setText("");
        }
        if(contraseña.getText().isEmpty()){
            contraseña.setText("Contraseña");
        }
    }                                    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agrologin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agrologin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agrologin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agrologin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agrologin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgcampe;
    private javax.swing.JPanel cerrar;
    private javax.swing.JTextField contraseña;
    private javax.swing.JLabel cuadrose;
    private javax.swing.JLabel deco;
    private login.PanelRound entrar;
    private javax.swing.JLabel entrarJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel minim;
    private login.PanelRound pacontra;
    private login.PanelRound panelRound1;
    private login.PanelRound pausu;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField usuario;
    // End of variables declaration                   
}
