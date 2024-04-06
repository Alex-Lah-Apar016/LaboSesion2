/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.newpackage;

/**
 *
 * @author Estudiante
 */
public class BALA extends Elemento 

{
    private int tipo;
    
    public BALA (){}
    
    public BALA(int nivel, int tipo)
    {
        super(nivel);
        this.tipo = tipo;
    }
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */  
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

  
  
    
}
