/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiolab;

/**
 *
 * @author bff_n_000
 */
public interface Radio {
    
    public void toggle ();
    public boolean getState();
    public void changeFrequency();
    public void changeStation();
    public boolean getFrequency();
    public void saveStation();
    public void changeStationButton (numButton int);
    public double getStation ();
    
}
