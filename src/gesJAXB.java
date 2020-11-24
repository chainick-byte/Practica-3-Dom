
import JavaLibros.Libros;
import JavaLibros.Libros.Libro;
import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igorr
 */
public class gesJAXB {
    AbreFile ab=new AbreFile();
    //lista
    Libros misLibros;
    
    public int abrirXML_JAXB(File file){
        try {
            JAXBContext contexto=JAXBContext.newInstance(Libros.class);
            Unmarshaller u= contexto.createUnmarshaller();
            
            misLibros=(Libros) u.unmarshal(file);
            
            
            
         return 1;    
        } catch (Exception e) {
        
         return -1;
        }
        
       
    }
    public String recorrerJAXB(){
        String cadena_resultado="";
        List<Libros.Libro> lLibros=misLibros.getLibro();
        for(int i = 0; i<lLibros.size();i++){
            Libro libroAuxiliar=lLibros.get(i);
            cadena_resultado=cadena_resultado+"Libro publicado en: "+libroAuxiliar.getPublicado()+"\n";
            cadena_resultado=cadena_resultado+"El tirulo es: " + libroAuxiliar.getTitulo()+"\n";
            cadena_resultado=cadena_resultado+"Escrito por: " + libroAuxiliar.getAutor()+"\n";
            cadena_resultado=cadena_resultado+"Editorial que publico: "+ libroAuxiliar.getEditorial()+ "\n\n";
            cadena_resultado=cadena_resultado+"******************************************************\n";
            cadena_resultado=cadena_resultado+"******************************************************\n";
            
        }
        return cadena_resultado;
    }
    
}
