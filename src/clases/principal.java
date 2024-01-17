/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

//<editor-fold defaultstate="collapsed" desc="Libreria notificaciones DS">
import Formularios.inicioSesion;
import ds.desktop.notify.DesktopNotify;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Libreria para conexion a internet">

//</editor-fold>

/**
 *
 * @author Emmanuelito18
 */
public class principal {
    //<editor-fold defaultstate="collapsed" desc="Notificaciones DS">
    public static void notificacionDSErrorConexion(){
        DesktopNotify.showDesktopMessage("Error de conexión","No se ha podido conectar a internet, por favor verifique su conexión a internet",DesktopNotify.ERROR,10000L);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Notificaciones RS">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Notificaciones Java">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Verificar notificacion">
    public static boolean verificarConexionInternet(){
     return true;
    }
    //</editor-fold>
    
    public static void main(String[] args){
        
    }
}
