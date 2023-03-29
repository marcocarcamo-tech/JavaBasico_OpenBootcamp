package ejemploJSON;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        try {
            //Creamos el inputstream
            InputStream is = new FileInputStream("datos.json");

            //Creamos un tokenizador o tokener que leerá
            JSONTokener tokener = new JSONTokener(is);

            //Se lo pasamos a una instancia de la clase JSONObject
            JSONObject object = new JSONObject(tokener);

            //Sacamos las credenciales
            JSONObject credenicales = object.getJSONObject("credenciales");

            String usuario = credenicales.getString("usuario");
            String clave = credenicales.getString("clave");

            JSONArray videos = credenicales.getJSONArray("videos");

            System.out.println("Usuario: " + usuario + " Clave: " + clave);
            for (Object video: videos){
                System.out.println(video);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
