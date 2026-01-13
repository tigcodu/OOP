public class Person {

    /* properties or attributes (but Java refers to them as fields */
    public String strLast;
    public String strFirst;
    public String strMiddle;

    /*
      An overloading constructor is a constructor that has the same name
    */

    Person() {

    }

    Person(String tstrFirst, String tstrMiddle, String tstrLast) {

        this.strLast = tstrLast;
        this.strFirst = tstrFirst;
        this.strMiddle = tstrMiddle;

    }  // Person(String tstrFirst, String tstrMiddle, String tstrLast)

    Person(String tstrFirst, String tstrLast) {

        this.strLast = tstrLast;
        this.strFirst = tstrFirst;

    }  // Person(String tstrFirst, String tstrLast)

    public String showFullName() {

        return this.strFirst + " " +
               this.strMiddle + " " +
               this.strLast;

    }  // public String showFullName()

    public String showName() {

        return this.strFirst + " " +
               this.strLast;

    }  // public String showName()

}  // public class Person