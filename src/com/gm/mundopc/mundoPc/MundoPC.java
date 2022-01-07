package com.gm.mundopc.mundoPc;


import com.gm.mundopc.Clases.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHp = new Monitor("HP", 16);
        Teclado tecladoHp = new Teclado("blootooth", "Hp");
        Raton ratonHp = new Raton("blootooth", "HP");
        /*trabajamos nuevamente con la relacion de agregacion insertando
         * las clases dentro de new Computadora */
        Computadora computadoraHp = new Computadora("Computadora HP", monitorHp,
                ratonHp, tecladoHp);

        Monitor monitorGamer = new Monitor("Gamer", 20);
        Teclado tecladoGamer = new Teclado("blootooth", "Gamer");
        Raton ratonGamer = new Raton("blootooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora HP", monitorGamer,
                ratonHp, tecladoHp);

        Monitor monitorSongy = new Monitor("Songy", 20);
        Teclado tecladoSongy = new Teclado("blootooth", "Songy");
        Raton ratonSongy = new Raton("blootooth", "Songy");
        Computadora computadoraSongy = new Computadora("Computadora Songy", monitorSongy,
                ratonSongy, tecladoSongy);

        /*Creamos un objeto de tipo Orden */

        Orden orden1 = new Orden();
        /*utilizamos el metodo "agregarComputadora" creado en la clase Orden*/
        orden1.agregarCOmputadora(computadoraHp);
        orden1.agregarCOmputadora(computadoraGamer);

        orden1.mostrarOrden();


        Orden orden2 = new Orden();
        orden2.agregarCOmputadora(computadoraSongy);

        orden2.mostrarOrden();

    }
}
