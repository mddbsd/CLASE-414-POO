import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class EjercicioArchivos {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        boolean salida = false;
        String nombreArchivo ="";
        ArrayList<String> nombres = new ArrayList<String>();
        do{
            System.out.println("1: Leer archivo");
            System.out.println("2: Crear archivo");
            System.out.println("6: Salir");
            int op = s.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingrese el nobre de archivo");
                    nombreArchivo = s.nextLine();
                    break;
                case 2:
                    boolean salidaNombres = false;
                    do{
                        System.out.println("Ingrese nombre");
                        String nombreIngresado = s.next();
                        nombres.add(nombreIngresado);
                        System.out.println("Desea ingresar mas nombres?");
                        if (s.nextInt() == 1){
                            salidaNombres = true;
                        } 
                    }while (!salidaNombres);
                    System.out.println("Ingrese nombre de archivo");
                    nombreArchivo = s.next();
                    try{
                        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
                        for (String auxNombres : nombres){
                            bw.write(auxNombres + "\n");
                        }
                        bw.close();
                    }catch(FileNotFoundException fnfe){
                        System.out.println("No se encuentra el archivo");
                    }catch(IOException ioe){
                        System.out.println("no se puede escribir el archivo");
                    }
                    break;
                case 6:
                    salida = true;
                    break;
            }
        }while(!salida);
    }
}
