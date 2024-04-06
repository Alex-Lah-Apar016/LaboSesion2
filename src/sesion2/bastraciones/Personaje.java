/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.bastraciones;

/**
 *
 * @author Estudiante
 */
public class Personaje extends Elemento
{
    private int vida;

    public Personaje(int vida,int nivel) 
    {
        Super(nivel);
        this.vida = vida;
    }
    public Personaje (){} 
    public int getVida() 
    {
        return vida;
    }   
    public void setVida(int vida) 
    {
        this.vida = vida;
    }
 
 
}
