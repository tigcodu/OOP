/* 
  Main program for the Person class
*/

public class PersonMain {

    public static void main(String[] args) {

        Person objP1 = new Person("Castrence", "Renato", "Culumeda");
        Person objP2 = new Person("Gonzales", "Speedy", "Sarmiento");
        Person objP3 = new Person("Mercado", "Michael Jodd", "Yap");

        System.out.println("Name: " + objP1.showFullName());

        objP1.strFirst = "Michael";

        System.out.println(objP1.showFullName());
   
        System.out.println("Name: " + objP2.showFullName());

        System.out.println("Person 3 name: " + objP3.strLast + ", " +
                                               objP3.strFirst + " " +
                                               objP3.strMiddle);

    }  // public static void main(String[] args)

}  // public class PersonMain