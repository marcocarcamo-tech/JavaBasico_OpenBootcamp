package ejemploXML;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File("datos.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try{
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            try{
                //Analizamos el documento
                Document document = documentBuilder.parse(file);

                //Obtenemos usuario y clave
                String usuario = document.getElementsByTagName("usuario").item(0).getTextContent();
                String clave = document.getElementsByTagName("clave").item(0).getTextContent();

                //Mostramos usuario y clave
                System.out.println("Usuario: " + usuario + " Clave: " + clave);

                //Mostramos el atributo proveedor
                NamedNodeMap atributos =  document.getElementsByTagName("videos").item(0).getAttributes();

                for (int i = 0; i < atributos.getLength(); i++){
                    String atributosNombre = atributos.item(i).getNodeName();
                    String atributosValor =  atributos.item(i).getNodeValue();

                    System.out.println("Atributo "+ atributosNombre + " contiene " + atributosValor);
                }

                //Mostramos los videos asociados
                NodeList videos = document.getElementsByTagName("videos");

                for (int i = 0; i < videos.getLength();i++){
                    String video = videos.item(i).getTextContent();
                    System.out.println(video);
                }

            } catch (IOException e){

            } catch (IllegalArgumentException e){

            } catch (SAXException e) {

            }
        } catch (ParserConfigurationException e) {

        }
    }
}
