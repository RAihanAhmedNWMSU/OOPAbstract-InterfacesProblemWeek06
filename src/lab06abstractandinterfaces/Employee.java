/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06abstractandinterfaces;

/**
 * This Interface represents an Employee and contains a single method which will be implemented by the class
 * which implements this interface
 * @author Raihan Ahmed Mohammed
 */
public interface Employee {
    /**
     * This method gets and returns  the weekly salary of an Employee
     * @return The Weekly Salary of an Employee
     */
    public abstract double getWeeklySalary();
}
