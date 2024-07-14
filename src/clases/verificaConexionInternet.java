package clases;

//<editor-fold defaultstate="collapsed" desc="Librerias para conetarse a internet">
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
//</editor-fold>

/**
 * Esta clase se encarga de verificar si el usuario tiene conexión a internet o no
 * @author Emmanuelito18
 * @see <a href="">Web sockets</a>
 */
public class verificaConexionInternet {
    public static boolean verificarConexionGoogle(){
        try(Socket socket=new Socket()){
            int tiempoLimite=2000;//tiempo de espera en milisegundos
            SocketAddress socketGoogle=new InetSocketAddress("www.google.com",80);//crea socket con la direción de google con el puerto 80
            socket.connect(socketGoogle, tiempoLimite);//se conecta a un websocket con una dirección, puerto y tiempo limite especificados
            return true;
        }catch(IOException error){
            return false;
        }
    }
}
