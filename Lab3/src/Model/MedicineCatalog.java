/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ShanSun
 */
public class MedicineCatalog {
    
    ArrayList<Medicine> medicinList;

    public MedicineCatalog() {
           this.medicinList = new ArrayList<>();
    }

    public ArrayList<Medicine> getMedicinList() {
        return medicinList;
    }

    public void setMedicinList(ArrayList<Medicine> medicinList) {
        this.medicinList = medicinList;
    }
    
    public Medicine createMedicine(String name, double dosage){
    Medicine medicine = new Medicine();
    
    medicine.setDosage(dosage);
    medicine.setMedicineName(name);
    
    this.medicinList.add(medicine);
    
    return medicine;
    
    }
    
    public Boolean checkIfMedicineUnique(String name){
        for(Medicine medicine : this.medicinList){
        
        if(medicine.getMedicineName().equals(name))
            return false;
        }
        return true;
    }
    
    public void removeMedicine(String name){
    
        for(Medicine medicine : this.medicinList){
                if(medicine.getMedicineName().equals(name)){
                         this.medicinList.remove(medicine);
                         break;
                }
        }
    
    }
    
    
}
