public class Manager extends Employee {

    private float fltCommission;
    private String empPosition;

    Manager() {

    }  // Manager()

    Manager(String tstrFirst, String tstrLast, float tfltSalary) {
        super(tstrFirst, tstrLast, tfltSalary);
    }  // Manager(String tstrFirst, String tstrLast, float tfltSalary)
    
    Manager(String tstrFirst, String tstrMiddle, String tstrLast, Float tfltSalary) {
        super(tstrFirst, tstrMiddle, tstrLast, tfltSalary);
    }  // Manager(String tstrFirst, String tstrMiddle, String tstrLast, Float tfltSalary)

    Manager(String tstrFirst, String tstrLast, float tfltSalary, Float tfltCommission, String tPosition) {
        super(tstrFirst, tstrLast, tfltSalary);
        this.fltCommission = tfltCommission;
        this.empPosition = tPosition;
    }  // Manager(String tstrFirst, String tstrLast, float tfltSalary, Float tfltCommission, String tPosition)

    Manager(String tstrFirst, String tstrMiddle, String tstrLast, Float tfltSalary, Float tfltCommission, String tPosition) {
        super(tstrFirst, tstrMiddle, tstrLast, tfltSalary);
        this.fltCommission = tfltCommission;
        this.empPosition = tPosition;
    }  // Manager(String tstrFirst, String tstrMiddle, String tstrLast, Float tfltSalary, Float tfltCommission, String tPosition)

    public void setCommission(Float tfltCommission) {
        this.fltCommission = tfltCommission;
    }  // public void setCommission(Float tfltCommission)

    public Float getCommission() {
        return this.fltCommission;
    }  // public Float getCommission()

    public void setPosition(String tPosition) {
        this.position = tPosition;
    }  // public void setPosition(String tPosition)

    public String getPosition() {
        return this.position;
    }  // public String getPosition()

    /* Method Override to demonstrate the use of polymorphism */
    public String showName() {
        String strMI = super.getMiddle(); 
    
        return "Name: " + super.getFirst() + " " +
                          strMI.substring(0, 1) + ". " +
                          super.getLast() + " | Position: " +
                          this.empPosition + " | Salary: " +
                          Float.toString(super.getSalary()) + " | Commission: " +
                          Float.toString(this.fltCommission); 
    }  // public String showName()

}  // public class Manager extends Employee