/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import ds.desktop.notify.DesktopNotify;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jvnet.substance.SubstanceLookAndFeel;
//Librerias para cambiar el idioma
import propiedades.idioma;

/**
 *
 * @author Emmanuelito18
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    private Properties prop;
    
    public principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        prop=new Properties();
        //Carga el archivo .properties
        try{
            prop.load(new FileInputStream("src\\propiedades\\configuracion.properties"));
        }catch(IOException e){
            e.printStackTrace();
        }
        this.lenguajeConfigurado();
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
        pnl_acciones = new javax.swing.JPanel();
        btn_crearGrupo = new javax.swing.JButton();
        btn_editarGrupo = new javax.swing.JButton();
        btn_mostrarGrupo = new javax.swing.JButton();
        btn_generarAlumnos = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        dsk_ventanas = new javax.swing.JDesktopPane();
        mnubr_menu = new javax.swing.JMenuBar();
        mnu_archivo = new javax.swing.JMenu();
        mni_crearGrupo = new javax.swing.JMenuItem();
        mni_editarGrupo = new javax.swing.JMenuItem();
        mni_mostrarGrupo = new javax.swing.JMenuItem();
        Separador1 = new javax.swing.JPopupMenu.Separator();
        mni_generarAlumnos = new javax.swing.JMenuItem();
        Separador2 = new javax.swing.JPopupMenu.Separator();
        mni_salir = new javax.swing.JMenuItem();
        mnu_idioma = new javax.swing.JMenu();
        mni_espanol = new javax.swing.JMenuItem();
        mni_ingles = new javax.swing.JMenuItem();
        Separador3 = new javax.swing.JPopupMenu.Separator();
        mni_frances = new javax.swing.JMenuItem();
        mni_italiano = new javax.swing.JMenuItem();
        mnu_ayuda = new javax.swing.JMenu();
        mni_manual = new javax.swing.JMenuItem();
        Separador4 = new javax.swing.JPopupMenu.Separator();
        mni_informacion = new javax.swing.JMenuItem();
        mnu_temas = new javax.swing.JMenu();
        mni_macAntiguo = new javax.swing.JMenuItem();
        mni_macClaro = new javax.swing.JMenuItem();
        mni_macOscuro = new javax.swing.JMenuItem();
        mni_mango = new javax.swing.JMenuItem();
        mni_nemo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1366, 728));
        setMaximumSize(new java.awt.Dimension(1366, 728));
        setPreferredSize(new java.awt.Dimension(1366, 728));

        lbl_titulo.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        lbl_titulo.setText("Asistencia aleatoria");

        pnl_acciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 12))); // NOI18N

        btn_crearGrupo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_crearGrupo.setText("Crear grupo");
        btn_crearGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearGrupoActionPerformed(evt);
            }
        });

        btn_editarGrupo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_editarGrupo.setText("Editar grupo");
        btn_editarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarGrupoActionPerformed(evt);
            }
        });

        btn_mostrarGrupo.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_mostrarGrupo.setText("Mostrar grupo");
        btn_mostrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarGrupoActionPerformed(evt);
            }
        });

        btn_generarAlumnos.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_generarAlumnos.setText("Generar alumnos");
        btn_generarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarAlumnosActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_accionesLayout = new javax.swing.GroupLayout(pnl_acciones);
        pnl_acciones.setLayout(pnl_accionesLayout);
        pnl_accionesLayout.setHorizontalGroup(
            pnl_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_generarAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_mostrarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_crearGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_accionesLayout.setVerticalGroup(
            pnl_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accionesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btn_crearGrupo)
                .addGap(33, 33, 33)
                .addComponent(btn_editarGrupo)
                .addGap(44, 44, 44)
                .addComponent(btn_mostrarGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btn_generarAlumnos)
                .addGap(29, 29, 29)
                .addComponent(btn_salir)
                .addGap(89, 89, 89))
        );

        dsk_ventanas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout dsk_ventanasLayout = new javax.swing.GroupLayout(dsk_ventanas);
        dsk_ventanas.setLayout(dsk_ventanasLayout);
        dsk_ventanasLayout.setHorizontalGroup(
            dsk_ventanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        dsk_ventanasLayout.setVerticalGroup(
            dsk_ventanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
        );

        mnu_archivo.setText("Archivo");

        mni_crearGrupo.setText("Crear grupo");
        mni_crearGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_crearGrupoActionPerformed(evt);
            }
        });
        mnu_archivo.add(mni_crearGrupo);

        mni_editarGrupo.setText("Editar grupo");
        mni_editarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_editarGrupoActionPerformed(evt);
            }
        });
        mnu_archivo.add(mni_editarGrupo);

        mni_mostrarGrupo.setText("Mostrar grupo");
        mni_mostrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_mostrarGrupoActionPerformed(evt);
            }
        });
        mnu_archivo.add(mni_mostrarGrupo);
        mnu_archivo.add(Separador1);

        mni_generarAlumnos.setText("Generar alumnos");
        mni_generarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_generarAlumnosActionPerformed(evt);
            }
        });
        mnu_archivo.add(mni_generarAlumnos);
        mnu_archivo.add(Separador2);

        mni_salir.setText("Salir");
        mni_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_salirActionPerformed(evt);
            }
        });
        mnu_archivo.add(mni_salir);

        mnubr_menu.add(mnu_archivo);

        mnu_idioma.setText("Idioma");

        mni_espanol.setText("Español");
        mni_espanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_espanolActionPerformed(evt);
            }
        });
        mnu_idioma.add(mni_espanol);

        mni_ingles.setText("English");
        mni_ingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_inglesActionPerformed(evt);
            }
        });
        mnu_idioma.add(mni_ingles);
        mnu_idioma.add(Separador3);

        mni_frances.setText("Français");
        mni_frances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_francesActionPerformed(evt);
            }
        });
        mnu_idioma.add(mni_frances);

        mni_italiano.setText("Italiano");
        mni_italiano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_italianoActionPerformed(evt);
            }
        });
        mnu_idioma.add(mni_italiano);

        mnubr_menu.add(mnu_idioma);

        mnu_ayuda.setText("Ayuda");

        mni_manual.setText("Manual");
        mni_manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_manualActionPerformed(evt);
            }
        });
        mnu_ayuda.add(mni_manual);
        mnu_ayuda.add(Separador4);

        mni_informacion.setText("Acerca de...");
        mni_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_informacionActionPerformed(evt);
            }
        });
        mnu_ayuda.add(mni_informacion);

        mnubr_menu.add(mnu_ayuda);

        mnu_temas.setText("Temas");

        mni_macAntiguo.setText("Mac antiguo");
        mni_macAntiguo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_macAntiguoActionPerformed(evt);
            }
        });
        mnu_temas.add(mni_macAntiguo);

        mni_macClaro.setText("Mac claro");
        mni_macClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_macClaroActionPerformed(evt);
            }
        });
        mnu_temas.add(mni_macClaro);

        mni_macOscuro.setText("Mac oscuro");
        mni_macOscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_macOscuroActionPerformed(evt);
            }
        });
        mnu_temas.add(mni_macOscuro);

        mni_mango.setText("Mango");
        mni_mango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_mangoActionPerformed(evt);
            }
        });
        mnu_temas.add(mni_mango);

        mni_nemo.setText("Nemo");
        mni_nemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_nemoActionPerformed(evt);
            }
        });
        mnu_temas.add(mni_nemo);

        mnubr_menu.add(mnu_temas);

        setJMenuBar(mnubr_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(lbl_titulo)
                .addContainerGap(541, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_acciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsk_ventanas))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_titulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnl_acciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(dsk_ventanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn_crearGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearGrupoActionPerformed
        // TODO add your handling code here:
        fCrearGrupo();
    }//GEN-LAST:event_btn_crearGrupoActionPerformed

    private void btn_editarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarGrupoActionPerformed
        // TODO add your handling code here:
        fEditarGrupo();
    }//GEN-LAST:event_btn_editarGrupoActionPerformed

    private void btn_mostrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarGrupoActionPerformed
        // TODO add your handling code here:
        fMostrarGrupo();
    }//GEN-LAST:event_btn_mostrarGrupoActionPerformed

    private void btn_generarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarAlumnosActionPerformed
        // TODO add your handling code here:
       DesktopNotify.showDesktopMessage("Esta caracteristica aún no está terminada","Ups... esto aun es trabajo en progreso",DesktopNotify.INFORMATION,9000L);
       //JOptionPane.showMessageDialog(null,"Está característica aún no está terminada","Ups... esto aún es trabajo en progreso",JOptionPane.INFORMATION_MESSAGE);
        fGenerarGrupo();
    }//GEN-LAST:event_btn_generarAlumnosActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        fSalir();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void mni_crearGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_crearGrupoActionPerformed
        // TODO add your handling code here:
        fCrearGrupo();
    }//GEN-LAST:event_mni_crearGrupoActionPerformed

    private void mni_editarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_editarGrupoActionPerformed
        // TODO add your handling code here:
        fEditarGrupo();
    }//GEN-LAST:event_mni_editarGrupoActionPerformed

    private void mni_mostrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_mostrarGrupoActionPerformed
        // TODO add your handling code here:
        fMostrarGrupo();
    }//GEN-LAST:event_mni_mostrarGrupoActionPerformed

    private void mni_generarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_generarAlumnosActionPerformed
        // TODO add your handling code here:
        fGenerarGrupo();
    }//GEN-LAST:event_mni_generarAlumnosActionPerformed

    private void mni_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_salirActionPerformed
        // TODO add your handling code here:
        fSalir();
    }//GEN-LAST:event_mni_salirActionPerformed

    private void mni_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_informacionActionPerformed
        // TODO add your handling code here
        JOptionPane.showMessageDialog(rootPane,"Asistencia aleatoria creado por:                                "
                + "\nArizmedi Ponce Jhoana Michel\nMejía Castañeda Bryan Emmanuel");
        
    }//GEN-LAST:event_mni_informacionActionPerformed

    private void mni_espanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_espanolActionPerformed
        // TODO add your handling code here:
        cambiarIdioma("Español");
        guardarIdioma("Español");
    }//GEN-LAST:event_mni_espanolActionPerformed

    private void mni_inglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_inglesActionPerformed
        // TODO add your handling code here:
        cambiarIdioma("Inglés");
        guardarIdioma("Inglés");
    }//GEN-LAST:event_mni_inglesActionPerformed

    private void mni_francesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_francesActionPerformed
        // TODO add your handling code here:
        cambiarIdioma("Francés");
        guardarIdioma("Francés");
    }//GEN-LAST:event_mni_francesActionPerformed

    private void mni_italianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_italianoActionPerformed
        // TODO add your handling code here:
        cambiarIdioma("Italiano");
        guardarIdioma("Italiano");
    }//GEN-LAST:event_mni_italianoActionPerformed

    private void mni_manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_manualActionPerformed
        // TODO add your handling code here:
        fCaracteristica();
    }//GEN-LAST:event_mni_manualActionPerformed

    private void mni_macAntiguoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_macAntiguoActionPerformed
        changeLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
    }//GEN-LAST:event_mni_macAntiguoActionPerformed

    private void mni_macClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_macClaroActionPerformed
        changeLookAndFeel("com.formdev.flatlaf.themes.FlatMacLightLaf");
    }//GEN-LAST:event_mni_macClaroActionPerformed

    private void mni_macOscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_macOscuroActionPerformed
        changeLookAndFeel("com.formdev.flatlaf.themes.FlatMacDarkLaf");
    }//GEN-LAST:event_mni_macOscuroActionPerformed

    private void mni_mangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_mangoActionPerformed
        changeLookAndFeel("org.jvnet.substance.skin.MangoSkin");
    }//GEN-LAST:event_mni_mangoActionPerformed

    private void mni_nemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_nemoActionPerformed
        changeLookAndFeel("org.jvnet.substance.skin.FindingNemoSkin");
    }//GEN-LAST:event_mni_nemoActionPerformed

    //<editor-fold defaultstate="collapsed" desc="Traducción del programa"> linea 466
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
        this.setTitle(traduccion.getProperty("tituloPrincipal"));
        this.lbl_titulo.setText(traduccion.getProperty("lbl_tituloPrincipal"));
        //Traducciones para panel Acciones
        this.pnl_acciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null,traduccion.getProperty("pnl_accionesTitulo"),javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,javax.swing.border.TitledBorder.DEFAULT_POSITION,new java.awt.Font("Lucida Handwriting",0,12)));
        this.btn_crearGrupo.setText(traduccion.getProperty("accionesCrearGrupo"));
        this.btn_editarGrupo.setText(traduccion.getProperty("accionesEditarGrupo"));
        this.btn_mostrarGrupo.setText(traduccion.getProperty("accionesMostrarGrupo"));
        this.btn_generarAlumnos.setText(traduccion.getProperty("accionesGenerarAlumnos"));
        this.btn_salir.setText(traduccion.getProperty("accionesSalir"));
        //Traducciones para mnu_archivo
        this.mnu_archivo.setText(traduccion.getProperty("mnu_archivo"));
        this.mni_crearGrupo.setText(traduccion.getProperty("accionesCrearGrupo"));
        this.mni_editarGrupo.setText(traduccion.getProperty("accionesEditarGrupo"));
        this.mni_mostrarGrupo.setText(traduccion.getProperty("accionesMostrarGrupo"));
        this.mni_generarAlumnos.setText(traduccion.getProperty("accionesGenerarAlumnos"));
        this.mni_salir.setText(traduccion.getProperty("accionesSalir"));
        //Traducciones para mnu_idioma
        this.mnu_idioma.setText(traduccion.getProperty("mnu_idioma"));
        this.mni_espanol.setText(traduccion.getProperty("mni_espanol"));
        this.mni_ingles.setText(traduccion.getProperty("mni_ingles"));
        this.mni_frances.setText(traduccion.getProperty("mni_frances"));
        this.mni_italiano.setText(traduccion.getProperty("mni_italiano"));
        //Traducciones para mnu_ayuda
        this.mnu_ayuda.setText(traduccion.getProperty("mnu_ayuda"));
        this.mni_manual.setText(traduccion.getProperty("mni_manual"));
        this.mni_informacion.setText(traduccion.getProperty("mni_informacion"));
        //traducciones para mnu_temas
        this.mnu_temas.setText(traduccion.getProperty("mnu_temas"));
        this.mni_macAntiguo.setText(traduccion.getProperty("mni_macAntiguo"));
        this.mni_macClaro.setText(traduccion.getProperty("mni_macClaro"));
        this.mni_macOscuro.setText(traduccion.getProperty("mni_macOscuro"));
        this.mni_mango.setText(traduccion.getProperty("mni_mango"));
        this.mni_nemo.setText(traduccion.getProperty("mni_nemo"));
        //Se traduce toda la interfaz del programa     
    }
    private void guardarIdioma(String idiomaSeleccionado){
        try{
            prop.setProperty("idioma", idiomaSeleccionado);
            prop.store(new FileOutputStream("src\\propiedades\\configuracion.properties"), null);
        }catch(Exception e){
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    public void fCrearGrupo(){
        crearGrupo crear=new crearGrupo();
        dsk_ventanas.add(crear);
        crear.setVisible(true);
    }
    public void fEditarGrupo(){
        editarGrupo editar=new editarGrupo();
        dsk_ventanas.add(editar);
        editar.setVisible(true);
    }
    public void fMostrarGrupo(){
        mostrarGrupo mostrar=new mostrarGrupo();
        dsk_ventanas.add(mostrar);
        mostrar.setVisible(true);
    }
    public void fGenerarGrupo(){
        generarGrupo generar=new generarGrupo();
        dsk_ventanas.add(generar);
        generar.setVisible(true);
    }
    public void fSalir(){
        //conexion.close();
        System.exit(0);
    }
    public void fCaracteristica(){
        JOptionPane.showMessageDialog(null,"Lo sentimos esta caracteristica aún no está disponible","Información que cura",JOptionPane.INFORMATION_MESSAGE);
    }
    private void changeLookAndFeel(String lookAndFeel){
        if(lookAndFeel.contains("org.jvnet.substance")){
            try {
                UIManager.setLookAndFeel("org.jvnet.substance.SubstanceLookAndFeel");
                SubstanceLookAndFeel.setSkin(lookAndFeel);
                //Código para Look And Feel para Substance
                SwingUtilities.updateComponentTreeUI(this);
                prop.setProperty("lookAndFeel",lookAndFeel);
                prop.store(new FileOutputStream("src\\propiedades\\configuracion.properties"),null);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }catch(Exception e){
            e.printStackTrace();
            }
        }else if(lookAndFeel.equals("com.jtattoo.plaf.mcwin.McWinLookAndFeel")){
            /*tiene un problema al cambiar a este estilo si el programa no se
            abre con este estilo desde el inicio*/
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
                UIManager.setLookAndFeel(lookAndFeel);
                SwingUtilities.updateComponentTreeUI(this);
                prop.setProperty("lookAndFeel",lookAndFeel);
                prop.store(new FileOutputStream("src\\propiedades\\configuracion.properties"),null);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                }catch(Exception e){
                    e.printStackTrace();
                }
        }else{
            try{
                UIManager.setLookAndFeel(lookAndFeel);
                SwingUtilities.updateComponentTreeUI(this);
                prop.setProperty("lookAndFeel",lookAndFeel);
                prop.store(new FileOutputStream("src\\propiedades\\configuracion.properties"),null);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }catch(Exception e){
                e.printStackTrace();
            }
        }   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator Separador1;
    private javax.swing.JPopupMenu.Separator Separador2;
    private javax.swing.JPopupMenu.Separator Separador3;
    private javax.swing.JPopupMenu.Separator Separador4;
    private javax.swing.JButton btn_crearGrupo;
    private javax.swing.JButton btn_editarGrupo;
    private javax.swing.JButton btn_generarAlumnos;
    private javax.swing.JButton btn_mostrarGrupo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JDesktopPane dsk_ventanas;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JMenuItem mni_crearGrupo;
    private javax.swing.JMenuItem mni_editarGrupo;
    private javax.swing.JMenuItem mni_espanol;
    private javax.swing.JMenuItem mni_frances;
    private javax.swing.JMenuItem mni_generarAlumnos;
    private javax.swing.JMenuItem mni_informacion;
    private javax.swing.JMenuItem mni_ingles;
    private javax.swing.JMenuItem mni_italiano;
    private javax.swing.JMenuItem mni_macAntiguo;
    private javax.swing.JMenuItem mni_macClaro;
    private javax.swing.JMenuItem mni_macOscuro;
    private javax.swing.JMenuItem mni_mango;
    private javax.swing.JMenuItem mni_manual;
    private javax.swing.JMenuItem mni_mostrarGrupo;
    private javax.swing.JMenuItem mni_nemo;
    private javax.swing.JMenuItem mni_salir;
    private javax.swing.JMenu mnu_archivo;
    private javax.swing.JMenu mnu_ayuda;
    private javax.swing.JMenu mnu_idioma;
    private javax.swing.JMenu mnu_temas;
    private javax.swing.JMenuBar mnubr_menu;
    private javax.swing.JPanel pnl_acciones;
    // End of variables declaration//GEN-END:variables
}
