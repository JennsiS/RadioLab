/**
 * @author Jennifer Sandoval, Esteban del Valle, Andrea Paniagua
 * @Carne 18962,18221,18733
 * @date 15/01/19
 * @name PrincipalRadio.java
 * <p> esta clase implementa los metodos del radio original para ser utilizados</p>
 * */

public class RadioImp implements Radio {
    private boolean state;
    private boolean frequency;
    private double station;
    private double[] botones;
    private boolean up;
    
    public RadioImp() {
    up=true;
	state = false;
	frequency = false;
	station = 0;
	botones = new double[12];
	}
   public void setState(boolean state) {
		this.state = state;
	}
    
    

    /**
     *Permite encender y apagar el radio
     */
    @Override
    public void toggle() {
         if(getState() == true) {
    	   setState(false);
       }
       
       else {
    	   if(getState() == false){
    		   setState(true);
    	   }
       }
       
    }

    /**
     *
     * @return devuelve un valor true o false que indica el estado de la radio (Encendido/Apagado)
     */
    @Override
    public boolean getState() {
      return state;
    }

    /**
     * Permite cambiar la frecuencia de la radio
     */
    @Override
    public void changeFrequency() {
        if(getFrequency() == true) {
     	   setFrequency(false);
     	   setStation(530);
        }
        
        else {
     	   if(getFrequency() == false){
     		   setFrequency(true);
     		   setStation(87.9);
     	   }
        }
        
    }

    /**
     * Permite cambiar la estacion de la radio
     */
    @Override
    public void changeStation() {
        
    	if(getStation() == 0) {
    		if (getFrequency() == true) {
    			setStation(87.9);
    		}
    		if (getFrequency() == false) {
    			setStation(530);
    		}
    	}
    	
    	if (getFrequency() == true) {
    		if (up== true) {
    		if (getStation() == 107.9) {
    			setStation(87.9);
    		}
    		else {
    			setStation(getStation()+0.2);
    		}
    		
    		}
    		
    		if (up == false) {
        		if (getStation() == 87.9) {
        			setStation(107.9);
        		}
        		else {
        			setStation(getStation()-0.2);
        		}
        		
        		}
    		
    	}
    	
    	if (getFrequency() == false) {
    		if (up == true) {
    		if (getStation() == 1610) {
    			setStation(530);
    		}
    		else {
    			setStation(getStation()+10);
    		}
    		}
    		
    		if (up == false) {
        		if (getStation() == 530) {
        			setStation(1610);
        		}
        		else {
        			setStation(getStation()+-0);
        		}
        		}
    		
    	}
    	
    }
    
    /**
     * Permite guardar una estacion en un boton
     */

    public void saveStation(int numButton) {
    	if ((numButton < 13) && (numButton >= 0)) {
    	botones[numButton] = getStation();
    	}
    	else {
    		System.out.println("error");
    	}
    }

   /** @param numButton  Cambia a la estacion guardada en un boton 
    * 
    *  
    */
    public void changeStationButton(int numButton) {
        
    	if ((numButton < 13) && (numButton >= 0)) {
    	setStation(botones[numButton]);
    	}
    	else {
    		System.out.println("error");
    	}  
    }

    /**
     *
     * @return devuelve un valor true o false que indica la frecuencia actual 
     */
    @Override
    public boolean getFrequency() {
       
       return frequency;
    }
    
    public void setFrequency(boolean frequency) {
		this.frequency = frequency;
	}

   
   

    /**
     *
     * @return devuelve la estacion actual de la radio
     */
    @Override
    public double getStation() {
       return station;
    }
    public void setStation(double station) {
		this.station = station;
	}

   
    
}

