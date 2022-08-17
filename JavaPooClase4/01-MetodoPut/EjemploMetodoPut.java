import java.util.HashMap;

public class EjemploMetodoPut {
    public static void main(String[] args) {

        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(924, "Armando Paredes");
        m.put(921, "Elba Gallo");
        m.put(700, "Susana Gimenez");
        m.put(219, "Victor Tilla");
        m.put(537, "Marcelo Tinelli");
        m.put(605, "Esteban Quito");

        System.out.println("Los elementos de m son: \n" + m);
    }
}
