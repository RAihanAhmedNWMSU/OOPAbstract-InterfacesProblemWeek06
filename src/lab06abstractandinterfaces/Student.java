/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06abstractandinterfaces;

/**
 *This class extends AbstractStudent and implements the interfaces Employee and Employer
 * @author Raihan Ahmed Mohammed
 */
public class Student extends AbstractStudent implements Employee, Employer {
    private String nameOfInstittution;
    private int hoursWorked;
    private double hourlyRate;
    private int numberOfEmployees;
   private int years;
    
    /**
     * Parameterized Constructor for Student class. This constructor consists of a super method to get 
     * the values from the Constructor of the super class - Abstract Student
     * @param nameOfStudent Sores the name of the student
     * @param annualTuition Stores the annual tuition fee for the stident
     * @param years Stores the number of years
     * @param nameOfInstittution Stores the name of the Institution the student is in
     * @param hoursWorked Stores the hours worked in a day
     * @param hourlyRate Store the hourly rate
     * @param numberOfEmployees Stores the total number of employees
     */
    public Student(String nameOfStudent, double annualTuition, int years, String nameOfInstittution, int hoursWorked, double hourlyRate, int numberOfEmployees){
 super(nameOfStudent,annualTuition);
        this.nameOfInstittution=nameOfInstittution;
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
        this.numberOfEmployees=numberOfEmployees;
        this.years=years;
    }
    /**
     * This method is overridden
     * This method returns a String which contains the values from the super class toString() and the values from Student class.
     * @return A string which contains the values from the super class toString() and the values from Student class.
     * 
     */
    @Override
    public String toString(){ 
        return super.toString()+String.format(" %4d %-20s %4d %10.2f %4d", this.years, this.nameOfInstittution,this.hoursWorked,this.hourlyRate, this.numberOfEmployees);
    }
    
    /**
     * This method is overridden from the AbstractStudent class
     * This method calculates and returns returns the multiplication of the number of years a student needs to study for his/her degree by the annualTuition
     * @return returns the multiplication of the number of years a student needs to study for his/her degree by the annualTuition.
     */
    @Override
    public double getTuition(){
        return years*super.getAnnualTuition();
    }
    /**
     * This method is overridden from the Employee Interface
     * This method calculates and returns the multiplication of the hourlyRate by the number of hours the student worked per week.
     * @return The multiplication of the hourlyRate by the number of hours the student worked per week.
     */
    @Override
    public double getWeeklySalary(){
      return hourlyRate*(hoursWorked*7);
    }      

    /**
     * This method is overridden from the Employer Interface.
     * This method returns the value of number Of Employees
     * @return returns the value of the attribute numOfEmployees
     */
    @Override
   public int getNumOfEmployees(){
       return this.numberOfEmployees;
   }
   
   /**
    * This method is overridden from Employer Interface
    * This method sets the value of number Of Employees
    * @param number the number of Employees
    */
    @Override
   public void setNumOfEmployees(int number){
       this.numberOfEmployees=number;
   }
    
}
