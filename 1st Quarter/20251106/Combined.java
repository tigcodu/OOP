public class Combined {
    
    public static class Person {

        private String strLast;
        private String strFirst;
        private String strMiddle;
    
        /* Start - Constructors */
        Person() {
    
        }  // Person()
    
        Person(String tstrFirst, String tstrLast) {
            this.strLast = tstrLast;
            this.strFirst = tstrFirst;
        }  // Person(String tstrFirst, String tstrLast)
    
        Person(String tstrFirst, String tstrMiddle, String tstrLast) {
            this.strLast = tstrLast;
            this.strFirst = tstrFirst;
            this.strMiddle = tstrMiddle;
        }  // Person(String tstrFirst, String tstrMiddle, String tstrLast)
        /* End - Constructors */
    
        /* Start - getters or accessors */
        public String getLast() {
            return this.strLast;
        }  // public String getLast()
    
        public String getFirst() {
            return this.strFirst;
        }  // public String getFirst()
    
        public String getMiddle() {
            return this.strMiddle;
        }  // public String getMiddle()
        /* End - getters or accessors */
    
        /* Start - setters or mutators */
        public void setLast(String tstrLast) {
            this.strLast = tstrLast;
        }  // public void setLast(String tstrLast)
    
        public void setFirst(String tstrFirst) {
            this.strFirst = tstrFirst;
        }  // public void setFirst(String tstrFirst)
    
        public void setMiddle(String tstrMiddle) {
            this.strMiddle = tstrMiddle;
        }  // public void setMiddle(String tstrMiddle)
        /* End - setters or mutators */
    
        public String showFullName() {
            return this.strFirst + " " +
                   this.strMiddle + " " +
                   this.strLast;
        }  // public String showFullName()
    
        /* Method overload to demonstrate the use of polymorphism */
        public String showName() {
            return this.strFirst + " " +
                   this.strMiddle + " " +
                   this.strLast;
        }  // public String showName()
    
        public String showName(int tintMode) {
            String strRetVal;
            if (tintMode == 1) {
                strRetVal = this.strLast;
            } else if (tintMode == 2) {
                strRetVal = this.strLast + ", " +
                            this.strFirst;
            } else if (tintMode == 3) {
                strRetVal = this.strLast + ", " +
                            this.strFirst + " " +
                            this.strMiddle;
            } else {
                strRetVal = this.strFirst + " " +
                            this.strMiddle + " " +
                            this.strLast;
            }
         
            return strRetVal;
        }  // public String showName(int tintMode)
    
        public String showName(String tstrSeparator1, String tstrSeparator2) {
            return tstrSeparator1 + 
                   this.strLast + tstrSeparator2 + 
                   this.strFirst + tstrSeparator2 +
                   this.strMiddle + tstrSeparator2 +
                   tstrSeparator1;
        }  // public String showName(String tstrSeparator1, String tstrSeparator2)
    
    }  // public class Person

    public static class Employee extends Person {

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

    public static class Manager extends Employee {

        private float fltCommission;
    
        Manager() {
    
        }  // Manager()
    
        Manager(String tstrFirst, String tstrLast, float tfltSalary) {
            super(tstrFirst, tstrLast, tfltSalary);
        }  // Manager(String tstrFirst, String tstrLast, float tfltSalary)
        
        Manager(String tstrFirst, String tstrMiddle, String tstrLast, Float tfltSalary) {
            super(tstrFirst, tstrMiddle, tstrLast, tfltSalary);
        }  // Manager(String tstrFirst, String tstrMiddle, String tstrLast, Float tfltSalary)
    
        Manager(String tstrFirst, String tstrMiddle, String tstrLast, Float tfltSalary, Float tfltCommission) {
            super(tstrFirst, tstrMiddle, tstrLast, tfltSalary);
            this.fltCommission = tfltCommission;
        }  // Manager(String tstrFirst, String tstrMiddle, String tstrLast, Float tfltSalary, Float tfltCommission)
    
        public void setCommission(Float tfltCommission) {
            this.fltCommission = tfltCommission;
        }  // public void setCommission(Float tfltCommission)
    
        public Float getCommission() {
            return this.fltCommission;
        }  // public Float getCommission()
    
        /* Method Override to demonstrate the use of polymorphism */
        public String showName() {
            String strMI = super.getMiddle(); 
        
            return "Name: " + super.getFirst() + " " +
                              strMI.substring(0, 0) + ". " +
                              super.getLast() + " | Salary: " +
                              Float.toString(super.getSalary()) + " | Commission: " +
                              Float.toString(this.fltCommission); 
        }  // public String showName()
    
    
    }  // public class Manager extends Employee

    public static void main(String[] args) {

        Manager objM1 = new Manager("Ednalyn", "Garcia", 40000f);
        Manager objM2 = new Manager("Josephine", "Castro", "Bechavez", 65000f, 10000f);

        System.out.println("Manager M1 - Name: " + 
                            objM1.showName(2) + 
                            " | Salary: " +
                            objM1.getSalary());

        System.out.println("Manager M2 - " + objM2.showName());

    }  // public static void main(String[] args)

}
