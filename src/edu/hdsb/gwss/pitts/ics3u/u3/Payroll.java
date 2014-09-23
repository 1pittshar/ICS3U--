/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.pitts.ics3u.u3;

/**
 *
 * @author 1pittshar
 */
class Payroll {

    public static void main(String[] args) {
        long hoursWorked;
        double payRate, taxRate;
        hoursWorked=40; payRate=10; taxRate=5.2; 
        System.out.println("Hours Worked: " +  hoursWorked);
        System.out.println("pay Amount  : " + (hoursWorked * payRate));
        System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate));
    }
}
