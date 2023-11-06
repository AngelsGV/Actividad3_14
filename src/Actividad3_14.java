//Tablas de múltiplicar del 1 al 10 de los números pares
//No es necesario importar ninguna librería.
public class Actividad3_14 {
    public static void main(String[] args){
        for (int tabla = 2;tabla <= 10; tabla+=2 ){
            // Iterar a través de los números pares del 2 al 10.
            // Para mostrar las tablas de números pares.
            //Iniciamos por la tabla del 2 y vamos sumando 2. Hasta la tabla del 10.
            System.out.println("\n\nTabla del " + tabla);// \n son saltos de línea
            for ( int i=1; i <=10; i++){
                System.out.println(tabla + " x " + i + " = " + tabla*i);
            }
        }
    }
}