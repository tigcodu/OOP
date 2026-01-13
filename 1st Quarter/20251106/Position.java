public class Position extends Manager{

    private String position;
    
    Position() {

    }

    Position(String tstrFirst, String tstrLast, float tfltSalary, String tposition, float tfltCommission) {
        super(tstrFirst, tstrLast, tfltSalary, tfltCommission);
        this.position = tposition;
    }

    public void setPosition(String tposition) {
        this.position = tposition;
    }

    public String getPosition() {
        return this.position;
    }

    public String showName() {
        String strPos;

        strPos = "Name: " + super.getFirst() + " " +
                          super.getMiddle().substring(0, 1) + ". " +
                          super.getLast() + " | Salary: " +
                          Float.toString(super.getSalary()) + " | Commission: " +
                          Float.toString(super.getCommission()) + " | Position: " +
                          this.position;

        return strPos;

    }

    public static void main(String[] args) {
        Position objP1 = new Position();
        objP1.showName();
    }

}
