/**
 * @author Jennifer Sandoval, Esteban del Valle, Andrea Paniagua
 * @Carne 18962,
 * @date 15/01/19
 * @name PrincipalRadio.java
 * */
package radiolab;

public class RadioImp implements Radio {
	
	private boolean state;
	private boolean frequency;
	private double station;
	private double[] botones;
	
	public RadioImp() {
		state = false;
		frequency = false;
		station = 0;
		botones = new double[12]
	}
	
	

    public void setState(boolean state) {
		this.state = state;
	}
    
    public boolean getState() {
        
        return state;
    }



	public void setFrequency(boolean frequency) {
		this.frequency = frequency;
	}

	   public boolean getFrequency() {
	       
	        return frequency;
	    }


	public void setStation(double station) {
		this.station = station;
	}
	
	  public double getStation() {
	       return station;
	  }


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
    		if (getStation() == 107.9) {
    			setStation(87.9);
    		}
    		else {
    			setStation(getStation()+0.2);
    		}
    	}
    	
    	if (getFrequency() == false) {
    		if (getStation() == 1610) {
    			setStation(530);
    		}
    		else {
    			setStation(getStation()+10);
    		}
    	}
    	
    }

    public void saveStation(int numButton) {
    	if ((numButton < 13) && (numButton >= 0)) {
    	botones[numButton] = getStation();
    	}
    	else {
    		System.out.println("error");
    	}
    }

    
    public void changeStationButton(int numButton) {
        
    	if ((numButton < 13) && (numButton >= 0)) {
    	setStation(botones[numButton]);
    	}
    	else {
    		System.out.println("error");
    	}
    }
    
    
}
