/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

/**
 *
 * @author Emmanuelito18
 */
import clases.conectarBase;
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Calendar;

public class registrarCuenta extends javax.swing.JFrame {

    /**
     * Creates new form registrarCuenta
     */
    
    conectarBase conexion=null;
    PreparedStatement ps=null;
    //ResultSet rs=null;
    String sGenero=null;
    public registrarCuenta() {
        initComponents();
        conexion= new conectarBase();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        btn_registrar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl_titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellidoPaterno = new javax.swing.JLabel();
        lbl_apellidoMaterno = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidoMaterno = new javax.swing.JTextField();
        txt_apellidoPaterno = new javax.swing.JTextField();
        lbl_correo = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        lbl_contraseña = new javax.swing.JLabel();
        psw_contraseña = new javax.swing.JPasswordField();
        psw_confirmarContraseña = new javax.swing.JPasswordField();
        lbl_confirmarContraseña = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Calendario = new com.toedter.calendar.JDateChooser();
        lbl_texto = new javax.swing.JLabel();
        lbl_AvisoFechaNacimiento = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbtn_hombre = new javax.swing.JRadioButton();
        rbtn_mujer = new javax.swing.JRadioButton();
        lbl_AvisoGenero = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        lbl_AvisoNombre = new javax.swing.JLabel();
        lbl_AvisoApellidoPaterno = new javax.swing.JLabel();
        lbl_AvisoApellidoMaterno = new javax.swing.JLabel();
        lbl_AvisoCorreoElectronico = new javax.swing.JLabel();
        mnu_menu = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Registrar cuenta");

        lbl_nombre.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombre.setText("Nombre");

        lbl_apellidoPaterno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_apellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_apellidoPaterno.setText("Apellido paterno");

        lbl_apellidoMaterno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_apellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_apellidoMaterno.setText("Apellido materno");

        txt_nombre.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_apellidoMaterno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        txt_apellidoMaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_apellidoMaternoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoMaternoKeyTyped(evt);
            }
        });

        txt_apellidoPaterno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        txt_apellidoPaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoPaternoActionPerformed(evt);
            }
        });
        txt_apellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_apellidoPaternoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoPaternoKeyTyped(evt);
            }
        });

        lbl_correo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_correo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_correo.setText("Correo electrónico:");

        txt_correo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_correoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correoKeyTyped(evt);
            }
        });

        lbl_contraseña.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_contraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_contraseña.setText("Contraseña:");

        psw_contraseña.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        psw_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        psw_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                psw_contraseñaKeyTyped(evt);
            }
        });

        psw_confirmarContraseña.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        psw_confirmarContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        psw_confirmarContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                psw_confirmarContraseñaKeyTyped(evt);
            }
        });

        lbl_confirmarContraseña.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_confirmarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_confirmarContraseña.setText("Confirmar contraseña:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 12))); // NOI18N

        Calendario.setToolTipText("Ingrese su fecha de nacimiento.\n*Campo obligatorio");
        Calendario.setDateFormatString("yyyy-MM-dd");
        Calendario.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        Calendario.setInheritsPopupMenu(true);
        Calendario.setMaxSelectableDate(new java.util.Date(1704006093000L));
        Calendario.setMinSelectableDate(new java.util.Date(-510425907000L));

        lbl_texto.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_texto.setText("seleccione su fecha de nacimiento:");

        lbl_AvisoFechaNacimiento.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        lbl_AvisoFechaNacimiento.setForeground(new java.awt.Color(255, 0, 0));
        lbl_AvisoFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AvisoFechaNacimiento.setText("*Campo obligatorio");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_AvisoFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_texto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_AvisoFechaNacimiento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Género", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 12))); // NOI18N

        buttonGroup1.add(rbtn_hombre);
        rbtn_hombre.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        rbtn_hombre.setText("Hombre");
        rbtn_hombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_hombreActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtn_mujer);
        rbtn_mujer.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        rbtn_mujer.setText("Mujer");
        rbtn_mujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_mujerActionPerformed(evt);
            }
        });

        lbl_AvisoGenero.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        lbl_AvisoGenero.setForeground(new java.awt.Color(255, 0, 0));
        lbl_AvisoGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AvisoGenero.setText("*Campo obligatorio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbtn_hombre)
                .addGap(53, 53, 53)
                .addComponent(rbtn_mujer)
                .addGap(83, 83, 83)
                .addComponent(lbl_AvisoGenero)
                .addGap(0, 68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_hombre)
                    .addComponent(rbtn_mujer)
                    .addComponent(lbl_AvisoGenero))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_registrar.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_registrar.setText("Registrarte");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_regresar.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        lbl_AvisoNombre.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        lbl_AvisoNombre.setForeground(new java.awt.Color(255, 0, 0));
        lbl_AvisoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AvisoNombre.setToolTipText("");

        lbl_AvisoApellidoPaterno.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        lbl_AvisoApellidoPaterno.setForeground(new java.awt.Color(255, 0, 0));
        lbl_AvisoApellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_AvisoApellidoMaterno.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        lbl_AvisoApellidoMaterno.setForeground(new java.awt.Color(255, 0, 0));
        lbl_AvisoApellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_AvisoCorreoElectronico.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        lbl_AvisoCorreoElectronico.setForeground(new java.awt.Color(255, 0, 0));
        lbl_AvisoCorreoElectronico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_confirmarContraseña)
                                .addGap(18, 18, 18)
                                .addComponent(psw_confirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_contraseña)
                                .addGap(18, 18, 18)
                                .addComponent(psw_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_AvisoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_apellidoPaterno)
                                    .addComponent(lbl_apellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(lbl_AvisoApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_apellidoMaterno)
                                    .addComponent(lbl_apellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(lbl_AvisoApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_correo)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_AvisoCorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btn_registrar)
                        .addGap(107, 107, 107)
                        .addComponent(btn_regresar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre)
                            .addComponent(lbl_apellidoPaterno)
                            .addComponent(lbl_apellidoMaterno))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_apellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_apellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_AvisoApellidoPaterno)
                    .addComponent(lbl_AvisoApellidoMaterno)
                    .addComponent(lbl_AvisoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_correo)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_AvisoCorreoElectronico)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contraseña)
                    .addComponent(psw_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_confirmarContraseña)
                    .addComponent(psw_confirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_regresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(mnu_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /*Método que valida el tipo de caracteres*/
    /*Utiliza el código ASCII*/
    public void validacionCaracteres(java.awt.event.KeyEvent evento){
        if(evento.getKeyChar()>=33&&evento.getKeyChar()<=64
                ||evento.getKeyChar()>=91&&evento.getKeyChar()<=96
                ||evento.getKeyChar()>=123&&evento.getKeyChar()<=191
                ||evento.getKeyChar()==198||evento.getKeyChar()==208
                ||evento.getKeyChar()>=215&&evento.getKeyChar()<=216
                ||evento.getKeyChar()>=222&&evento.getKeyChar()<=223
                ||evento.getKeyChar()>=229&&evento.getKeyChar()<=230
                ||evento.getKeyChar()==240||evento.getKeyChar()>=247&&evento.getKeyChar()<=248
                ||evento.getKeyChar()>=254&&evento.getKeyChar()<=255){
            /*valida los caracteres ingresados*/
            /*para que se pueda poner espacios, pero no números ni caracteres*/
            evento.consume();
            /*para que el evento se consuma*/
            JOptionPane.showMessageDialog(this,"No se permiten caracteres especiales");
        }
        /*System.out.print("Soy la letra: "+evento.getKeyChar()+" y tengo el numero ASCII: ");
        System.out.println(evento.getKeyChar()+0);*/
    }
    /*Para los campos vacíos*/
    public void validarCamposVacios(){
        if(txt_nombre.getText().isEmpty()){
            lbl_AvisoNombre.setText("*Campo obligatorio");
        }
        else{
            lbl_AvisoNombre.setText("");
        }
        
        if(txt_apellidoPaterno.getText().isEmpty()){
            lbl_AvisoApellidoPaterno.setText("*Campo obligatorio");
        }
        else{
            lbl_AvisoApellidoPaterno.setText("");
        }
        
        if(txt_apellidoMaterno.getText().isEmpty()){
            lbl_AvisoApellidoMaterno.setText("*Campo obligatorio");
        }
        else{
            lbl_AvisoApellidoMaterno.setText("");
        }
        
        if(txt_correo.getText().isEmpty()){
            lbl_AvisoCorreoElectronico.setText("*Campo obligatorio");
        }
        else if(!txt_correo.getText().contains("@")
                ||!txt_correo.getText().contains(".")){//para comparar si tiene @ y .
                lbl_AvisoCorreoElectronico.setText("Correo NO válido");
        }
        else{
            lbl_AvisoCorreoElectronico.setText("");            
        }
        
        
    }
    
    /*Validación del correo*/
    public void validarCorreo(java.awt.event.KeyEvent evento){
        if(evento.getKeyChar()>=32&&evento.getKeyChar()<=45/*No permite espacio hasta guíon*/
                ||evento.getKeyChar()==47/*No permite / */
                ||evento.getKeyChar()>=58&&evento.getKeyChar()<=63 /**/
                ||evento.getKeyChar()>=65&&evento.getKeyChar()<=94
                ||evento.getKeyChar()==96
                ||evento.getKeyChar()>=123&&evento.getKeyChar()<=255){
            /*Valida los caracteres ingresados*/
            evento.consume();
            JOptionPane.showMessageDialog(this,"No se permite ese caracter en específico");
        }
    }
    
    /*Habilita botón*/
    public void habilitarBoton(){
        if(txt_nombre.getText().isEmpty()||txt_apellidoPaterno.getText().isEmpty()
                ||txt_apellidoMaterno.getText().isEmpty()||txt_correo.getText().isEmpty()/*valida si al´gin campo está vació*/
                ||!lbl_AvisoCorreoElectronico.getText().isEmpty()||rbtn_hombre.isSelected()||rbtn_mujer.isSelected()
                ||lbl_AvisoFechaNacimiento.getText().isEmpty()){/*valida si no está vacio*/
            btn_registrar.setEnabled(false);
        }
        else{
            btn_registrar.setEnabled(true);
        }
    }
        
    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        inicioSesion inicio=new inicioSesion();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        inicio.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        String fecha=((JTextField)Calendario.getDateEditor().getUiComponent()).getText();
        try {
            if (psw_contraseña.getText().equals(psw_confirmarContraseña.getText())) {
                //String insertar="INSERT INTO articulos (apellido_paterno,apellido_materno,"
                //        + "nombre,fecha_nacimiento,genero,correo,password) VALUES(?,?,?,?,?,?,?)";
                
                ps=conexion.conectar.prepareStatement("INSERT INTO usuarios (apellido_paterno,apellido_materno,nombre,"
                    + "fecha_nacimiento,genero,correo,password) VALUES (?,?,?,?,?,?,?)");
                ps.setString(1, txt_apellidoPaterno.getText());
                ps.setString(2, txt_apellidoMaterno.getText());
                ps.setString(3, txt_nombre.getText());
                ps.setDate(4,Date.valueOf(fecha));
                ps.setString(5, sGenero);
                ps.setString(6, txt_correo.getText());
                ps.setString(7, psw_contraseña.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Usuario guardado con éxito, por favor inicie sesión");
                limpiarCampos();
                inicioSesion i=new inicioSesion();
                i.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error, las contraseñas no coinciden");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Error al guardar el Usuario, verifique...");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void rbtn_hombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_hombreActionPerformed
        // TODO add your handling code here:
        lbl_AvisoGenero.setText("");
        sGenero="0";
    }//GEN-LAST:event_rbtn_hombreActionPerformed

    private void rbtn_mujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_mujerActionPerformed
        // TODO add your handling code here:
        lbl_AvisoGenero.setText("");
        sGenero="1";
    }//GEN-LAST:event_rbtn_mujerActionPerformed

    private void txt_apellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoPaternoActionPerformed

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        // TODO add your handling code here:
        validacionCaracteres(evt);
        if(txt_nombre.getText().length()>=35){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Solo se permiten 35 caracteres como máximo","Error", HEIGHT);
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_apellidoPaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoPaternoKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_txt_apellidoPaternoKeyReleased

    private void txt_apellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoPaternoKeyTyped
        // TODO add your handling code here:
        validacionCaracteres(evt);
        if(txt_apellidoPaterno.getText().length()>=30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Solo se permiten 30 caracteres como máximo","Error", HEIGHT);
        }
    }//GEN-LAST:event_txt_apellidoPaternoKeyTyped

    private void txt_apellidoMaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoMaternoKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_txt_apellidoMaternoKeyReleased

    private void txt_apellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoMaternoKeyTyped
        // TODO add your handling code here:
        validacionCaracteres(evt);
        if(txt_apellidoMaterno.getText().length()>=30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Solo se permiten 30 caracteres como máximo","Error", HEIGHT);
        }
    }//GEN-LAST:event_txt_apellidoMaternoKeyTyped

    private void txt_correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyReleased
        // TODO add your handling code here:
        validarCamposVacios();
        habilitarBoton();
    }//GEN-LAST:event_txt_correoKeyReleased

    private void txt_correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyTyped
        // TODO add your handling code here:
        validarCorreo(evt);
        if(txt_correo.getText().length()>=40){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Solo se permiten 40 caracteres como máximo","Error", HEIGHT);
        }
    }//GEN-LAST:event_txt_correoKeyTyped

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

    private void psw_confirmarContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psw_confirmarContraseñaKeyTyped
        // TODO add your handling code here:
        char[] arrayC=psw_confirmarContraseña.getPassword();
        String pass=new String(arrayC);
        if(pass.length()>=30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Solo se permiten 30 caracteres como máximo","Error", HEIGHT);
        }
    }//GEN-LAST:event_psw_confirmarContraseñaKeyTyped

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
            java.util.logging.Logger.getLogger(registrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarCuenta().setVisible(true);
            }
        });
    }
    void limpiarCampos(){
        txt_nombre.setText("");
        txt_apellidoPaterno.setText("");
        txt_apellidoMaterno.setText("");
        txt_correo.setText("");
        psw_contraseña.setText("");
        psw_confirmarContraseña.setText("");
        Calendario.setCalendar(null);
        buttonGroup1.clearSelection();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Calendario;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_AvisoApellidoMaterno;
    private javax.swing.JLabel lbl_AvisoApellidoPaterno;
    private javax.swing.JLabel lbl_AvisoCorreoElectronico;
    private javax.swing.JLabel lbl_AvisoFechaNacimiento;
    private javax.swing.JLabel lbl_AvisoGenero;
    private javax.swing.JLabel lbl_AvisoNombre;
    private javax.swing.JLabel lbl_apellidoMaterno;
    private javax.swing.JLabel lbl_apellidoPaterno;
    private javax.swing.JLabel lbl_confirmarContraseña;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JMenuBar mnu_menu;
    private javax.swing.JPasswordField psw_confirmarContraseña;
    private javax.swing.JPasswordField psw_contraseña;
    private javax.swing.JRadioButton rbtn_hombre;
    private javax.swing.JRadioButton rbtn_mujer;
    private javax.swing.JTextField txt_apellidoMaterno;
    private javax.swing.JTextField txt_apellidoPaterno;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
