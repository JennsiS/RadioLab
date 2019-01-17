/**
 * @author Jennifer Sandoval, Esteban del Valle, Andrea Paniagua
 * @Carne 18962,
 * @date 15/01/19
 * @name PrincipalRadio.java
 * */
package radiolab;

public class RadioImp implements Radio {

    /**
     *Permite encender y apagar el radio
     */
    @Override
    public void toggle() {
       
    }

    /**
     *
     * @return devuelve un valor true o false que indica el estado de la radio (Encendido/Apagado)
     */
    @Override
    public boolean getState() {
        
        return false;
    }

    /**
     * Permite cambiar la frecuencia de la radio
     */
    @Override
    public void changeFrequency() {
        
    }

    /**
     * Permite cambiar la estacion de la radio
     */
    @Override
    public void changeStation() {
        
    }

    /**
     *
     * @return devuelve un valor true o false que indica la frecuencia actual 
     */
    @Override
    public boolean getFrequency() {
       
        return false;
    }

    /**
     * Permite guardar una estacion en un boton
     */
    @Override
    public void saveStation() {
        
    }

    /**
     *
     * @param numButton  Cambia a la estacion guardada en un boton 
     */
    @Override
    public void changeStationButton(int numButton) {
        
    }

    /**
     *
     * @return devuelve la estacion actual de la radio
     */
    @Override
    public double getStation() {
       double station= 0;
       return station;
    }
    
    
}
