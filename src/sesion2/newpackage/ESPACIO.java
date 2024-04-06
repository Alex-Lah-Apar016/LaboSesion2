/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.newpackage;

/**
 *
 * @author Estudiante
 */
public class ESPACIO 
{

    private int tiempo;
    private int ambiente;
    
    public ESPACIO(){}
    
    public ESPACIO(int tiempo, int nivel, int ambiente) 
    {
        this.tiempo = tiempo;
        this.nivel = nivel;
        this.ambiente = ambiente;
    }
    
    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the nivel
     */
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
     * @return the ambiente
     */
    public int getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(int ambiente) {
        this.ambiente = ambiente;
    }    
}
