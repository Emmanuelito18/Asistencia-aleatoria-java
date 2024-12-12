package clases;

//<editor-fold defaultstate="collapsed" desc="Importación de otras clases del programa">
import Formularios.crearGrupo;
import Formularios.editarGrupo;
import Formularios.generarGrupo;
import Formularios.inicioSesion;
import Formularios.menu;
import Formularios.mostrarGrupo;
import Formularios.recuperarCuenta;
import Formularios.registrarCuenta;
import Formularios.splashScreen;
import ds.desktop.notify.DesktopNotify;//Esta clase se va a eliminar
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Librerías para archivos de propiedades">
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    //<editor-fold defaultstate="collapsed" desc="manejo de archivos de propiedades">
    /*
        este espacio se utilizará para menejar los temas del programa
        temas de notificaciones e idiomas del programa
    */
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Función principal de programa">
    /**
     * Esta es el método principal del programa donde se 
     * invocan y realizan todos los procesos relevantes para el programa
     * @param args 
     */
    public static void main(String[] args){
        verificaConexionInternet verificarInternet=new verificaConexionInternet();//se crea un objeto de la clase verificaConexionInternet
        if(!verificaConexionInternet.verificarConexionGoogle()){//Si no hay conexión a internet
            /*anadir código para que muestre la notificación un tipo de notificación 
            o de otra dependiendo de la elección del usuario*/
            //<editor-fold defaultstate="collapsed" desc="Notificaciones DS">
            notificacionesDS notificacion=new notificacionesDS();
            notificacion.notificacionFalloTiempo("Error de conexión", "No se ha podido conectar a internet, por favor"
                    + " verifique su conexión a intenet",10000L);
            //hacer que cada que se invoque una notificación se esuche un sonido
            //</editor-fold>
        }else{//Si si hay conexión a internet
            
        }
        
        splashScreen pantallaCarga=new splashScreen();
        pantallaCarga.setVisible(true);
        
        pantallaCarga.setCargaCompletaListener(()->{
            pantallaCarga.dispose();//solo cierra la interfaz gráfica de splashScreen pero el programa se sigue ejecutando
            //<editor-fold defaultstate="collapsed" desc="Inicialización de clases con referencias obtenidas del splashScreen">
            poneImagenes ponerImagenes=pantallaCarga.getPoneImagenes();
            notificacionesDS notificacionDS=pantallaCarga.getNotificacionesDS();
            notificacionesJava notificacionJava=pantallaCarga.getNotificacionesJava();
            inicioSesion iniciarSesion=pantallaCarga.getInicioSesion();
            menu menuPrincipal=pantallaCarga.getMenu();
            crearGrupo creaGrupo=pantallaCarga.getCrearGrupo();
            editarGrupo editaGrupo=pantallaCarga.getEditarGrupo();
            generarGrupo generaGrupo=pantallaCarga.getGenerarGrupo();
            mostrarGrupo muestraGrupo=pantallaCarga.getMostrarGrupo();
            recuperarCuenta recuperaCuenta=pantallaCarga.getRecuperarCuenta();
            registrarCuenta registraCuenta=pantallaCarga.getRegistrarCuenta();
            verificaConexionInternet verificaConexion=pantallaCarga.getVerificaConexionInternet();
            conectarBase conectaBaseDatos=pantallaCarga.getConectarBase();
            //</editor-fold>
            iniciarSesion.setVisible(true);
        });
        /*El splashScreen.java funciona correctamente, esta versión funcional se sacó de mi pc de escritorio
        Crear clases o métodos extra para la carga de archivos .properties para traducción del programa
        y cambio de tema y configuración del programa
        Refactorizar codigo duplicado de clases antiguas*/
        
    }
    //</editor-fold>
}
