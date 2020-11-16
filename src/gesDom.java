
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igorr
 */
public class gesDom {

    AbreFile ab = new AbreFile();

    static Document doc;

    public int abrirMiXml(File file) {
        doc = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            System.out.println(file.getName());
            doc = builder.parse(file);
            System.out.println(doc.getElementsByTagName("libro") + "<=========");
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }

    public String dameMiXml() {
        String salida = "";
        Node node;
        String datos_nodo[];

        //mi primer elemento del xml Libros
        Node raiz = doc.getFirstChild();
        //lista de nodos hijos es decir libro
        NodeList miListaDeNodos = raiz.getChildNodes();

        for (int i = 0; i < miListaDeNodos.getLength(); i++) {
            node = miListaDeNodos.item(i);
            System.out.println(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                datos_nodo = procesarLibro(node);

                salida = salida + "\n" + "Publicado en: " + datos_nodo[0];
                salida = salida + "\n" + "El tituo del libro es: " + datos_nodo[1];
                salida = salida + "\n" + "El autor del Libro es: " + datos_nodo[2] + "\n";
                salida = salida + "******************************************" + "\n";
                salida = salida + "******************************************" + "\n";

            }
        }
        return salida;
    }

    private String[] procesarLibro(Node node) {
        String datosDelLibro[] = new String[3];
        Node temporal = null;
        int contador = 1;

        datosDelLibro[0] = node.getAttributes().item(0).getNodeValue();
        NodeList ListaDeNodos = node.getChildNodes();

        for (int i = 0; i < ListaDeNodos.getLength(); i++) {
            temporal = ListaDeNodos.item(i);
            if (temporal.getNodeType() == Node.ELEMENT_NODE) {
                datosDelLibro[contador] = temporal.getFirstChild().getNodeValue();
                contador++;
            }
        }

        return datosDelLibro;
    }

    public int crearNuevoRegistro(String fecha, String titulo, String autor) {
        try {
            Node nodeTitulo = doc.createElement("Titulo");
            Node nodeTituloValor = doc.createTextNode(titulo);
            nodeTitulo.appendChild(nodeTituloValor);

            Node nodeAutor = doc.createElement("Autor");
            Node nodeAutorValor = doc.createTextNode(autor);
            nodeAutor.appendChild(nodeAutorValor);

            Node nodeLibro = doc.createElement("Libro");
            ((Element) nodeLibro).setAttribute("publicado", fecha);

            nodeLibro.appendChild(nodeTitulo);
            nodeLibro.appendChild(nodeAutor);

            Node raiz = doc.getFirstChild();
            raiz.appendChild(nodeLibro);
            return 1;

        } catch (Exception e) {
            return -1;
        }

    }

    public int guardarDomComoFile() {
        try {
            System.out.println(ab.getRutaAuxiliar());
            File miArchivoXml = new File(ab.getRutaAuxiliar());
            System.out.println("he creado mi archivoxml");
            OutputFormat format = new OutputFormat(doc);
            System.out.println("he creado format");
            format.setIndenting(true);
            System.out.println("he identend");
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(miArchivoXml), format);
            System.out.println("he serializado");
            serializer.serialize(doc);
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }

    public int modificarTitulo(String tituloAntiguo, String tituloNuevo) {
        try {
//tengo que acceder al nodo correspondiente 
//comparar con el input introducido 
//y si da positivo sustituirlo por el nuevo
            NodeList miListaDeTitulos=doc.getElementsByTagName("Titulo");
            for(int i = 0; i < miListaDeTitulos.getLength();i++){
                Node temporal=miListaDeTitulos.item(i);
                if(temporal.getFirstChild().getNodeValue().equals(tituloAntiguo)){
                    temporal.getFirstChild().setTextContent(tituloNuevo);
                }
            }
            
            
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }
public int modificarAutor(String autorAntiguo,String autorNuevo){
    try {
        NodeList miListaDeAutores=doc.getElementsByTagName("Autor");
            for(int i = 0; i < miListaDeAutores.getLength();i++){
                Node temporal=miListaDeAutores.item(i);
                if(temporal.getFirstChild().getNodeValue().equals(autorAntiguo)){
                    temporal.getFirstChild().setTextContent(autorNuevo);
                }
            }
        
        return 1;
    } catch (Exception e) {
        return-1;
    }
}
}
