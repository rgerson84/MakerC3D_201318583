package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String cad2;
    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String cad, String cad2){
        this.cad = cad;
        this.cad2 = cad2;
    }
    
    public String getCad2(){
        return cad2;
    }
    
    public String getCad(){
        return cad;
    }
        
}
