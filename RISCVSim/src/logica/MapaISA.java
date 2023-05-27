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
public class MapaISA {
        private Map<String, Map<String,String>> codeOp;
    
    public MapaISA(){
        this.codeOp = new HashMap<>();
        this.construirMapa();
    }
    /**
     * Construcción de mapa de codigos de operación:

     */
    public void construirMapa(){
        HashMap<String, String> codeadd = new HashMap<>();
        codeadd.put("0110011", "000");
        codeOp.put("add",codeadd);
        
        HashMap<String, String> codesub = new HashMap<>();
        codesub.put("0110011", "001");
        codeOp.put("sub",codesub);
        
        HashMap<String, String> codemul = new HashMap<>();
        codemul.put("0110011", "010");
        codeOp.put("mul",codemul);
        
        HashMap<String, String> codediv = new HashMap<>();
        codediv.put("0110011", "011");
        codeOp.put("div",codediv);
        
        HashMap<String, String> codeand = new HashMap<>();
        codeand.put("0110011", "100");
        codeOp.put("and",codeand);
        
        HashMap<String, String> codeor = new HashMap<>();
        codeor.put("0110011", "101");
        codeOp.put("or",codeor);
        
        HashMap<String, String> codexor = new HashMap<>();
        codexor.put("0110011", "110");
        codeOp.put("xor",codexor);
        
        HashMap<String, String> codenot = new HashMap<>();
        codenot.put("0110011", "111");
        codeOp.put("comp",codenot);
              
        HashMap<String, String> codeaddi = new HashMap<>();
        codeaddi.put("0010011", "000");
        codeOp.put("addi",codeaddi);
        
        HashMap<String, String> codesubi = new HashMap<>();
        codesubi.put("0010011", "001");
        codeOp.put("subi",codesubi);
        
        HashMap<String, String> codemuli = new HashMap<>();
        codemuli.put("0010011", "010");
        codeOp.put("muli",codemuli);

        HashMap<String, String> codedivi = new HashMap<>();
        codedivi.put("0010011", "011");
        codeOp.put("divi",codedivi);
        
        HashMap<String, String> codeandi = new HashMap<>();
        codeandi.put("0010011", "100");
        codeOp.put("andi",codeandi);
        
        HashMap<String, String> codeori = new HashMap<>();
        codeori.put("0010011", "101");
        codeOp.put("ori",codeori);
        
        HashMap<String, String> codexori = new HashMap<>();
        codexori.put("0010011", "110");
        codeOp.put("xori",codexori);
    }
    
    public Map getMapa(){
        return this.codeOp;
    }
}
