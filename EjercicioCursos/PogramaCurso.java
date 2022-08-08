public class PogramaCurso {
    // Declaro como estaticos la constante y el array para poder
    // ser utilizadas con las funciones sin pasarlos como
    // parametro

    static final int MAXALU = 100;
    static final int MAXDOC = 20;
    static Alumno[] arrayAlumno = new Alumno[MAXALU];
    static Docente[] arrayDocente = new Docente[MAXDOC];
    public static void main(String[] args){
        int op;
        boolean salida = false;
        for (int i = 0; i < MAXALU; i++){
            arrayAlumno[i] = new Alumno();
        }
        do{
            System.out.println("1. Ingresar Alumno");
            System.out.println("2. Evaluar Alumno");
            op = Integer.parseInt(System.console().readLine());
            switch (op){
                case 1:
                    System.out.println("Ingrese nombre y apellido");
                    String apyn = System.console().readLine();
                    System.out.println("Ingrese DNI");
                    int dni = Integer.parseInt(System.console().readLine());
                    arrayAlumno[primeraPosicionLibre(op)] = new Alumno(apyn, dni);
                    break;
                
                case 2:
                    System.out.println("Ingrese legajo del alumno a evaluar");
                    String legajoAlumno = System.console().readLine();
                    arrayAlumno[posicionLegajo(legajoAlumno)].setNota();
                    break;
                
                case 3:
                    System.out.println("Ingrese nombre y apellido");
                    apyn = System.console().readLine();
                    System.out.println("Ingrese DNI");
                    dni = Integer.parseInt(System.console().readLine());
                    break;

                case 6:
                    salida = true;
                    break;
            }
            
        }while(!salida);
    }

    public static int primeraPosicionLibre(int op){
        if (op == 1){
            for (int i = 0; i < MAXALU; i ++){
                if (arrayAlumno[i].getLegajo().equals("libre")){
                    return i;
                }
            }
        } else {
            for (int i = 0; i < MAXDOC; i ++){
                if (arrayDocente[i].getLegajo().equals("libre")){
                    return i;
                }
            }
        }
        System.out.println("El array se encuentra lleno");
        return -1;
    }

    public static int posicionLegajo(String l){
        for (int i = 0; i < MAXALU; i ++){
            if (arrayAlumno[i].getLegajo().equals(l)){
                return i;
            }
        }
        System.out.println("No se encontro el legajo");
        return -1;
    }
}
