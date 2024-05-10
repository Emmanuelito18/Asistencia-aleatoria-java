/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Formularios.inicioSesion;
import propiedades.idioma;//hace las traducciones del programa
//<editor-fold defaultstate="collapsed" desc="Librerias para archivo properties y recordar de LookAndFeel">
import java.util.Properties;
import javax.swing.UIManager;
import java.io.FileInputStream;
import java.io.IOException;
//</editor-fold>

/**
 * Esta clase funciona como la clase principal de todo el programa
 * @author Emmanuelito18
 * @version 0.1 pre-alpha
 * @see <a href="https://sl.bing.net/boyOgJOk5lI" target="_blank">Etiquetas Javadoc en Java (Bing Copilot)</a> :leer para información más detallada sobre documentación 
 * en javadoc.
 * @see <a href="https://youtu.be/1n28VRCzJho%3Fsi%3DXsS8mPbWsenczusr" target="_blank">DOCUMENTAR MÉTODOS en Java con JAVADOC (youtube)</a> :ver video para mas información sobre como
 * hacer documentación correctamente.
 * @see <a href="https://youtu.be/GDX0oa0voec%3Fsi%3D3EZT8vdPo2Pnn3tS" target="_blank">Programación Java. Documenta tu código como un profesional con Javadoc (youtube)</a> :ver video para saber cómo
 * hacer documentación.
 */
public class principal {
    /*Aquí estarán todos los métodos que utilizarán las demás
    clases del programa, con el fin de optimizar todo el programa y
    hacerlo máa legible y fácil de entender el código del mismo programa
    Este proyecto aún es trabajo en progreso 
    */
    
    /**
     * Esta es el método principal del programa donde se 
     * invocan y realizan todos los procesos relevantes para el programa
     * @param args 
     */
    public static void main(String[] args){
        inicioSesion inicio=new inicioSesion();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        inicio.setResizable(false);
    }
}
