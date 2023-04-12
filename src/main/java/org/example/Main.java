package org.example;

public class Main {
    public static void main(String[] args) {
        // declaración y instancciación [tamaño]
        String dias [] = new String[7];

        // 0        1       2     3         4       5       6
        // Domingo Lunes Martes Miercoles Jueves Viernes Sabado

        // Almacenamos datos dentro de un Array
        dias[0] = "Domingo";
        dias[1] = "Lunes";
        dias[2] = "Martes";
        dias[3] = "Miercoles";
        dias[4] = "Jueves";
        dias[5] = "Viernes";
        dias[6] = "Sabado";

        //dias[7] = "asdfgh";

        //for (int i = 0; i < dias.length; i++) {
        //    System.out.println("El dia es: " + dias[i]);
        //}

        //ForEach (For extendido, recorre los elementos de un array o lista
        // y podemos realizar distintas acciones
        for (String dia: dias) {
            System.out.println(dia);
        }

        //System.out.println("Los días de la semana son: " + dias.length);
        //System.out.println("El día " + dias[0] + " voy a ir al cine.");

    }
}