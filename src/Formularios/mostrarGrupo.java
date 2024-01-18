/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Formularios;

import clases.conectarBase;
import java.awt.event.ItemEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;//libreria para arreglo dinámico
import java.util.Properties;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import propiedades.idioma;

/**
 *
 * @author Emmanuelito18
 */
public class mostrarGrupo extends javax.swing.JInternalFrame {

    /**
     * Creates new form mostrarGrupo
     */
    conectarBase conexion=new conectarBase();
    Connection conect=null;
    String grup=null,grupoElegido=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    Statement st=null;
    ArrayList<Integer> turnos = new ArrayList<Integer>();//Arreglo dinámico donde se guarda el valor del turno
    int posCMB=0;
    
    
    DefaultTableModel modelo=new DefaultTableModel();//{
//    public boolean isCellEditable(int row,int column){
//        return false;
//    }
//    };
    
    public mostrarGrupo() {
        initComponents();
        btn_editar.setVisible(false);
        lbl_turnoEditable.setVisible(false);
        consultarGrupos();        
        this.lenguajeConfigurado();
    }

    void consultarAlumnos(){
        String consulta="SELECT codigo_grupo,turno,numero_lista,boleta,apellido_paterno,apellido_materno,nombre,correo FROM alumnos WHERE codigo_grupo = ?";
        try{
            
            ps=(PreparedStatement)conexion.conectar.prepareStatement(consulta);
            ps.setString(1,grupoElegido);
            rs=ps.executeQuery();
           
            Object[] alumno=new Object[8];
            modelo=(DefaultTableModel) tb_alumnos.getModel();
            limpiarTabla();
            while(rs.next()){
                alumno[0]=rs.getString(1);
                alumno[1]=rs.getInt(2);
                alumno[2]=rs.getInt(3);
                alumno[3]=rs.getInt(4);
                alumno[4]=rs.getString(5);
                alumno[5]=rs.getString(6);
                alumno[6]=rs.getString(7);
                alumno[7]=rs.getString(8);
                //alumno[7]=rs.getInt("Codigo de alumno");
                
                modelo.addRow(alumno);
            }
            tb_alumnos.setModel(modelo);
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        
    }
    void consultarGrupos(){
        String consulta="SELECT * FROM grupos";
        int i=0;
        cmb_grupos.addItem("Sleccione un grupo");
        try{
            st=(Statement)conexion.conectar.prepareStatement(consulta);
            rs=st.executeQuery("SELECT * FROM grupos");
            while(rs.next()){
                i++;
                grup=rs.getString(1);
                turnos.add(rs.getInt(2)); //código para añadir información al arreglo dinámico se guarda el valor del turno
                cmb_grupos.addItem(grup);
                cmb_grupos.requestFocus();
            }
        }catch(SQLException e){
        System.out.println("Error: "+e);        
        }
    }
    void limpiarTabla(){
        for(int i=0;i<tb_alumnos.getRowCount();i++){
            modelo.removeRow(i);
            System.out.println(tb_alumnos.getRowCount());
            i-=1;
        }
        tb_alumnos.setModel(modelo);
    }
    
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
        this.setTitle(traduccion.getProperty("tituloMostrarGrupo"));
        this.lbl_titulo.setText(traduccion.getProperty("lbl_tituloMostrarGrupo"));
        this.lbl_grupo.setText(traduccion.getProperty("lbl_grupo"));
        this.lbl_turno.setText(traduccion.getProperty("lbl_Turno"));
        this.lbl_turnoEditable.setText(traduccion.getProperty("lbl_turnoEditableM"));//investigar como hacer cambio dinámico de este campo
        Border pnl_Alumnos=pnl_alumnos.getBorder();//Obtiene el borde actual del panel pnl_Alumnos
        TitledBorder ttl_alumnos=(TitledBorder) pnl_Alumnos;//crea un objeto titledBorder con los valores del titledborder pnl_Alumnos
        ttl_alumnos.setTitle(traduccion.getProperty("pnl_alumnos"));//establece el titulo a ttl_alumnos
        //investigar como traducer el modelo de la tabla tb_alumnos
        this.lbl_nota.setText(traduccion.getProperty("lbl_nota"));
        this.lbl_nota2.setText(traduccion.getProperty("lbl_nota2"));
        this.lbl_nota3.setText(traduccion.getProperty("lbl_nota3"));
        this.btn_editar.setText(traduccion.getProperty("btn_editar"));
        //Se traduce toda la interfaz del programa
    }
    //</editor-fold>
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        lbl_grupo = new javax.swing.JLabel();
        cmb_grupos = new javax.swing.JComboBox<>();
        lbl_turno = new javax.swing.JLabel();
        lbl_turnoEditable = new javax.swing.JLabel();
        pnl_alumnos = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tb_alumnos = new javax.swing.JTable();
        lbl_nota = new javax.swing.JLabel();
        lbl_nota2 = new javax.swing.JLabel();
        lbl_nota3 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lbl_titulo.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        lbl_titulo.setText("Mostrar grupo");

