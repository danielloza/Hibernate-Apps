package config;

/**
 * Clase que almacenará la información importante de un usuario en particular.
 * Ésta clase utilizar el patrón Singleton
 *
 * @author DANIEL LOZA
 * 
 */
public class Session {

    private static Session instance;//Instancia singleton

    private Session() {
    }

    /**
     * Método que regresa una única instancia.
     *
     */
    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

}