/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author haydnmaneval
 */
public class workout {

    private int id;
    private String workoutType;
    private int sets;
    private int weightw;
    private int volume;
    private int fatiguelevel;
    
    //constructors
    
    public workout(int id, String workoutType, int sets, int weightw, int volume, int fatiguelevel) {
        this.id = id;
        this.workoutType = workoutType;
        this.sets = sets;
        this.weightw = weightw;
        this.volume = volume;
        this.fatiguelevel = fatiguelevel;
    }

    public workout() {
    }

    public workout(String workoutType, int sets, int weightw, int volume, int fatiguelevel) {
        this.workoutType = workoutType;
        this.sets = sets;
        this.weightw = weightw;
        this.volume = volume;
        this.fatiguelevel = fatiguelevel;
    }
    
    //getters

    public int getId() {
        return id;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public int getSets() {
        return sets;
    }

    public int getWeightw() {
        return weightw;
    }

    public int getVolume() {
        return volume;
    }

    public int getFatiguelevel() {
        return fatiguelevel;
    }
    
    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setWeightw(int weightw) {
        this.weightw = weightw;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setFatiguelevel(int fatiguelevel) {
        this.fatiguelevel = fatiguelevel;
    }

    

    @Override
    public String toString() {
        return String.format(
                "Workout [id=%d, workoutType=%s, sets=%d, weightw=%d, volume=%d, fatiguelevel=%d]",
                id, workoutType, sets, weightw, volume, fatiguelevel
        );
    }

}
