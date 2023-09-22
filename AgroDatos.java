package login;

//sebas
import java.sql.*;

/**
 *
 * @author frank
 */
public class Agrodatos extends javax.swing.JFrame {

    /**
     * Creates new form Agrodatos
     */
    public Agrodatos() {
        initComponents();
        
        //Sebas
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        nombreLote = new javax.swing.JLabel();
        txt_pH = new javax.swing.JTextField();
        phJlabel = new javax.swing.JLabel();
        txt_nitrogeno = new javax.swing.JTextField();
        nitrogenoJlabel = new javax.swing.JLabel();
        txt_temperatura_suelo = new javax.swing.JTextField();
        temperaturaJlabel = new javax.swing.JLabel();
        txt_nutriente = new javax.swing.JTextField();
        nutrientesJlabel = new javax.swing.JLabel();
        txt_humedad_suelo = new javax.swing.JTextField();
        humedadJLabel = new javax.swing.JLabel();
        ingresarJPanel = new javax.swing.JPanel();
        ingresarDatosJLabel = new javax.swing.JLabel();
        hardwardJPanel = new javax.swing.JPanel();
        hardwardJLabel = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        volverJPanel = new javax.swing.JPanel();
        volverJLabel = new javax.swing.JLabel();
        txt_humedad_ambiente = new javax.swing.JTextField();
        humedadJLabel1 = new javax.swing.JLabel();
        txt_temperatura_ambiente = new javax.swing.JTextField();
        humedadJLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreLote.setText("LOTE 1");
        jPanel3.add(nombreLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        txt_pH.setText("aaaaa");
        txt_pH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pHActionPerformed(evt);
            }
        });
        jPanel3.add(txt_pH, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        phJlabel.setText("PH:");
        jPanel3.add(phJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        txt_nitrogeno.setText("aaaaaaa");
        jPanel3.add(txt_nitrogeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        nitrogenoJlabel.setText("NITROGENO:");
        jPanel3.add(nitrogenoJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        txt_temperatura_suelo.setText("aaaaaa");
        jPanel3.add(txt_temperatura_suelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        temperaturaJlabel.setText("TEMPERATURA:");
        jPanel3.add(temperaturaJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        txt_nutriente.setText("aaaaaaa");
        jPanel3.add(txt_nutriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        nutrientesJlabel.setText("NUTRIENTES");
        jPanel3.add(nutrientesJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        txt_humedad_suelo.setText("aaaaaa");
        jPanel3.add(txt_humedad_suelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        humedadJLabel.setText("HUMEDAD");
        jPanel3.add(humedadJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        ingresarDatosJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresarDatosJLabel.setText("ingresar datos");
        ingresarDatosJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarDatosJLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ingresarJPanelLayout = new javax.swing.GroupLayout(ingresarJPanel);
        ingresarJPanel.setLayout(ingresarJPanelLayout);
        ingresarJPanelLayout.setHorizontalGroup(
            ingresarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarDatosJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        ingresarJPanelLayout.setVerticalGroup(
            ingresarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarDatosJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(ingresarJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, 50));

        hardwardJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hardwardJLabel.setText("usar hardward");
        hardwardJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hardwardJLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hardwardJPanelLayout = new javax.swing.GroupLayout(hardwardJPanel);
        hardwardJPanel.setLayout(hardwardJPanelLayout);
        hardwardJPanelLayout.setHorizontalGroup(
            hardwardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hardwardJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        hardwardJPanelLayout.setVerticalGroup(
            hardwardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hardwardJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(hardwardJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));
        jPanel3.add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 80, 30));

        volverJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volverJLabel.setText("volver");
        volverJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverJLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout volverJPanelLayout = new javax.swing.GroupLayout(volverJPanel);
        volverJPanel.setLayout(volverJPanelLayout);
        volverJPanelLayout.setHorizontalGroup(
            volverJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        volverJPanelLayout.setVerticalGroup(
            volverJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(volverJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        txt_humedad_ambiente.setText("aaaaaa");
        jPanel3.add(txt_humedad_ambiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        humedadJLabel1.setText("HUMEDAD_ambiente");
        jPanel3.add(humedadJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        txt_temperatura_ambiente.setText("aaaaaa");
        jPanel3.add(txt_temperatura_ambiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        humedadJLabel2.setText("temperatura_ambiente");
        jPanel3.add(humedadJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void ingresarDatosJLabelMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        
        //sebas
        //me falta lo de comprobar a que lote se añaden los datos
        //me falta lo de como añadir el dato del tiempo
        try{
            //conexion a la base de datos
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/agrop", "root", "1846583467");

            //instruccion a la base de datos(le voy a mandar los valores de los detalles)
            PreparedStatement pst = cn.prepareStatement("insert into detalle_suelo values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            //aqui le digo a que columnas van dichos valores
            pst.setString(1, "0");
            //txt_nombre es como se llama el jtextfield de donde vamos a sacar este dato
            pst.setString(2, "1"); //me toca despues relacionarlo con el suelo que se esta editando
            pst.setString(3, txt_pH.getText().trim());
            pst.setString(4, txt_temperatura_suelo.getText().trim());
            pst.setString(5, txt_temperatura_ambiente.getText().trim());
            pst.setString(6, txt_humedad_suelo.getText().trim());
            pst.setString(7, txt_humedad_ambiente.getText().trim()); 
            pst.setString(8, txt_nitrogeno.getText().trim());
            pst.setString(9, txt_nutriente.getText().trim());
            pst.setString(10, "0"); //me toca despues relacionarlo con la hora de mi pc


            //le digo a java y a la base de datos que ejecute lo anterior
            pst.executeUpdate();

            //limpio los txt
            txt_pH.setText("");
            txt_temperatura_suelo.setText("");
            txt_temperatura_ambiente.setText("");
            txt_humedad_suelo.setText("");
            txt_humedad_ambiente.setText("");
            txt_nitrogeno.setText("");
            txt_nutriente.setText("");

            //modifico el jlabel para que me diga que ya se registro el usuario
            label_status.setText("Registro exitoso.");
    
        }catch (Exception e){
            label_status.setText("Registro no exitoso.");
            }


    }                                                

    private void hardwardJLabelMouseClicked(java.awt.event.MouseEvent evt) {                                            
        try{
            //conexion a la base de datos
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/agrop", "root", "1846583467");
            
            
            
            
            //modifico el jlabel para que me diga que ya se registro el usuario
            label_status.setText("Hardware conectado.");
            
        }catch (Exception e){
            label_status.setText("Registro no exitoso.");

        }
    }                                           

    private void txt_pHActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void volverJLabelMouseClicked(java.awt.event.MouseEvent evt) {                                          
       Agrosuelos a = new Agrosuelos();
        this.setVisible(false);
        a.setVisible(true);
    }                                         

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Agrodatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agrodatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agrodatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agrodatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agrodatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel hardwardJLabel;
    private javax.swing.JPanel hardwardJPanel;
    private javax.swing.JLabel humedadJLabel;
    private javax.swing.JLabel humedadJLabel1;
    private javax.swing.JLabel humedadJLabel2;
    private javax.swing.JLabel ingresarDatosJLabel;
    private javax.swing.JPanel ingresarJPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label_status;
    private javax.swing.JLabel nitrogenoJlabel;
    private javax.swing.JLabel nombreLote;
    private javax.swing.JLabel nutrientesJlabel;
    private javax.swing.JLabel phJlabel;
    private javax.swing.JLabel temperaturaJlabel;
    private javax.swing.JTextField txt_humedad_ambiente;
    private javax.swing.JTextField txt_humedad_suelo;
    private javax.swing.JTextField txt_nitrogeno;
    private javax.swing.JTextField txt_nutriente;
    private javax.swing.JTextField txt_pH;
    private javax.swing.JTextField txt_temperatura_ambiente;
    private javax.swing.JTextField txt_temperatura_suelo;
    private javax.swing.JLabel volverJLabel;
    private javax.swing.JPanel volverJPanel;
    // End of variables declaration                   
}