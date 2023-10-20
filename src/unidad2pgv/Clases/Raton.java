package unidad2pgv.Clases;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Raton extends Thread {

    private String nombreRaton;
    private int tiempoAlimentacion;

    public Raton() {

    }

    public Raton(String nombreRaton) {

        this.nombreRaton = nombreRaton;
        tiempoAlimentacion = 0;
    }

    public Raton(String nombreRaton, int tiempo) {

        super();
        this.nombreRaton = nombreRaton;
        this.tiempoAlimentacion = tiempo;

    }

    /* public void elRatonCome() throws InterruptedException {

        try {

            System.out.printf("El raton %s ha comenzado a alimentarse\n", nombreRaton);
            Thread.sleep(tiempoAlimentacion * 1000);
            System.out.printf("El raton %s termino de comer\n", nombreRaton);

        } catch (Exception ex) {

        }

    }*/
    @Override
    public void run() {


        try {

            while (true) {
                
                System.out.println("El ratón" + nombreRaton + " ha comenzado a alimentarse");
                Thread.sleep(tiempoAlimentacion * 1000);
                System.out.println("El ratón " + nombreRaton + " ha terminado de alimentarse");
                
            }

        } catch (InterruptedException ex) {

            ex.printStackTrace();

        }

    }

    public String getNombreRaton() {
        return nombreRaton;
    }

    public void setNombreRaton(String nombreRaton) {
        this.nombreRaton = nombreRaton;
    }

    public int getTiempoAlimentacion() {
        return tiempoAlimentacion;
    }

    public void setTiempoAlimentacion(int tiempoAlimentacion) {
        this.tiempoAlimentacion = tiempoAlimentacion;
    }

}
