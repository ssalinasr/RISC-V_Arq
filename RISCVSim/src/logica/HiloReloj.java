/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author sebas
 */
public class HiloReloj extends Thread {

    private boolean finalizado;
    private double tiempoPausa;

    public HiloReloj(double t) {
        this.finalizado = false;
        if (t < 5 || t > 1000) {
            t = 500;
        } else {
            this.tiempoPausa = t;
        }
    }

    public void terminar() {
        this.finalizado = true;
    }

    public double getTiempoPausa() {
        return this.tiempoPausa;
    }

    @Override
    public void run() {
        while (!finalizado) {
            try {
                Thread.sleep((long) this.tiempoPausa);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//Relof
    }

}
