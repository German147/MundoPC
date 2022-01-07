package com.gm.mundopc.Clases;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 1;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    //metodo para agregar una computadora
    public void agregarCOmputadora(/*aqui recibe el argumento de computadora*/Computadora computadora){
        /*aqui nos fijamos que el contador de computadoras no haya superado el valor maximo*/
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            /*si NO es asi incrementamos de a una y la guardamos en la variable computadora*/
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("HAS superado el limite de " + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden(){
        System.out.println("Orden # : " + this.idOrden);
        System.out.println("Computaodras de la orden # : " + this.idOrden);
       /*en este for iteramos para ver cuantas computadoras hay cargadas*/
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
            
        }
    }
}
