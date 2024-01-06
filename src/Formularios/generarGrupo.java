/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Formularios;

import clases.conectarBase;
import java.awt.event.ItemEvent;
/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.ArrayList;//libreria para arreglo dinámico

/**
 *
 * @author Emmanuelito18
 */
public class generarGrupo extends javax.swing.JInternalFrame {

    /**
     * Creates new form generarGrupo
     */
 public static boolean contiene(int[] array, int numero) {
    for (int i : array) {
      if (i == numero) {
        return true;
      }
    }

    return false;
  }
    conectarBase conexion=new conectarBase();
    Connection conect=null;
    String grup=null,grupoElegido=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    Statement st=null;
    ArrayList<Integer> turnos = new ArrayList<Integer>();//Arreglo dinámico donde se guarda el valor del turno
    int posCMB=0;
    int turnoEntero;
    int[] numerosDeListaSeleccionados= new int[15];
    
    DefaultTableModel modelo=new DefaultTableModel(){
    public boolean isCellEditable(int row,int column){
        return false;
    }
    };
    
    DefaultTableModel modelo2=new DefaultTableModel(){
    public boolean isCellEditable(int row,int column){
        return false;
    }
    };
    
    DefaultTableModel modelo3=new DefaultTableModel(){
    public boolean isCellEditable(int row,int column){
        return false;
    }
    
    };
    public generarGrupo() {
        initComponents();
        lbl_turnoEditable.setVisible(false);
        /*La pongo invisible para que no se vea que dice texto editable y solo se vea el grupo cuando se selecciona un grupo*/
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
            modelo=(DefaultTableModel) tb_grupo.getModel();
            modelo2=(DefaultTableModel) tb_excepciones.getModel();
            modelo3=(DefaultTableModel) tb_asisten.getModel();
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
            tb_grupo.setModel(modelo);
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
        modelo=(DefaultTableModel) tb_grupo.getModel();
        modelo2=(DefaultTableModel) tb_excepciones.getModel();
        modelo3=(DefaultTableModel) tb_asisten.getModel();
        for(int i=0;i<tb_grupo.getRowCount();i++){
            modelo.removeRow(i);
            //System.out.println(tb_grupo.getRowCount());
            i-=1;
        }
        tb_grupo.setModel(modelo);
        
        for(int i=0;i<tb_excepciones.getRowCount();i++){
            modelo2.removeRow(i);
            //System.out.println(tb_excepciones.getRowCount());
            i-=1;
        }
        tb_excepciones.setModel(modelo2);
        
        for(int i=0;i<tb_asisten.getRowCount();i++){
            modelo3.removeRow(i);
            //System.out.println(tb_asisten.getRowCount());
            i-=1;
        }
        tb_asisten.setModel(modelo3);
        
    }
    
