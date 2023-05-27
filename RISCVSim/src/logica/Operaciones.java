/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Salinas
 */
public class Operaciones {
    
    private static Operaciones opr;
    
    private Operaciones(){}
    
    public Operaciones getOperaciones(){
        if (opr == null){
            opr = new Operaciones();
        }
        return opr;
    }
    
    public int suma(int valA, int valB){
        return valA + valB;     
    }
    
    public int resta(int valA, int valB){
        return valA - valB;     
    }
        
    public int multi(int valA, int valB){
        return valA * valB;     
    }
    
    public int division(int valA, int valB){
        return valA / valB;     
    }
    
    public int and(int valA, int valB){
        return valA & valB;     
    }
    
    public int or(int valA, int valB){
        return valA | valB;     
    }
        
    public int xor(int valA, int valB){
        return valA ^ valB;     
    }
    
    public int comp(int A){
        return ~A;
    }
  
}
