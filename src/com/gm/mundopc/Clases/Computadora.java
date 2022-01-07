package com.gm.mundopc.Clases;

public class Computadora {

    private int idComputadora;
    private String nombre;
    //Aqui se implementa la "RElacion de Agregacion ", en donde se agregan oras clases como objetos dentro de una clase
    private Monitor monitor;
    private Raton raton;
    private Teclado teclado;
    //Este contador es para saber cuantas computadoras se han creado y tambien para iniciar la variable idComputadora
    private static int contadorComputadoras;

    public Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora( String nombre,
                       Monitor monitor, Raton raton, Teclado teclado) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static void setContadorComputadoras(int contadorComputadoras) {
        Computadora.contadorComputadoras = contadorComputadoras;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ", monitor=" + monitor +
                ", raton=" + raton +
                ", teclado=" + teclado +
                '}';
    }
}
