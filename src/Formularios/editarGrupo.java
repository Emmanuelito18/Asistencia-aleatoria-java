/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Formularios;

import clases.conectarBase;
import java.awt.event.ItemEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/
import java.util.ArrayList;//libreria para arreglo dinámico
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import propiedades.idioma;
/**
 *
 * @author Emmanuelito18
 */
public class editarGrupo extends javax.swing.JInternalFrame {

    /**
     * Creates new form editarGrupo
     */
    conectarBase conexion=new conectarBase();
    Connection conect=null;
    String grup=null,grupoElegido=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    Statement st=null;
    ArrayList<Integer> turnos = new ArrayList<Integer>();//Arreglo dinámico donde se guarda el valor del turno
    int posCMB=0;
    int fila=0;
    int id=0;
    String identifica=null;
    
    DefaultTableModel modelo=new DefaultTableModel(){
    public boolean isCellEditable(int row,int column){
        return false;
    }
    };
    
    public editarGrupo() {
        initComponents();
        lbl_turnoEditable.setVisible(false);
        //btn_guardarGrupo.setEnabled(false);
        //btn_guardarAlumno.setEnabled(false);
        //btn_cancelar.setEnabled(false);
        consultarGrupos();
        this.lenguajeConfigurado();
    }
    void consultarAlumnos(){
        String consulta="SELECT * FROM alumnos WHERE codigo_grupo = ?";
        try{
            
            ps=(PreparedStatement)conexion.conectar.prepareStatement(consulta);
            ps.setString(1,grupoElegido);
            rs=ps.executeQuery();
           
            Object[] alumno=new Object[9];
            modelo=(DefaultTableModel) tb_alumnos.getModel();
            limpiarTabla();
            while(rs.next()){
                alumno[0]=rs.getInt(1);
                alumno[1]=rs.getString(2);
                alumno[2]=rs.getInt(3);
                alumno[3]=rs.getInt(4);
                alumno[4]=rs.getInt(5);
                alumno[5]=rs.getString(6);
                alumno[6]=rs.getString(7);
                alumno[7]=rs.getString(8);
                alumno[8]=rs.getString(9);
                
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
        this.setTitle(traduccion.getProperty("tituloEditarGrupo"));
        this.lbl_titulo.setText(traduccion.getProperty("lbl_tituloEditarGrupo"));
        Border pnl_Grupo=pnl_grupo.getBorder();//Obtiene el borde actual del panel pnl_grupo
        TitledBorder ttl_grupo=(TitledBorder) pnl_Grupo;//crea un objeto titledBorder con los valores del titledborder pnl_Grupo
        ttl_grupo.setTitle(traduccion.getProperty("pnl_grupoTitulo"));//establece el titulo a ttl_grupo
        this.lbl_grupo.setText(traduccion.getProperty("lbl_grupo"));
        this.lbl_turno.setText(traduccion.getProperty("lbl_turno"));
        this.lbl_turnoEditable.setText(traduccion.getProperty("lbl_turnoEditableM"));//investigar como hacer cambio dinámico de este campo
        this.lbl_alumnos.setText(traduccion.getProperty("lbl_alumnos"));
        //investigar como traducir el modelo de tb_alumnos
        this.btn_editarAlumno.setText(traduccion.getProperty("btn_editarAlumno"));
        Border pnl_Alumno=pnl_alumno.getBorder();//Obtiene el borde actual del panel pnl_alumno
        TitledBorder ttl_alumno=(TitledBorder) pnl_Alumno;//crea un objeto titledBorder con los valores del titledborder pnl_Alumno
        ttl_alumno.setTitle(traduccion.getProperty("pnl_alumnoTitulo"));//establece el titulo a ttl_alumno
        this.lbl_apellidoPaterno.setText(traduccion.getProperty("lbl_apellidoPaterno"));
        //this.lbl_avisoApellidoPaterno.setText(traduccion.getProperty("lbl_avisoCampoObligatorio"));
        this.lbl_apellidoMaterno.setText(traduccion.getProperty("lbl_apellidoMaterno"));
        //this.lbl_avisoApellidoMaterno.setText(traduccion.getProperty("lbl_avisoCampoObligatorio"));
        this.lbl_nombre.setText(traduccion.getProperty("lbl_nombre"));
        //this.lbl_avisoNombre.setText(traduccion.getProperty("lbl_avisoCampoObligatorio"));
        this.lbl_boleta.setText(traduccion.getProperty("lbl_boleta"));
        //this.lbl_avisoBoleta.setText(traduccion.getProperty("lbl_avisoCampoObligatorio"));
        this.lbl_numeroLista.setText(traduccion.getProperty("lbl_numeroLista"));
        //this.lbl_avisoNumeroLista.setText(traduccion.getProperty("lbl_campoObligatorio"));
        this.lbl_correo.setText(traduccion.getProperty("lbl_Correo"));//verificar este campo a traducir
        //this.lbl_avisoCorreo.setText(traduccion.getProperty("lbl_avisoCampoObligatorio"));//investigar como hacer cambio dinámico de este campo
        //investigar como traducir el modelo de la tabla tb_alumnos
        this.btn_guardarAlumno.setText(traduccion.getProperty("btn_guardarAlumno"));
        this.btn_guardarGrupo.setText(traduccion.getProperty("btn_guardarGrupo"));
        this.btn_editarAlumno.setText(traduccion.getProperty("btn_editarAlumno"));
        this.btn_cancelar.setText(traduccion.getProperty("btn_cancelar"));//Campo duplicado linea 75 y 87
        this.btn_salir.setText(traduccion.getProperty("btn_salir"));
        
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
        pnl_grupo = new javax.swing.JPanel();
        lbl_grupo = new javax.swing.JLabel();
        cmb_grupos = new javax.swing.JComboBox<>();
        lbl_turno = new javax.swing.JLabel();
        lbl_turnoEditable = new javax.swing.JLabel();
        lbl_alumnos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_alumnos = new javax.swing.JTable();
        btn_editarAlumno = new javax.swing.JButton();
        pnl_alumno = new javax.swing.JPanel();
        lbl_apellidoPaterno = new javax.swing.JLabel();
        txt_apellidoPaterno = new javax.swing.JTextField();
        lbl_apellidoMaterno = new javax.swing.JLabel();
        txt_apellidoMaterno = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_boleta = new javax.swing.JLabel();
        txt_boleta = new javax.swing.JTextField();
        lbl_numeroLista = new javax.swing.JLabel();
        txt_numeroLista = new javax.swing.JTextField();
        btn_guardarAlumno = new javax.swing.JButton();
        btn_guardarGrupo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_correo = new javax.swing.JTextField();
        lbl_correo = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lbl_titulo.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        lbl_titulo.setText("Editar grupo");

        pnl_grupo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grupo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        lbl_grupo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_grupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_grupo.setText("Grupo:");

        cmb_grupos.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        cmb_grupos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_gruposItemStateChanged(evt);
            }
        });

