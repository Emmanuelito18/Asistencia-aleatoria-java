package clases;

import ds.desktop.notify.DesktopNotify;

/**
 * Esta clase se encarga de manejar las notificaciones de la libreria DS Desktop Notify
 * @author Emmanuelito18
 * @author Dragshot
 * @see <a href="https://dragshot.webcindario.com/software/desktopnotify/javadoc/overview-summary.html">Documentacion de DS Desktop Notify</a>
 */
public class notificacionesDS {
    public void notificacionError(String titulo,String mensaje){
        DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.ERROR);
    }
    
    public void notificacionErrorTiempo(String titulo,String mensaje,long tiempo){
        DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.ERROR, tiempo);
    }
    
    public void notificacionFallo(String titulo,String mensaje){
        DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.FAIL);
    }
    
    public void notificacionFalloTiempo(String titulo,String mensaje,long tiempo){
        DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.FAIL, tiempo);
    }
    
    public void notificacionExito(String titulo,String mensaje){
        DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.SUCCESS);
    }
    
    public void notificacionAdvertencia(String titulo,String mensaje){
        DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.WARNING);
    }
    
    public void notificacionInformacion(String titulo,String mensaje){
        DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.INFORMATION);
    }
    
    public void notificacionAyuda(String titulo,String mensaje){
        DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.HELP);
    } 
}
