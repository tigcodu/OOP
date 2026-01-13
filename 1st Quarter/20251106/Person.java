/* 
  Access Modifiers - visibility of an attribute or method

             Class  Package  Subclass  Global
  Public       /       /        /        /
  Protected    /       /        /        
  Default      /       /
  Private      /

  used in Encapsulation
*/

public class Person {

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