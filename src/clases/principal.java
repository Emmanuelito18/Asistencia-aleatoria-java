/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

//<editor-fold defaultstate="collapsed" desc="Libreria notificaciones DS">
import ds.desktop.notify.DesktopNotify;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Libreria para conexion a internet">
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Librerías para archivos de propiedades">
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
//</editor-fold>

/**
 *
 * @author Emmanuelito18
 */
public class principal {
    //<editor-fold defaultstate="collapsed" desc="Verificar conexión internet">
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
    
    //<editor-fold defaultstate="collapsed" desc="manejo de archivos de propiedades">
    /*
        este espacio se utilizará para menejar los temas del programa
        temas de notificaciones e idiomas del programa
    */
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Función principal de programa">
    public static void main(String[] args){
        if(verificarConexionInternet()){//Si no hay conexión a internet
            /*anadir código para que muestre la notificación un tipo de notificación 
            o de otra dependiendo de la elección del usuario*/
            //<editor-fold defaultstate="collapsed" desc="Notificaciones DS">
            notificacionesDS notificacion=new notificacionesDS();
            notificacion.notificacionFalloTiempo("Error de conexión", "No se ha podido conectar a internet, por favor"
                    + " verifique su conexión a intenet",10000L);
            //</editor-fold>
        }else{//Si si hay conexión a internet
            
        }
    }
    //</editor-fold>
}
