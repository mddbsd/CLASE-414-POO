import java.util.HashMap;
import java.util.Map;

public class EjemploExtraccion {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(924, "Armando Paredes");
        m.put(921, "Elba Gallo");
        m.put(700, "Susana Gimenez");
        m.put(219, "Victor Tilla");
        m.put(537, "Marcelo Tinelli");
        m.put(605, "Esteban Quito ");

        System.out.println("Todas las entradas del diccionario extraídas con entrySet:");
        System.out.println(m.entrySet());

        System.out.println("\nEntradas del diccionario extraídas una a una:");
        for (Map.Entry pareja: m.entrySet()) {
            System.out.println(pareja);
        }
    }
}
