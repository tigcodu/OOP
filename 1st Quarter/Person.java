/*
  The Four Pillars of OOP
  =======================
  - Encapsulation
  - Inheritance
  - Abstraction
  - Polymorphism

  The process of creating an object base from its class is called instantiation (instantiate)

  Constructor is a special method that executes immediately when an object is instantiated

*/

public class Person {

    /* Properties or Attributes */
    public String strLast;
    public String strFirst;
    public String strMiddle;

    /* Methods */
    // constructor
    Person(String tstrLast, String tstrFirst, String tstrMiddle) {

        this.strFirst = tstrFirst;
        this.strMiddle = tstrMiddle;
        this.strLast = tstrLast;    

    }
    
    // method
    public String showFullName() {

        return this.strFirst + " " +
               this.strMiddle + " " +
               this.strLast;

    }  // public String showFullName()

}  // public class Person