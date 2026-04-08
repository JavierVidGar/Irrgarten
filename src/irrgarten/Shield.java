/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 * <b>Clase Shield</b>
 * <p>
 * Esta clase representa los escudos usados por jugadores o monstruos.
 * </p>
 *
 * @author javiervidgar
 * @version 1.0
 */
public class Shield {

    /**
     * Poder de protección
     */
    private float protection;

    /**
     * Número de usos restantes del escudo
     */
    private int uses;

    /**
     * Constructor con parámetros
     *
     * @param protection valor asignado a protection
     * @param uses valor asignado a uses
     */
    public Shield(float protection, int uses) {
        this.protection = protection;
        this.uses = uses;
    }

    /**
     * Método de defensa, comprueba el número de usos restantes y devuelve el
     * poder de protección.
     *
     * @return Si la protección es eficaz devuelve protection, si no devuelve 0.
     */
    public float protect() {
        // Si no tenemos usos restantes, la protección falla.
        if (uses <= 0) {
            return 0;
        }

        // Reducimos el número de usos restantes.
        uses--;

        // La protección funciona.
        return protection;
    }

    /**
     * Método de interpretación en cadena de texto de la clase.
     *
     * @return un String con el formato "S[protection, uses]"
     */
    public String toString() {
        return "S[" + protection + ", " + uses + "]";
    }

}
