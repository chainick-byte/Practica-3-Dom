
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igorr
 */
public class gesSax {

    AbreFile ab = new AbreFile();
    SAXParser parser;
    ManejadorSAX sh;
    File file = ab.getFile();
    File fichero_XML;

    public int abrirMiSAX(File file) {
        try {
            //el interpretador del documento
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            //se crea la instancia del manejador que va a recorrer XML
            sh = new ManejadorSAX();
            fichero_XML = file;

            return 0;
        } catch (Exception e) {
            System.out.println("No he interpretado sax!!!");
            return 1;
        }
    }

    public String recorrerSAX()  {
        try {
            sh.miCadenaObtenida = "\\\\\\\\\\\\\\\\ el mejor SAX del mundo mundial ///////////////\n"+
                    "*****************************************************"+sh.getMiCadenaObtenida();
            parser.parse(fichero_XML, sh);
            return sh.miCadenaObtenida;

        } catch (SAXException e) {
            return "Error al parsera SAX";
        }catch(IOException e){
            return "Error de tipo io";
        }
    }

}
