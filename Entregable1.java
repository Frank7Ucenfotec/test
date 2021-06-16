/* Primer entregable de proyecto de Fundamentos de programación.
Descripción: Programa que leerá los nombres de 3 países de los Juegos Olímpicos de Tokio 2020, en el cual se determinará
la cantidad de medallas ganadas por cada país y determinará el que obtuvo el mayor puntaje.

Estudiantes: Alejandro Cerdas 
             Alejandro Alvarado
             Frank Perez
*/

import java.io.*;

public class Entregable1 {// Inicio de programa
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        String pais1, pais2, pais3;
        int oro, plata, bronce, puntajeTotal1, puntajeTotal2, puntajeTotal3;

        out.println("------------------------------------------------------------------------------");
        out.println("\n                   JUEGOS OLIMPICOS DE TOKIO 2020                 \n");
        out.println("------------------------------------------------------------------------------");
        out.println("\n INTRODUZCA LOS NOMBRES Y MEDALLAS GANADAS DE LOS PAISES");
        out.println("\n Introduzca el primer pais:");
        pais1 = in.readLine();
        out.println("\n Cantidad de medallas de oro ganadas:");
        oro = Integer.parseInt(in.readLine());
        out.println("\n Cantidad de medallas de plata ganadas:");
        plata = Integer.parseInt(in.readLine());
        out.println("\n Cantidad de medallas bronce ganadas:");
        bronce = Integer.parseInt(in.readLine());

        puntajeTotal1 = oro + plata + bronce;

        out.println("\n Introduzca el segundo pais:");
        pais2 = in.readLine();
        out.println("\n Cantidad de medallas de oro ganadas:");
        oro = Integer.parseInt(in.readLine());
        out.println("\n Cantidad de medallas de plata ganadas:");
        plata = Integer.parseInt(in.readLine());
        out.println("\n Cantidad de medallas bronce ganadas:");
        bronce = Integer.parseInt(in.readLine());

        puntajeTotal2 = oro + plata + bronce;

        out.println("\n Introduzca el tercer pais:");
        pais3 = in.readLine();
        out.println("\n Cantidad de medallas de oro ganadas:");
        oro = Integer.parseInt(in.readLine());
        out.println("\n Cantidad de medallas de plata ganadas:");
        plata = Integer.parseInt(in.readLine());
        out.println("\n Cantidad de medallas bronce ganadas:");
        bronce = Integer.parseInt(in.readLine());

        puntajeTotal3 = oro + plata + bronce;

        out.print("\n ------------------------------------------------------------------------ \n");

        out.println("\n El puntaje total de " + pais1 + " es: " + puntajeTotal1);
        out.println("\n El puntaje total de " + pais2 + " es: " + puntajeTotal2);
        out.println("\n El puntaje total de " + pais3 + " es: " + puntajeTotal3);

        if (puntajeTotal1 > puntajeTotal2 && puntajeTotal1 > puntajeTotal3) {
            out.println("\nEl pais que obtuvo mayor puntaje es: " + pais1);

        } else if (puntajeTotal2 > puntajeTotal1 && puntajeTotal2 > puntajeTotal3) {
            out.println("\n El pais que obtuvo mayor puntaje es: " + pais2);

        } else {
            out.println("\n El pais que obtuvo mayor puntaje es: " + pais3);
        }

    }
}