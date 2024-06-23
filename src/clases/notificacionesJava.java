package clases;

//<editor-fold defaultstate="collapsed" desc="Librerias notificacion java">
import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
//</editor-fold>

/**
 * Esta clase se encarga de manejar las notificaciones de java
 * @author Emmanuelito18
 */
public class notificacionesJava {
    //<editor-fold defaultstate="collapsed" desc="Notificacion java">
    public static void mostrarNotificacion(String titulo, String mensaje, TrayIcon.MessageType tipo) {
        // Verifica si el sistema soporta la bandeja del sistema
        if (SystemTray.isSupported()) {
            // Obtiene la instancia de SystemTray
            SystemTray tray = SystemTray.getSystemTray();
            
            // Carga una imagen para el icono de la bandeja del sistema
            Image icono = Toolkit.getDefaultToolkit().getImage("src/imagenes/notificacion.png"); // Cambia la ruta al icono deseado

            // Crea un nuevo TrayIcon
            TrayIcon trayIcon = new TrayIcon(icono, "Notificación Windows 10");
            trayIcon.setImageAutoSize(true);
            
            try {
                // Añade el TrayIcon a la bandeja del sistema
                tray.add(trayIcon);
            } catch (AWTException e) {
                e.printStackTrace();
            }

            // Muestra la notificación con el título y el mensaje proporcionados
            trayIcon.displayMessage(titulo, mensaje, tipo);
        } else {
            // Si la bandeja del sistema no es compatible, imprime un mensaje de error
            System.err.println("El sistema de bandeja no es compatible.");
        }
    }
    //</editor-fold>
    
    public void notificacionError(String titulo,String mensaje){
        mostrarNotificacion(titulo, mensaje, TrayIcon.MessageType.ERROR);
    }
    
    public void notificacionFallo(String titulo,String mensaje){
        mostrarNotificacion(titulo, mensaje, TrayIcon.MessageType.ERROR);//icono de fallo
    }
    
    public void notificacionExito(String titulo,String mensaje){
        mostrarNotificacion(titulo, mensaje, TrayIcon.MessageType.INFO);//icono de exito
    }
    
    public void notificacionAdvertencia(String titulo,String mensaje){
        mostrarNotificacion(titulo, mensaje, TrayIcon.MessageType.WARNING);
    }
    
    public void notificacionInformacion(String titulo,String mensaje){
        mostrarNotificacion(titulo, mensaje, TrayIcon.MessageType.INFO);
    }
    
    public void notificacionAyuda(String titulo,String mensaje){
        mostrarNotificacion(titulo, mensaje, TrayIcon.MessageType.INFO);//icono de ayuda
    }
}
