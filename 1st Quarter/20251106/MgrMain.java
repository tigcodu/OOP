public class MgrMain {

    public static void main(String[] args) {

        Manager objM1 = new Manager("Ednalyn", "Garcia", 40000f);
        Manager objM2 = new Manager("Josephine", "Castro", "Bechavez", 65000f, 10000f, "Senior Manager");
        Manager objM3 = new Manager("Jimson", "Derecho", 55000f, 8000f, "Project Manager");

        System.out.println("Manager M1 - Name: " + 
                           objM1.showName(2) + 
                           " | Salary: " +
                           objM1.getSalary());

        System.out.println("Manager M2 - " + objM2.showName());
        System.out.println("Manager M3 - " + objM3.showName());

    }  // public static void main(String[] args)

}  // public class MgrMain