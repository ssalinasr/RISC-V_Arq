/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Salinas
 */
public class MapaRegistros {
    private Map<String, Registro> registros;
    
    public MapaRegistros(){
        this.registros = new HashMap<>();
        this.construirMapa();
    }
    /**
     * Construcción de mapa de registros:
     *  zero: registro con valor cero
     *  ra: dirección de retorno a la función actual
     *  sp: puntero a la cabeza de la pila
     *  gp: puntero a la sección global de la data
     *  tp: puntero a thread
     *  tX: registros temporales
     *  aX: registros para enviar argumentos
     *  sX: registros seguros
     */
    public void construirMapa(){
        registros.put("zero", new Registro());
        registros.put("ra", new Registro());
        registros.put("sp", new Registro());
        registros.put("gp", new Registro());
        registros.put("tp", new Registro());
        registros.put("t0", new Registro());
        registros.put("t1", new Registro());
        registros.put("t2", new Registro());
        registros.put("s0", new Registro());
        registros.put("s1", new Registro());
        registros.put("a0", new Registro());
        registros.put("a1", new Registro());
        registros.put("a2", new Registro());
        registros.put("a3", new Registro());
        registros.put("a4", new Registro());
        registros.put("a5", new Registro());
        registros.put("a6", new Registro());
        registros.put("a7", new Registro());
        registros.put("s2", new Registro());
        registros.put("s3", new Registro());
        registros.put("s4", new Registro());
        registros.put("s5", new Registro());
        registros.put("s6", new Registro());
        registros.put("s7", new Registro());
        registros.put("s8", new Registro());
        registros.put("s9", new Registro());
        registros.put("s10", new Registro());
        registros.put("s11", new Registro());
        registros.put("t3", new Registro());
        registros.put("t4", new Registro());
        registros.put("t5", new Registro());
        registros.put("t6", new Registro());
        
    }
    
    public Map getMapa(){
        return this.registros;
    }
}