        lbl_turno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_turno.setText("Turno:");

        lbl_turnoEditable.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        lbl_turnoEditable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_alumnos.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_alumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_alumnos.setText("Alumnos:");

        tb_alumnos.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        tb_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Grupo", "Turno", "Número lista", "Boleta", "Apellido paterno", "Apellido materno", "Nombre", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_alumnosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_alumnos);

        btn_editarAlumno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_editarAlumno.setText("Editar alumno");
        btn_editarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_grupoLayout = new javax.swing.GroupLayout(pnl_grupo);
        pnl_grupo.setLayout(pnl_grupoLayout);
        pnl_grupoLayout.setHorizontalGroup(
            pnl_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_grupoLayout.createSequentialGroup()
                .addGroup(pnl_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_grupoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbl_turnoEditable, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_grupoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(pnl_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_grupoLayout.createSequentialGroup()
                        .addComponent(lbl_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_grupoLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(btn_editarAlumno)
                .addContainerGap())
        );
        pnl_grupoLayout.setVerticalGroup(
            pnl_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_grupoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_grupoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cmb_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_turno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_turnoEditable, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_grupoLayout.createSequentialGroup()
                        .addGroup(pnl_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_alumnos)
                            .addComponent(lbl_grupo))
                        .addGroup(pnl_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_grupoLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btn_editarAlumno))
                            .addGroup(pnl_grupoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pnl_alumno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alumno:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 12))); // NOI18N

        lbl_apellidoPaterno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_apellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_apellidoPaterno.setText("Apellido paterno");

        txt_apellidoPaterno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        txt_apellidoPaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_apellidoMaterno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_apellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_apellidoMaterno.setText("Apellido materno");

        txt_apellidoMaterno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        txt_apellidoMaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_nombre.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombre.setText("Nombre");

        txt_nombre.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_boleta.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_boleta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_boleta.setText("Boleta");

        txt_boleta.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        txt_boleta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_numeroLista.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_numeroLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_numeroLista.setText("Número de lista");

        txt_numeroLista.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        txt_numeroLista.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_guardarAlumno.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_guardarAlumno.setText("Guardar alumno");
        btn_guardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarAlumnoActionPerformed(evt);
            }
        });

        btn_guardarGrupo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_guardarGrupo.setText("Guardar grupo completo");
        btn_guardarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarGrupoActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_cancelar.setText("Cancelar edición");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_correo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_correo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        lbl_correo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_correo.setText("Correo");

        btn_salir.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_alumnoLayout = new javax.swing.GroupLayout(pnl_alumno);
        pnl_alumno.setLayout(pnl_alumnoLayout);
        pnl_alumnoLayout.setHorizontalGroup(
            pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_alumnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_apellidoPaterno)
                        .addComponent(lbl_apellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_boleta)
                        .addComponent(lbl_boleta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_apellidoMaterno)
                        .addComponent(lbl_apellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_numeroLista)
                        .addComponent(lbl_numeroLista, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_correo)
                        .addComponent(lbl_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_nombre)
                        .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardarAlumno)
                    .addComponent(btn_guardarGrupo))
                .addGap(25, 25, 25)
                .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salir)
                    .addComponent(btn_cancelar))
                .addGap(431, 431, 431))
        );
        pnl_alumnoLayout.setVerticalGroup(
            pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alumnoLayout.createSequentialGroup()
                .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alumnoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardarAlumno)
                            .addComponent(btn_cancelar))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardarGrupo)
                            .addComponent(btn_salir)))
                    .addGroup(pnl_alumnoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_alumnoLayout.createSequentialGroup()
                                .addComponent(lbl_apellidoPaterno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_apellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_alumnoLayout.createSequentialGroup()
                                    .addComponent(lbl_nombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_alumnoLayout.createSequentialGroup()
                                    .addComponent(lbl_apellidoMaterno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_apellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_alumnoLayout.createSequentialGroup()
                                .addComponent(lbl_boleta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_boleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_alumnoLayout.createSequentialGroup()
                                .addComponent(lbl_numeroLista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_numeroLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_alumnoLayout.createSequentialGroup()
                                .addComponent(lbl_correo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(lbl_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnl_grupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 916, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addComponent(pnl_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_gruposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_gruposItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(cmb_grupos.getItemCount()>0){
                posCMB=cmb_grupos.getSelectedIndex();
                if(posCMB>0){
                    grupoElegido=cmb_grupos.getSelectedItem().toString();
                    if(turnos.get(posCMB-1)==0){//si el valor de turnos en la posición del indice
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

    private void tb_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_alumnosMouseClicked
        // TODO add your handling code here:
        fila=tb_alumnos.getSelectedRow();
        btn_guardarAlumno.setEnabled(false);
        btn_editarAlumno.setEnabled(true);
        btn_salir.setEnabled(false);
    }//GEN-LAST:event_tb_alumnosMouseClicked

    private void btn_editarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarAlumnoActionPerformed
        // TODO add your handling code here:
        String Correo = null;
        if(fila==-1){
            JOptionPane.showMessageDialog(null,"No se seleccionó una fila");
        }
        else{
            identifica=(String)tb_alumnos.getValueAt(fila,0).toString();
           //id=(int)tb_alumnos.getValueAt(fila,0);
           String NumeroLista=(String)tb_alumnos.getValueAt(fila,3).toString();
           String Boleta=(String)tb_alumnos.getValueAt(fila,4).toString();
           String ApellidoPaterno=(String)tb_alumnos.getValueAt(fila,5).toString();
           String ApellidoMaterno=(String)tb_alumnos.getValueAt(fila,6).toString();
           String Nombre=(String)tb_alumnos.getValueAt(fila,7).toString();
           if(tb_alumnos.getValueAt(fila,8)==null){
               Correo="";
           }else{
               Correo=(String)tb_alumnos.getValueAt(fila,8).toString();
           }
           txt_apellidoPaterno.setText(ApellidoPaterno);
           txt_apellidoMaterno.setText(ApellidoMaterno);
           txt_nombre.setText(Nombre);
           txt_boleta.setText(Boleta);
           txt_numeroLista.setText(NumeroLista);
           txt_correo.setText(Correo);
           modelo.removeRow(fila);
        }
        btn_guardarAlumno.setEnabled(true);
        btn_editarAlumno.setEnabled(false);
        btn_salir.setEnabled(true);
    }//GEN-LAST:event_btn_editarAlumnoActionPerformed

    private void btn_guardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarAlumnoActionPerformed
        // TODO add your handling code here:
        String []info=new String[9];
        info[0]=identifica;
        info[1]=grupoElegido;
        info[2]=String.valueOf(turnos.get(posCMB));
        info[3]=txt_numeroLista.getText();
        info[4]=txt_boleta.getText();
        info[5]=txt_apellidoPaterno.getText();
        info[6]=txt_apellidoMaterno.getText();
        info[7]=txt_nombre.getText();
        if(txt_correo.getText().equals("")){
            info[8]=null;
        }else{
            info[8]=txt_correo.getText();
        }
        modelo.addRow(info);
        txt_apellidoMaterno.setText("");
        txt_apellidoPaterno.setText("");
        txt_nombre.setText("");
        txt_boleta.setText("");
        txt_numeroLista.setText("");
        txt_correo.setText("");
    }//GEN-LAST:event_btn_guardarAlumnoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        int res=JOptionPane.showConfirmDialog(rootPane,"¿Seguro que quiere cancelar la edición del alumno?\nNo se guardarán los datos no guardados","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        //this.dispose();
        if(res==JOptionPane.YES_OPTION){
            String []info=new String[9];
        info[0]=identifica;
        info[1]=grupoElegido;
        info[2]=String.valueOf(turnos.get(posCMB));
        info[3]=txt_numeroLista.getText();
        info[4]=txt_boleta.getText();
        info[5]=txt_apellidoPaterno.getText();
        info[6]=txt_apellidoMaterno.getText();
        info[7]=txt_nombre.getText();
        if(txt_correo.getText().equals("")){
            info[8]=null;
        }else{
            info[8]=txt_correo.getText();
        }
        modelo.addRow(info);
        txt_apellidoMaterno.setText("");
        txt_apellidoPaterno.setText("");
        txt_nombre.setText("");
        txt_boleta.setText("");
        txt_numeroLista.setText("");
        txt_correo.setText("");
        }
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        int res=JOptionPane.showConfirmDialog(null,"        ¿Está seguro que quieres salir?\nNo se guardarán los cambios no guardados previamente","Advertencia",JOptionPane.YES_NO_OPTION);
        if(res==JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_guardarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarGrupoActionPerformed
        // TODO add your handling code here:
       int lista,boleta;        
        if(tb_alumnos.getRowCount()>0){
            for(int i=0;i<tb_alumnos.getRowCount();i++){
                if(tb_alumnos.getValueAt(i,8)==null){            
                try{
                    String consulta="UPDATE alumnos SET numero_lista=?,boleta=?,apellido_paterno=?,apellido_materno=?,nombre=? WHERE codigo_alumno = ?";
                    /*ps=conexion.conectar.prepareStatement("INSERT INTO alumnos (codigo_grupo,turno,numero_lista,"
                        + "boleta,apellido_paterno,apellido_materno,nombre) VALUES (?,?,?,?,?,?,?)");*/
                    ps=(PreparedStatement)conexion.conectar.prepareStatement(consulta);
                   
                    
                    ps.setInt(1,lista=Integer.parseInt(tb_alumnos.getValueAt(i,3).toString()));//lista
                    ps.setInt(2,boleta=Integer.parseInt(tb_alumnos.getValueAt(i,4).toString()));//boleta
                    ps.setString(3,(String)tb_alumnos.getValueAt(i,5));//ap paterno
                    ps.setString(4,(String)tb_alumnos.getValueAt(i,6));//ap materno
                    ps.setString(5,(String)tb_alumnos.getValueAt(i,7));//nombre
                    ps.setInt(6,id=Integer.parseInt(identifica));//id
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(rootPane,"Grupo actualizado con éxito");
                    //limpiarCampos1();
                    ps.executeUpdate();
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(rootPane,"Error al guardar el artículo, verifique...");
                }
            }else{
             try{
                    String consulta="UPDATE alumnos SET numero_lista=?,boleta=?,apellido_paterno=?,apellido_materno=?,nombre=?,correo=? WHERE codigo_alumno = ?";
                    ps=conexion.conectar.prepareStatement(consulta);
                   
                    ps.setInt(1,lista=Integer.parseInt(tb_alumnos.getValueAt(i,3).toString()));//lista
                    ps.setInt(2,boleta=Integer.parseInt(tb_alumnos.getValueAt(i,4).toString()));//boleta
                    ps.setString(3,(String)tb_alumnos.getValueAt(i,5));//ap paterno
                    ps.setString(4,(String)tb_alumnos.getValueAt(i,6));//ap materno
                    ps.setString(5,(String)tb_alumnos.getValueAt(i,7));//nombre
                    ps.setString(6,(String)tb_alumnos.getValueAt(i,8));//correo
                    ps.setInt(7,id);//ID
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(rootPane,"Grupo actualizado con éxito");
                    //limpiarCampos1();
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(rootPane,"Error al guardar el artículo, verifique...");
                }   
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(null,"La tabla está vacía");
        }
        
    }//GEN-LAST:event_btn_guardarGrupoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editarAlumno;
    private javax.swing.JButton btn_guardarAlumno;
    private javax.swing.JButton btn_guardarGrupo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_grupos;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_alumnos;
    private javax.swing.JLabel lbl_apellidoMaterno;
    private javax.swing.JLabel lbl_apellidoPaterno;
    private javax.swing.JLabel lbl_boleta;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_grupo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_numeroLista;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_turno;
    private javax.swing.JLabel lbl_turnoEditable;
    private javax.swing.JPanel pnl_alumno;
    private javax.swing.JPanel pnl_grupo;
    private javax.swing.JTable tb_alumnos;
    private javax.swing.JTextField txt_apellidoMaterno;
    private javax.swing.JTextField txt_apellidoPaterno;
    private javax.swing.JTextField txt_boleta;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numeroLista;
    // End of variables declaration//GEN-END:variables
}
