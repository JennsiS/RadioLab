/**
 * @author Jennifer Sandoval, Esteban del Valle, Andrea Paniagua
 * @Carne 18962,18221, 18733
 * @date 15/01/19
 * @name Radio.java
 *<p> Interfaz que contiene todos los metodos necesarios para el funcionamiento de una radio </p>
 * */

public interface Radio {
    
    /**
     * Permite encender y apagar el radio
     */
    public void toggle ();

    /**
     *
     * @return devuelve un valor true o false que indica el estado de la radio (Encendido/Apagado)
     */
    public boolean getState();

    /**
     * Permite cambiar la frecuencia de la radio
     */
    public void changeFrequency();

    /**
     * Permite cambiar la estacion de la radio 
     */
    public void changeStation();

    /**
     *
     * @return devuelve un valor true o false que indica la frecuencia actual 
     */
    public boolean getFrequency();

    /**
     * Permite guardar una estacion en un boton
     */
    public void saveStation(int numButton);

    /**
     *
     * @param numButton, Cambia a la estacion guardada en un boton 
     */
    public void changeStationButton (int numButton);

    /**
     *
     * @return  devuelve la estacion actual de la radio
     */
    public double getStation ();
    
}
