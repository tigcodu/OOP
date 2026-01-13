public class EmployeeTwo extends Person {

    private float fltSalary;
    private String position;

    /* Start - constructors */
    EmployeeTwo() {

    }  // EmployeeTwo()

    EmployeeTwo(String tstrFirst, String tstrLast, float tfltSalary) {
        super(tstrFirst, tstrLast);  // call the parent's constructor
        this.fltSalary = tfltSalary;
    }  // EmployeeTwo(String tstrFirst, String tstrLast, float tfltSalary)

    EmployeeTwo(String tstrFirst, String tstrMiddle, String tstrLast, float tfltSalary) {
        super(tstrFirst, tstrMiddle, tstrLast);
        this.fltSalary = tfltSalary;
    }  // EmployeeTwo(String tstrFirst, String tstrMiddle, String tstrLast, float tfltSalary)

    EmployeeTwo(String tstrFirst, String tstrLast, float tfltSalary, String tPosition) {
        super(tstrFirst, tstrLast);  // call the parent's constructor
        this.fltSalary = tfltSalary;
        this.position = tPosition;
    }  // EmployeeTwo(String tstrFirst, String tstrLast, float tfltSalary, String tPosition)

    EmployeeTwo(String tstrFirst, String tstrMiddle, String tstrLast, float tfltSalary, String tPosition) {
        super(tstrFirst, tstrMiddle, tstrLast);
        this.fltSalary = tfltSalary;
        this.position = tPosition;
    }  // EmployeeTwo(String tstrFirst, String tstrMiddle, String tstrLast, float tfltSalary, String tPosition)
    /* End - constructors */
  
    /* Start - accessors and mutators */
    public float getSalary() {
        return this.fltSalary;
    }  // public float getSalary()

    public void setSalary(float tfltSalary) {
        this.fltSalary = tfltSalary;
    }  // public void setSalary(float tfltSalary)

    public String getPosition() {
        return this.position;
    }  // public String getPosition()

    public void setPosition(String tPosition) {
        this.position = tPosition;
    }  // public void setPosition(String tPosition)
    /* End - accessors and mutators */

    public String showEmpInfo() {

        String strMI = super.getMiddle();
        String fullName;

        // checks if middle is null or empty
        if (strMI == null || strMI.isEmpty()) {
            fullName = super.getFirst() + " " + super.getLast();
        } else {
            fullName = showFullName();
        }

        String strRetVal = "Name: " + fullName + 
                           " | Position: " + this.position +
                           " | Salary: " + Float.toString(this.fltSalary);
        
        return strRetVal;
    }  // public String showEmpInfo()

    public static void main(String args[]) {
        EmployeeTwo objE1 = new EmployeeTwo("Ednalyn", "Garcia", 40000f, "Developer");
        EmployeeTwo objE2 = new EmployeeTwo("Josephine", "Bechavez", "Castro", 65000f, "Manager");

        System.out.println(objE1.showEmpInfo());
        System.out.println(objE2.showEmpInfo());
    }

}  // public class EmployeeTwo extends Person