    void consultarAlumnos2(){
        String consulta="SELECT codigo_grupo,turno,numero_lista,boleta,apellido_paterno,apellido_materno,nombre,correo FROM alumnos WHERE codigo_grupo = ? AND turno = ?";
        try{
            
            ps=(PreparedStatement)conexion.conectar.prepareStatement(consulta);
            ps.setString(1,grupoElegido);
            ps.setInt(2,turnoEntero);
            //ps.setArray(3,numerosDeListaSeleccionados);
            rs=ps.executeQuery();
           
            Object[] alumno=new Object[8];
            modelo=(DefaultTableModel) tb_grupo.getModel();
            modelo2=(DefaultTableModel) tb_excepciones.getModel();
            modelo3=(DefaultTableModel) tb_asisten.getModel();
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
                
                modelo3.addRow(alumno);
            }
            tb_asisten.setModel(modelo3);
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        
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
        pnl_grupos = new javax.swing.JPanel();
        lbl_grupo = new javax.swing.JLabel();
        cmb_grupos = new javax.swing.JComboBox<>();
        lbl_turno = new javax.swing.JLabel();
        lbl_turnoEditable = new javax.swing.JLabel();
        pnl_alumnos = new javax.swing.JPanel();
        lbl_grupoCompleto = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_grupo = new javax.swing.JTable();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_generar = new javax.swing.JButton();
        lbl_excepciones = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tb_excepciones = new javax.swing.JTable();
        lbl_asisten = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_asisten = new javax.swing.JTable();
        btn_enviarResultado = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lbl_titulo.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        lbl_titulo.setText("Generar alumnos");

        pnl_grupos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grupos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 12))); // NOI18N

        lbl_grupo.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        lbl_grupo.setText("Grupo:");

        cmb_grupos.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        cmb_grupos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_gruposItemStateChanged(evt);
            }
        });

        lbl_turno.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        lbl_turno.setText("Turno:");

        lbl_turnoEditable.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        lbl_turnoEditable.setText("Texto editable");

        javax.swing.GroupLayout pnl_gruposLayout = new javax.swing.GroupLayout(pnl_grupos);
        pnl_grupos.setLayout(pnl_gruposLayout);
        pnl_gruposLayout.setHorizontalGroup(
            pnl_gruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gruposLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(lbl_grupo)
                .addGap(18, 18, 18)
                .addComponent(cmb_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(lbl_turno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_turnoEditable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_gruposLayout.setVerticalGroup(
            pnl_gruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gruposLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pnl_gruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_gruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_turno)
                        .addComponent(lbl_turnoEditable))
                    .addComponent(lbl_grupo))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnl_alumnos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alumnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 12))); // NOI18N

        lbl_grupoCompleto.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_grupoCompleto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_grupoCompleto.setText("Grupo completo");

        tb_grupo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        tb_grupo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tb_grupo);

        btn_agregar.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_agregar.setText("Agregar ->");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_eliminar.setText("Eliminar <-");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_generar.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        lbl_excepciones.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_excepciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_excepciones.setText("Excepciones");

        tb_excepciones.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        tb_excepciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tb_excepciones);

        lbl_asisten.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_asisten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_asisten.setText("Deben asistir");

        tb_asisten.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        tb_asisten.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tb_asisten);

        btn_enviarResultado.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_enviarResultado.setText("Enviar resultado");
        btn_enviarResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_alumnosLayout = new javax.swing.GroupLayout(pnl_alumnos);
        pnl_alumnos.setLayout(pnl_alumnosLayout);
        pnl_alumnosLayout.setHorizontalGroup(
            pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alumnosLayout.createSequentialGroup()
                .addGroup(pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_grupoCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alumnosLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lbl_excepciones, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_alumnosLayout.createSequentialGroup()
                        .addGroup(pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_alumnosLayout.createSequentialGroup()
                                .addGroup(pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_agregar)
                                    .addComponent(btn_eliminar))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_alumnosLayout.createSequentialGroup()
                                .addComponent(btn_generar)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_alumnosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_asisten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btn_enviarResultado)
                .addGap(178, 178, 178))
        );
        pnl_alumnosLayout.setVerticalGroup(
            pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alumnosLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_grupoCompleto)
                    .addComponent(lbl_excepciones))
                .addGap(18, 18, 18)
                .addGroup(pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_alumnosLayout.createSequentialGroup()
                        .addComponent(btn_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_generar))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_asisten)
                .addGap(12, 12, 12)
                .addGroup(pnl_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_alumnosLayout.createSequentialGroup()
                        .addComponent(btn_enviarResultado)
                        .addGap(38, 38, 38)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnl_grupos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        // TODO add your handling code here:
        if(cmb_grupos.getSelectedIndex()==0||cmb_grupos.getSelectedIndex()==-1){
            //Si se ha seleccionado el primer bojeto o no se ha seleccionado ninguno
         JOptionPane.showMessageDialog(this,"No se ha seleccionado ningún grupo", "Atención mamahuevo", HEIGHT);
        }else{//si hay algún objeto seleccionado
        //Código que elije 15 numeros al azar
        int[] numerosDeLista= new int[31];
        
        int tam=tb_grupo.getRowCount();
        Random azar=new Random();
        String grupo;
        
        for(int i=0;i<tam;i++){
            numerosDeLista[i]=Integer.parseInt(tb_grupo.getValueAt(i,2).toString());
        }
        
        int contador=0;
        
        while(contador<15){
             //obtener el número al azar y almacenarlo           
            int indiceSeleccionado = azar.nextInt(numerosDeLista.length);//obtiene un numero al azar de numerosDeLista
            int numeroSeleccionado = numerosDeLista[indiceSeleccionado];

            // Si el número ya fue seleccionado, continuar con el siguiente
            if (numeroSeleccionado == 0) {
                continue;
            }

            // Guardar el número seleccionado y marcarlo como ya seleccionado
            numerosDeListaSeleccionados[contador] = numeroSeleccionado;
            numerosDeLista[indiceSeleccionado] = 0;

            contador++;
    }
        System.out.println(Arrays.toString(numerosDeListaSeleccionados));
    //Consultar en la base de datos la información de los alumnos con los numeros de lista del grupo seleccionado
    grupo=cmb_grupos.getSelectedItem().toString();
    String turno=lbl_turnoEditable.getText();
    if(turno.equalsIgnoreCase("Matutino")){
        turnoEntero=0;
    }
    else if(turno.equalsIgnoreCase("")){
        
    }
    else{
        turnoEntero=1;
    }
    consultarAlumnos2();
        }
    }//GEN-LAST:event_btn_generarActionPerformed

    private void cmb_gruposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_gruposItemStateChanged
        // TODO add your handling code here:
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

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada=tb_grupo.getSelectedRow();
        //obtengo la fila seleccionada de tb_grupo
        
        if(filaSeleccionada>=0){
            //si la fila seleccionada es mayor o igual a 0
            
            String Datos[]=new String[8];
            //creo un arreglo de tipo String de 8 espacios
            Datos[0]=tb_grupo.getValueAt(filaSeleccionada,0).toString();
            Datos[1]=tb_grupo.getValueAt(filaSeleccionada,1).toString();
            Datos[2]=tb_grupo.getValueAt(filaSeleccionada,2).toString();
            Datos[3]=tb_grupo.getValueAt(filaSeleccionada,3).toString();
            Datos[4]=tb_grupo.getValueAt(filaSeleccionada,4).toString();
            Datos[5]=tb_grupo.getValueAt(filaSeleccionada,5).toString();
            Datos[6]=tb_grupo.getValueAt(filaSeleccionada,6).toString();
            Datos[7]=tb_grupo.getValueAt(filaSeleccionada,7).toString();
            //asigno los datos de tb_grupo a el arreglo Datos
            modelo2.addRow(Datos);
            //agrego una fila al modelo2 con los datos del arrelo Datos
            tb_excepciones.setModel(modelo2);
            //le asigno a tb_excepciones el modelo2
            modelo.removeRow(filaSeleccionada);
            //elimino la filaseleccionada de modelo
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        
        //se hace lo mismo que en btn_agrear pero al revez
        int filaSeleccionada=tb_excepciones.getSelectedRow();
        
        if(filaSeleccionada>=0){
            String Datos[]=new String[8];
            Datos[0]=tb_excepciones.getValueAt(filaSeleccionada,0).toString();
            Datos[1]=tb_excepciones.getValueAt(filaSeleccionada,1).toString();
            Datos[2]=tb_excepciones.getValueAt(filaSeleccionada,2).toString();
            Datos[3]=tb_excepciones.getValueAt(filaSeleccionada,3).toString();
            Datos[4]=tb_excepciones.getValueAt(filaSeleccionada,4).toString();
            Datos[5]=tb_excepciones.getValueAt(filaSeleccionada,5).toString();
            Datos[6]=tb_excepciones.getValueAt(filaSeleccionada,6).toString();
            Datos[7]=tb_excepciones.getValueAt(filaSeleccionada,7).toString();
            
            modelo.addRow(Datos);
            tb_grupo.setModel(modelo);
            modelo2.removeRow(filaSeleccionada);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_enviarResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarResultadoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null,"¿Estás seguro que quieres enviar el aviso a los alumnos de este grupo? Se borrarán los datos de esta ventana","Atención", WIDTH, HEIGHT);
        limpiarTabla();
    }//GEN-LAST:event_btn_enviarResultadoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_enviarResultado;
    private javax.swing.JButton btn_generar;
    private javax.swing.JComboBox<String> cmb_grupos;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbl_asisten;
    private javax.swing.JLabel lbl_excepciones;
    private javax.swing.JLabel lbl_grupo;
    private javax.swing.JLabel lbl_grupoCompleto;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_turno;
    private javax.swing.JLabel lbl_turnoEditable;
    private javax.swing.JPanel pnl_alumnos;
    private javax.swing.JPanel pnl_grupos;
    private javax.swing.JTable tb_asisten;
    private javax.swing.JTable tb_excepciones;
    private javax.swing.JTable tb_grupo;
    // End of variables declaration//GEN-END:variables
}