        lbl_grupo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_grupo.setText("Grupo:");

        cmb_grupos.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        cmb_grupos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_gruposItemStateChanged(evt);
            }
        });
        cmb_grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_gruposActionPerformed(evt);
            }
        });

        lbl_turno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_turno.setText("Truno:");

        lbl_turnoEditable.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_turnoEditable.setText("texto editable");

        pnl_alumnos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alumnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 12))); // NOI18N

        tb_alumnos.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        tb_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grupo", "Turno", "Número lista", "Boleta", "Apellido paterno", "Apellido materno", "Nombre", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tb_alumnos);

        lbl_nota.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_nota.setText("Nota: si desea editar el");

        lbl_nota2.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_nota2.setText("abra la ventana para");

        lbl_nota3.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_nota3.setText("editar el grupo");

        btn_editar.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_editar.setText("Editar grupo");
        btn_editar.setEnabled(false);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_alumnosLayout = new javax.swing.GroupLayout(pnl_alumnos);
        pnl_alumnos.setLayout(pnl_alumnosLayout);
        pnl_alumnosLayout.setHorizontalGroup(
            pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alumnosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_editar)
                    .addComponent(lbl_nota)
                    .addComponent(lbl_nota2)
                    .addComponent(lbl_nota3))
                .addGap(23, 23, 23))
        );
        pnl_alumnosLayout.setVerticalGroup(
            pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alumnosLayout.createSequentialGroup()
                .addGroup(pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alumnosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbl_nota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_nota2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_nota3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar))
                    .addGroup(pnl_alumnosLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lbl_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_turno)
                            .addComponent(lbl_grupo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_turnoEditable)
                            .addComponent(cmb_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 462, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_titulo)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_grupo)
                    .addComponent(cmb_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_turno)
                    .addComponent(lbl_turnoEditable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_gruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_gruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_gruposActionPerformed

    private void cmb_gruposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_gruposItemStateChanged
        // TODO add your handling code here
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(cmb_grupos.getItemCount()>0){
                posCMB=cmb_grupos.getSelectedIndex();
                if(posCMB>0){
                    grupoElegido=cmb_grupos.getSelectedItem().toString();
                    if(turnos.get(posCMB-1)==0){
                        lbl_turnoEditable.setText("Matutino");
                        lbl_turnoEditable.setVisible(true);
                    }
                    else{
                        lbl_turnoEditable.setText("Vespertino");
                        lbl_turnoEditable.setVisible(true);
                    }
                    consultarAlumnos();
                }
                else{
                    lbl_turnoEditable.setText("");
                    lbl_turnoEditable.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_cmb_gruposItemStateChanged

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JComboBox<String> cmb_grupos;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbl_grupo;
    private javax.swing.JLabel lbl_nota;
    private javax.swing.JLabel lbl_nota2;
    private javax.swing.JLabel lbl_nota3;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_turno;
    private javax.swing.JLabel lbl_turnoEditable;
    private javax.swing.JPanel pnl_alumnos;
    private javax.swing.JTable tb_alumnos;
    // End of variables declaration//GEN-END:variables
}
