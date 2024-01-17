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
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
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
        try(Socket socket=new Socket()){
            int timeout=2000;//tiempo de espera en milisegundos
            SocketAddress socketAddress=new InetSocketAddress("www.google.com",80);
            socket.connect(socketAddress,timeout);
            return true;
        }catch(IOException e){
            return false;
        }
    }
    //</editor-fold>
    
    public static void main(String[] args){
        if(!verificarConexionInternet()){
            notificacionDSErrorConexion();
        }
    }
}
