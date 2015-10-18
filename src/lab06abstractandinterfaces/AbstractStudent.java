/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06abstractandinterfaces;

/**
 * This is an abstract class of Student which stores the name and annual tuition fee of the student
 * @author Raihan Ahmed Mohammed
 */
public abstract class AbstractStudent {
    private String nameOfStudent;
    private double annualTuition;
   /**
    * The constructor AbstractStudent initializes the attribute nameOfStudent and annualTution
    * @param nameOfStudent Stores the name of the student.
    * @param annualTuition Stores the annual tuition fee for a student
    */ 
    public AbstractStudent(String nameOfStudent, double annualTuition){
        this.annualTuition=annualTuition;
        this.nameOfStudent=nameOfStudent;
    }
    
    /**
     * The method getAnnualTuition returns annual tuition.
     * @return The annual tuition fee for the Student
     */
    public double getAnnualTuition(){
        return this.annualTuition;
    }
    /**
     * The method getTuition is an abstract method. which returns Tuition fee
     * @return Tuition fee
     */
        public abstract double getTuition();
        
       /**
        * The method toString returns a string that has the name of the student followed by the tuition he pays every year.
        * @return A string that has the name of the student followed by the tuition he pays every year.
        */ 
    @Override
        public String toString(){
            return String.format("%-20s %10.2f", this.nameOfStudent,getAnnualTuition());
             
        }
    
    
}
