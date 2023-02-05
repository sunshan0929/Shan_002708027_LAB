/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author shaoyifan
 */
public class VitalSignHistory {
    ArrayList<Observation> vitalSignHistory;

    public VitalSignHistory() {
        this.vitalSignHistory = new ArrayList<>();
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    // find a observation using id
    
    public Observation findObservation(int Id){
            for(Observation o : this.vitalSignHistory){
                    if(o.getObservationId() == Id){
                            return o;
                    }
            }
            return null;
    }
    
    public Observation createObservation(int observationId, double bloodPressure, double tempreture){
            
          Observation observation = new Observation();
          
          observation.setBloodPression(bloodPressure);
          observation.setObservationId(observationId);
          observation.setTempreature(tempreture);
          
          
          // add observation to our arraylist
          this.vitalSignHistory.add(observation);
          
            return observation;
    }
    
    
    public boolean checkObservationIdUnique(int id){
           for(Observation o : this.vitalSignHistory){
               if(o.getObservationId() == id)
                   return false;
           }
           return true;
    }
    
    
    
}
