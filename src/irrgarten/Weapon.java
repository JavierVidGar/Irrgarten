/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 * <b>Clase Weapon</b>
 * <p>
 * Esta clase representa las armas usadas por jugadores o monstruos en combate.
 * </p>
 *
 * @author javiervidgar
 * @version 1.0
 */
public class Weapon {

    /**
     * Poder de ataque.
     */
    private float power;

    /**
     * Número de usos restantes del arma.
     */
    private int uses;

    /**
     * Constructor con parámetros.
     *
     * @param power valor asignado a power.
     * @param uses valor asignado a uses.
     */
    public Weapon(float power, int uses) {
        this.power = power;
        this.uses = uses;
    }

    /**
     * Método de ataque, comprueba el número de usos restantes y devuelve el
     * poder del ataque.
     *
     * @return Si el ataque es eficaz devuelve power, si no devuelve 0.
     */
    public float attack() {
        // Si no tenemos usos restantes, el ataque no funciona.
        if (uses <= 0) {
            return 0;
        }

        // Reducimos el número de usos restantes.
        uses--;

        // El ataque funciona.
        return power;
    }

    /**
     * Método de interpretación en cadena de texto de la clase.
     *
     * @return un String con el formato "W[power, uses]".
     */
    public String toString() {
        return "W[" + power + ", " + uses + "]";
    }

}
