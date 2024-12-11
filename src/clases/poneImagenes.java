package clases;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Esta clase se encarga del manejo de imagenes en un panel de nuestro programa utilizando la clase 
 * @author Emmanuelito18
 * @param ancho Número de tipo entero mayor o igual a 0, determina el ancho de la imagen
 * @param alto Número de tipo entero mayor o igual a 0, determina el lato de la imagen
 * @param ruta String que indica en donde se guarda la imagen a poner
 */
public class poneImagenes extends javax.swing.JLabel{
    // <editor-fold defaultstate="collapsed" desc="Atributos de la clase">
    private int ancho;//width del JPanel
    private int alto;//height del JPanel
    private String ruta;//path de la imagen a utilizar
    // </editor-fold>

    /**
     * El contructor se utiliza para establecer los datos a los atributos de la clase
     * @param jpanel
     * @param ruta 
     */
    public poneImagenes(JPanel jpanel,String ruta){//constructor de la clase
        this.ruta=ruta;//establece la ruta de la imagen a utilizar
        this.ancho=jpanel.getWidth();//obtiene el ancho del JPanel
        this.alto=jpanel.getHeight();//obtiene el alto de Jpanel
        this.setSize(ancho,alto);//establece el tamaño del objeto PoneImagenes 
    }
    
    public poneImagenes(){//Constructor generico vacio
        
    }
    
    /**
     * Se utiliza para dibujar la imagen en el componente gráfico
     * @param graphics 
     */
    public void paint(Graphics graphics){
        ImageIcon imagen=new ImageIcon(getClass().getResource(ruta));//crea un objeto ImageIcon con la ruta especificada
        graphics.drawImage(imagen.getImage(),0,0,ancho,alto,null);//dibuja la imagen en las coordenadas 0,0 con el alto y ancho especificados
    }
}
