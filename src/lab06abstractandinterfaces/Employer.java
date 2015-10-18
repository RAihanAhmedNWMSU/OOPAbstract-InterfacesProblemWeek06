/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06abstractandinterfaces;

/**
 * This interface represents an Employer which has number of employees and contains methods to get and set number of employees
 * @author Raihan Ahmed Mohammed
 */
public interface Employer {
    /**
     * This methods returns the number of Employees the Employer has
     * @return Number of Employees the Employer has
     */
    public abstract int getNumOfEmployees();
    /**
     * This method sets the value of Number of Employees
     * @param number Stores the the number of Employees
     */
    public abstract void setNumOfEmployees(int number);
}
