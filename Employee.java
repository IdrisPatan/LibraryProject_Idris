/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 * Class employee subclass off person
 * @author Idris Patan
 */
public class Employee extends Person
{
    private int employeeId ;
    EmployeePayType employeePay ;
    private double employeePayAmt;
    Specialization employeeSpeciality ;
    private boolean clockedIn;
    private double hoursWorkedInMo;
    private double currentPayInMo;
    
    // empty consturctor 
    public Employee()
    {
        
    }
    
    //three-argument constructor 
    public Employee (int employeeID, EmployeePayType employeePay, 
            Specialization employeeSpeciality, double currentPayInMo)
    {
        this.employeeId = employeeID;
        this.employeePay = employeePay;
        this.employeeSpeciality = employeeSpeciality; 
        this.currentPayInMo = currentPayInMo;
    }
    /**
     * @return current pay in month 
     */
    public double getCurrentPayInMo()
    {
        return currentPayInMo;
    }

    /**
     * return employee id 
     * @return 
     */
    public int getEmployeeId() 
    {
        return employeeId;
    }

    /**
     * set employee id
     * @param employeeId 
     */
    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    /**
     * return pay type 
     * @return 
     */
    public EmployeePayType getEmployeePayType() 
    {
        return employeePay;
    }

    /**
     * set current pay in month 
     * @param currentPayInMonth 
     */
    public void setCurrentPayInMo(double payAmount) 
    {
        this.currentPayInMo = payAmount;
    }
    /**
     * set employeePay
     * @param salary 
     */
    public void setEmployeePayType(EmployeePayType salary) 
    {
        this.employeePay = salary;
    }

    /**
     * return employeeSpeciality
     * @return 
     */
    public Specialization getEmployeeSpeciality() 
    {
        return employeeSpeciality;
    }

    /**
     * 
     * @param employeeSpeciality 
     */
    public void setEmployeeSpeciality (Specialization employeeSpeciality) 
    {
        this.employeeSpeciality = employeeSpeciality;
    }
    
    /**
     *  new getter n setters
     * @return 
     */
    public double getEmployeePayAmt()
    {
        return employeePayAmt;
    }
    
    /**
     *  set employee pay amount 
     * @param employeePayAmt 
     */
    public void setEmployeePayAmt(double employeePayAmt)
    {
        this.employeePayAmt = employeePayAmt;
    }

    /**
     * return boolean to show if employee is clocked in or not 
     * @return 
     */
    public boolean isClockedIn() 
    {
        return clockedIn;
    }

    /**
     * set clock in
     * @param clockedIn 
     */ 
    public void setClockedIn(boolean clockedIn)
    {
        this.clockedIn = clockedIn;
    }

    /**
     * return hours work in month 
     * @return 
     */
    public double getHoursWorkedInMo()
    {
        return hoursWorkedInMo;
    }

    /**
     *  set hours work in month 
     * @param hoursWorkedInMo 
     */
    public void setHoursWorkedInMo(double hoursWorkedInMo) 
    {
        this.hoursWorkedInMo = hoursWorkedInMo;
    }
    
    /**
     *  
     * @return String of Employee Object
     */
    @Override
    public String toString() 
    {
        if (this.employeePay == EmployeePayType.HOURLY){
            return String.format("%s: %s\n%s: %d\n%s: %s\n%s: %.2f\n%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f\n", "Employee info", super.toString(),
                "Employee ID", getEmployeeId(),"Employee Pay type", getEmployeePayType(),
                "Employee pay Amount", getEmployeePayAmt(),"Employee Speciality", getEmployeeSpeciality(),
                "Clocked In", isClockedIn(), "Hours worked in a month",getHoursWorkedInMo(), "Current pay in month", getCurrentPayInMo());
        }
        else
        {
            return String.format("%s: %s\n%s: %d\n%s: %s\n%s: %.2f\n%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f\n", "Employee info", super.toString(),
                "Employee ID", getEmployeeId(),"Employee Pay type", getEmployeePayType(),
                "Employee pay Amount", getEmployeePayAmt(),"Employee Speciality", getEmployeeSpeciality(),
                "Clocked In", isClockedIn(), "Hours worked in a month",getHoursWorkedInMo(), "Current pay in month", getEmployeePayAmt());
        }
    }
}
