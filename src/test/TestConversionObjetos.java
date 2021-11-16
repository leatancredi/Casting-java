package test;
//Cuando importamos clases, poner . * para que importe todas
import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        //declarando la variable
        Empleado empleado;
        //asignado referencia de la clase hijo a la padre
        empleado = new Escritor("juan", 5000,TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);

        //polimorfismo
//        System.out.println(empleado.obtenerDetalles());
        
//        para que este codigo funcione hay que hacer la conversion del objeto
//        empleado.getTipoEscritura;

        //downcasting estamos convirtiando de la clase padrea al tipo escitor de forma explicita
//        ((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        // Upcasting sin ser explicito
        Empleado empleado2 = escritor;
        System.out.println(empleado.obtenerDetalles());
    }
}
