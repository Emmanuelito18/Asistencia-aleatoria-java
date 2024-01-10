/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import clases.conectarBase;
import java.awt.Image;//Eliminar libreria
import java.awt.Toolkit;//Eliminar libreria
import static java.awt.image.ImageObserver.HEIGHT;//Eliminar libreria
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import org.jvnet.substance.SubstanceLookAndFeel;
/*Librerias para archivo properties y recordar de LookAndFeel*/
import java.util.Properties;
import javax.swing.UIManager;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import propiedades.idioma;//Hace las traducciones del programa

/**
 *
 * @author Emmanuelito18
 */
public class inicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form inicioSesion
     */
    conectarBase conexion=null;
    
    public inicioSesion() {
        initComponents();
        //setIconImage(getIconImage());
        conexion=new conectarBase();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.lenguajeConfigurado();//Lee el idioma del archivo properties y traduce el programa
    }

    /*Icono del JFrame*/
    @Override
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logotipo.png"));
        //El método getSystemResource sirve para cargar paquetes de nuestro proyecto
        return retValue;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        lbl_correo = new javax.swing.JLabel();
        lbl_contraseña = new javax.swing.JLabel();
        psw_contraseña = new javax.swing.JPasswordField();
        btn_iniciar = new javax.swing.JButton();
        pnl_botonesCuenta = new javax.swing.JPanel();
        btn_recuperar = new javax.swing.JButton();
        btn_registrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asistencia aleatorea: Iniciar sesión");
        setIconImages(null);

        lbl_titulo.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        lbl_titulo.setText("Iniciar sesión");

        txt_correo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correoKeyTyped(evt);
            }
        });

        lbl_correo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_correo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_correo.setText("Ingrese su correo electrónico");

        lbl_contraseña.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_contraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_contraseña.setText("Ingrese su contraseña");

        psw_contraseña.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        psw_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        psw_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                psw_contraseñaKeyTyped(evt);
            }
        });

        btn_iniciar.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_iniciar.setText("Iniciar sesión");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        pnl_botonesCuenta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn_recuperar.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_recuperar.setText("Recuperar cuenta");
        btn_recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recuperarActionPerformed(evt);
            }
        });

        btn_registrarse.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_registrarse.setText("Crear cuenta nueva");
        btn_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_botonesCuentaLayout = new javax.swing.GroupLayout(pnl_botonesCuenta);
        pnl_botonesCuenta.setLayout(pnl_botonesCuentaLayout);
        pnl_botonesCuentaLayout.setHorizontalGroup(
            pnl_botonesCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botonesCuentaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_recuperar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btn_registrarse)
                .addGap(19, 19, 19))
        );
        pnl_botonesCuentaLayout.setVerticalGroup(
            pnl_botonesCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botonesCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_botonesCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_recuperar)
                    .addComponent(btn_registrarse))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_botonesCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_titulo)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_correo)
                            .addComponent(lbl_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(psw_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btn_iniciar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addComponent(lbl_correo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psw_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_iniciar)
                .addGap(1, 1, 1)
                .addComponent(pnl_botonesCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        // TODO add your handling code here:
        try{
           String consulta="SELECT * FROM usuarios WHERE correo LIKE?";
           PreparedStatement comando=(PreparedStatement)conexion.conectar.prepareStatement(consulta);
           comando.setString(1,txt_correo.getText());//debido a que el nombre del uusario lo obtiene en la ejecución es un parámetro  por lo que no es necesario cambiar al número 2
           ResultSet registro=comando.executeQuery();
           if(registro.next()){
               if(registro.getString(8).matches(String.valueOf(psw_contraseña.getPassword()))){//el dos hace referencia a la segunda columna del registro de la base de datos
                   JOptionPane.showMessageDialog(rootPane,"Bienvendid@ "+registro.getString(4));
                   menu p=new menu();
                   p.setVisible(true);
                   this.dispose();
               }
               else{
                   JOptionPane.showMessageDialog(rootPane,"Contraseña incorrecta, verifique...");
                   psw_contraseña.grabFocus();
               }
           }
           else{
               JOptionPane.showMessageDialog(rootPane,"Correo inexistente");
               txt_correo.grabFocus();
           }
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(rootPane,"Error al ejecutar la consulta");
    }
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_recuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recuperarActionPerformed
        // TODO add your handling code here:
        recuperarCuenta r=new recuperarCuenta();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_recuperarActionPerformed

    private void btn_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarseActionPerformed
        // TODO add your handling code here:
        registrarCuenta rc=new registrarCuenta();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registrarseActionPerformed

    private void psw_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psw_contraseñaKeyTyped
        // TODO add your handling code here:
        char[] arrayC=psw_contraseña.getPassword();
        /*Crea un arreglo de tipo char en el que guarda la contraseña obtenida de psw_contraseña*/
        String pass=new String(arrayC);
        /*Convierte el contenido del arreglo de tipo char a String*/
        if(pass.length()>=30){
           /*Comprueba que la longitud de la contraseña sea menor o igual a 30*/
            evt.consume();
            /*Consume el evento para que no vuelva a suceder*/
            Toolkit.getDefaultToolkit().beep();
            /*Emite un pitido de error*/
            JOptionPane.showMessageDialog(null,"Solo se permiten 30 caracteres como máximo","Error", HEIGHT);
        }
    }//GEN-LAST:event_psw_contraseñaKeyTyped

    private void txt_correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyTyped
        // TODO add your handling code here:
        if(txt_correo.getText().length()>=40){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Solo se permiten 40 caracteres como máximo","Error", HEIGHT);
        }
    }//GEN-LAST:event_txt_correoKeyTyped
//<editor-fold defaultstate="collapsed" desc="Traducción del programa">
    private void lenguajeConfigurado(){
        Properties idioma=new Properties();//Crea un objeto de la clase Properties llamado idioma
        try{
            idioma.load(new FileInputStream("src\\propiedades\\configuracion.properties"));
            //Carga el archivo configuracion.properties
        }catch(IOException e){
            e.printStackTrace();
        }
        //Obtener el lenguaje establecido
        String lenguaje=idioma.getProperty("idioma");//Obtiene el idioma configurado por el usuario
        cambiarIdioma(lenguaje);
    }
    
    private void cambiarIdioma(String nombreIdioma){
        idioma traduccion=new idioma(nombreIdioma);
        //crea un objeto llamado traduccion de la clase idioma del paquete propiedades
        this.setTitle(traduccion.getProperty("tituloIniciarSesion"));
        this.lbl_titulo.setText(traduccion.getProperty("lbl_tituloIniciarSesion"));
        this.lbl_correo.setText(traduccion.getProperty("lbl_correo"));
        this.lbl_contraseña.setText(traduccion.getProperty("lbl_contrasena"));
        this.btn_iniciar.setText(traduccion.getProperty("btn_iniciar"));
        this.btn_recuperar.setText(traduccion.getProperty("btn_recuperar"));
        this.btn_registrarse.setText(traduccion.getProperty("btn_registrarse"));
        //Se traduce toda la interfaz del programa
    }
    //</editor-fold>
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
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel del usuario">
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Properties prop=new Properties();
                try{
                    prop.load(new FileInputStream("src\\propiedades\\configuracion.properties"));
                }catch(IOException e){
                    e.printStackTrace();
                }
                //Obtener el look And Feel
                String apariencia=prop.getProperty("lookAndFeel");
                if(apariencia!=null){
                    if(apariencia.equals("com.jtattoo.plaf.mcwin.McWinLookAndFeel")){
                        try {
                            // Crea un objeto property
                            Properties props = new Properties();
                            //Esta propiedad cambia el estilo del layout de la barra de titulo de la ventana
                            props.put("macStyleWindowDecoration", "on");
                            //Esta propiedad cmabia el texto en los menus desplegables
                            props.put("logoString", "Asistencia aleatoria");
                            //Establece el tema a la que le establece la propiedad
                            com.jtattoo.plaf.mcwin.McWinLookAndFeel.setCurrentTheme(props);
                            //Select the Look and Feel
                            UIManager.setLookAndFeel(apariencia);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedLookAndFeelException ex) {
                            Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        if(apariencia.contains("org.jvnet.substance")){
                            /*para look and feel de substance
                            tiene un problema cuando el programa inicia con alugna aprariencia de substance*/
                            try{
                                // Código para Look And Feel para Substance
                                UIManager.setLookAndFeel("org.jvnet.substance.SubstanceLookAndFeel");
                                SubstanceLookAndFeel.setSkin(apariencia);
                               JFrame.setDefaultLookAndFeelDecorated(true);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (InstantiationException ex) {
                                Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IllegalAccessException ex) {
                                Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (UnsupportedLookAndFeelException ex) {
                                Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else{
                            try{
                                UIManager.setLookAndFeel(apariencia);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (InstantiationException ex) {
                                Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IllegalAccessException ex) {
                                Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (UnsupportedLookAndFeelException ex) {
                                Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }//</editor-fold>              
                
                inicioSesion inicio=new inicioSesion();
                inicio.setVisible(true);
                inicio.setLocationRelativeTo(null);
                inicio.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_recuperar;
    private javax.swing.JButton btn_registrarse;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_botonesCuenta;
    private javax.swing.JPasswordField psw_contraseña;
    private javax.swing.JTextField txt_correo;
    // End of variables declaration//GEN-END:variables
}
