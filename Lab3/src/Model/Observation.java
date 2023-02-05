/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shaoyifan
 */
public class Observation {
        int observationId;
        private double bloodPression;
        private double tempreature;
        private Medicine medicine;
        
        public Observation(){
            this.medicine = new Medicine();
        }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getObservationId() {
        return observationId;
    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public double getBloodPression() {
        return bloodPression;
    }

    public void setBloodPression(double bloodPression) {
        this.bloodPression = bloodPression;
    }

    public double getTempreature() {
        return tempreature;
    }

    public void setTempreature(double tempreature) {
        this.tempreature = tempreature;
    }
        
        @Override
        public String toString(){
        
        return String.valueOf(this.observationId);
        }
        
        
}
