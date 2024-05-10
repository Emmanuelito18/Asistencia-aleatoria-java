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

public class principal {
    /*Aquí estarán todos los métodos que utilizarán las demás
    clases del programa, con el fin de optimizar todo el programa y
    hacerlo máa legible y fácil de entender el código del mismo
    */
    
    public static void main(String[] args){
        inicioSesion inicio=new inicioSesion();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        inicio.setResizable(false);
    }
}
