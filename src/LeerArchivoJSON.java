import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeerArchivoJSON {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            // Ruta del archivo JSON a leer
            String filePath = "archivo.json";
            
            // Crear un FileReader para leer el archivo JSON
            FileReader reader = new FileReader(filePath);

            // Parsear el archivo JSON usando el parser
            Object obj = parser.parse(reader);

            // Convertir el objeto parseado a un JSONObject
            JSONObject jsonObject = (JSONObject) obj;

            // Imprimir el contenido del JSONObject
            System.out.println("Contenido del archivo JSON:");
            System.out.println(jsonObject.toJSONString());

            // También puedes acceder a elementos específicos del JSON usando sus claves
            // Por ejemplo:
            // String nombre = (String) jsonObject.get("nombre");
            // int edad = (int) jsonObject.get("edad");
            // ...

            // Cerrar el FileReader
            reader.close();

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}