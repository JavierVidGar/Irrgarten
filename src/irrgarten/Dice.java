/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.Random;

/**
 * <b>Clase Dice</b>
 * <p>
 * Esta clase se encarga de la aleatoriedad de movimientos y acciones.
 * </p>
 *
 * @author javiervidgar
 * @version 1.0
 */
public class Dice {

    /**
     * Número máximo de usos que tiene un arma o escudo.
     */
    private static int MAX_USES = 5;

    /**
     * Inteligencia máxima de un jugador o monstruo.
     */
    private static float MAX_INTELLIGENCE = 10.0f;

    /**
     * Fuerza máxima de un jugador o monstruo.
     */
    private static float MAX_STRENGTH = 10.0f;

    /**
     * Probabilidad de resurrección (por turno) de un jugador o monstruo.
     */
    private static float RESURRECT_PROB = 0.3f;

    /**
     * Número máximo de armas recibidas al ganar un combate.
     */
    private static int WEAPONS_REWARD = 2;

    /**
     * Número máximo de escudos recibidos al ganar un combate.
     */
    private static int SHIELDS_REWARD = 3;

    /**
     * Número máximo de unidades de salud recibidas al ganar un combate.
     */
    private static int HEALTH_REWARD = 5;

    /**
     * Máxima potencia de las armas.
     */
    private static int MAX_ATTACK = 3;

    /**
     * Máxima protencia de los escudos.
     */
    private static int MAX_SHIELD = 2;

    /**
     * Generador de elementos aleatorios.
     */
    private static Random generator = new Random();

    /**
     * Genera un número de fila o columna aleatorio en el intervalo [0, max).
     *
     * @param max Valor máximo exclusive.
     * @return Número entero aleatorio entre 0 (inclusive), y max (exclusive).
     */
    public static int randomPos(int max) {
        return generator.nextInt(max);
    }

    /**
     * Obtiene el índice del jugador que empieza la partida.
     *
     * @param nPlayers Número de jugadores de la partida.
     * @return Número entero aleatorio entre 0 (inclusive) y nPlayers
     * (exclusive).
     */
    public static int whoStarts(int nPlayers) {
        return generator.nextInt(nPlayers);
    }

    /**
     * Obtiene un valor aleatorio de inteligencia del intervalo [0,
     * MAX_INTELLIGENCE).
     *
     * @return Número flotante aleatorio entre 0 (inclusive) y MAX_INTELLIGENCE
     * (exclusive).
     */
    public static float randomIntelligence() {
        return generator.nextFloat(MAX_INTELLIGENCE);
    }

    /**
     * Obtiene un valor aleatorio de fuerza del intervalo [0, MAX_STRENGTH).
     *
     * @return Número flotante aleatorio entre 0 (inclusive) y MAX_STRENGTH
     * (exclusive).
     */
    public static float randomStrength() {
        return generator.nextFloat(MAX_STRENGTH);
    }

    /**
     * Indica la cantidad de armas que recibirá el jugador por ganar el combate.
     *
     * @return Número entero aleatorio del intervalo cerrado [0,
     * WEAPONS_REWARD].
     */
    public static int weaponsReward() {
        return generator.nextInt(WEAPONS_REWARD + 1);
    }

    /**
     * Indica la cantidad de escudos que recibirá el jugador por ganar el
     * combate.
     *
     * @return Número entero aleatorio del intervalo cerrado [0,
     * SHIELDS_REWARD].
     */
    public static int shieldsReward() {
        return generator.nextInt(SHIELDS_REWARD + 1);
    }

    /**
     * Indica la cantidad de unidades de salud que recibirá el jugador por ganar
     * el combate.
     *
     * @return Número entero aleatorio del intervalo cerrado [0, HEALTH_REWARD].
     */
    public static int healthReward() {
        return generator.nextInt(HEALTH_REWARD + 1);
    }

    /**
     * Indica el poder que tiene un arma al "generarse".
     *
     * @return Número flotante aleatorio del intervalo [0, MAX_ATTACK).
     */
    public static float weaponPower() {
        return generator.nextFloat(MAX_ATTACK);
    }

    /**
     * Indica el poder que tiene un escudo al "generarse".
     *
     * @return Número flotante aleatorio del intervalo [0, MAX_SHIELD).
     */
    public static float shieldPower() {
        return generator.nextFloat(MAX_SHIELD);
    }

    /**
     * Indica el número de usos que se asignará a un arma o escudo.
     *
     * @return Número entero aleatorio del intervalo [0, MAX_USES].
     */
    public static int usesLeft() {
        return generator.nextInt(MAX_USES + 1);
    }

    /**
     * Devuelve la cantidad de competencia aplicada.
     *
     * @param competence Valor máximo exclusive de la competencia aplicada.
     * @return Número flotante aleatorio del intervalo [0, competence).
     */
    public static float intensity(float competence) {
        return generator.nextFloat(competence);
    }

    /**
     * Se sigue una probabilidad inversamente proporcional a lo cercano que esté
     * el parámetro del número máximo de usos de un arma o escudo.
     *
     * @param usesLeft Número de usos restantes de un arma o escudo.
     * @return true o false pseudo-aleatorio según usesLeft.
     */
    public static boolean discardElement(int usesLeft) {
        float prob = 1.0f - ((float) usesLeft / MAX_USES);

        return generator.nextFloat() < prob;
    }    

}
