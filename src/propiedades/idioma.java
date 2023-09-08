package propiedades;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author holas
 */
public class idioma extends Properties{
    private static final long serialVersionUID=1L;
    
    public idioma(String idioma){
        switch(idioma){
            case "Español":
                getProperties("espanol.properties");
                break;
            case "Inglés":
                getProperties("english.properties");
                break;
            case "Francés":
                getProperties("francais.properties");
                break;
            case "Italiano":
                getProperties("italiano.properties");
                break;
            default:
                getProperties("espanol.properties");
        }
    }
    
    private void getProperties(String idioma){
        try{
            this.load(getClass().getResourceAsStream(idioma));
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
