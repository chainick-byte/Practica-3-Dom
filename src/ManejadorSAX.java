
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igorr
 */
public class ManejadorSAX extends DefaultHandler {

    String miCadenaObtenida = "";

    public String getMiCadenaObtenida() {
        return miCadenaObtenida;
    }

    public void setMiCadenaObtenida(String miCadenaObtenida) {
        this.miCadenaObtenida = miCadenaObtenida;
    }

    @Override
    public void characters(char[] ch, int start, int length) {

        for (int i = start; i < length + start; i++) {
            miCadenaObtenida = miCadenaObtenida + ch[i];
        }
        miCadenaObtenida = miCadenaObtenida.trim() + "\n";

    }
    
    @Override
     public void endElement (String uri, String localName, String qName)
        throws SAXException
    {
        if(qName.equals("Libro")){
            miCadenaObtenida=miCadenaObtenida+"***********************\n";
        }
    }

    @Override
    public void startElement(String uri, String localName,
            String qName, Attributes attributes)
            throws SAXException {
        if(qName.equals("Libro")){
            miCadenaObtenida=miCadenaObtenida+"====>Libro: \n"+"Esta maravillosa obra de literatura se publico en:"+
                    attributes.getValue(attributes.getQName(0).trim());
        }else if(qName.equals("Titulo")){
            miCadenaObtenida=miCadenaObtenida+"El titulo es: ".trim();
        }else if(qName.equals("Autor")){
            miCadenaObtenida=miCadenaObtenida+"El autor es: ".trim();
        }
    }
}
