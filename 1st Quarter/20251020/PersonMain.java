public class PersonMain {

    public static void main(String[] args) {

        Person objP1 = new Person("Michael", "Culumeda", "Castrence");  // arguments
        
        Person objP2 = new Person("Santa", "Dela Cruz");

        Person objP3 = new Person();

        System.out.println("Person P1: " + objP1.showFullName());
        System.out.println("Person P2: " + objP2.showName());

        objP3.strFirst = "Marcel Jan";
        objP3.strMiddle = "Yap";
        objP3.strLast = "Mercado";
        System.out.println("Person P3: " + objP3.showFullName());        

    }  // public static void main(String[] args)

}  // public class PersonMain