public class Employee extends Person {

    private float fltSalary;

    /* Start - constructors */
    Employee() {

    }  // Employee()

    Employee(String tstrFirst, String tstrLast, float tfltSalary) {
        super(tstrFirst, tstrLast);  // call the parent's constructor
        this.fltSalary = tfltSalary;
    }  // Employee(String tstrFirst, String tstrLast, float tfltSalary)

    Employee(String tstrFirst, String tstrMiddle, String tstrLast, float tfltSalary) {
        super(tstrFirst, tstrMiddle, tstrLast);
        this.fltSalary = tfltSalary;
    }  // Employee(String tstrFirst, String tstrMiddle, String tstrLast, float tfltSalary)
    /* End - constructors */
  
    /* Start - accessors and mutators */
    public float getSalary() {
        return this.fltSalary;
    }  // public float getSalary()

    public void setSalary(float tfltSalary) {
        this.fltSalary = tfltSalary;
    }  // public void setSalary(float tfltSalary)
    /* End - accessors and mutators */

    public String showEmpInfo() {
        String strRetVal;

        strRetVal = "Name: " + super.showFullName() + 
                    " | Salary: " + Float.toString(this.fltSalary);

        return strRetVal;
    }  // public String showEmpInfo()

}  // public class Employee extends Person