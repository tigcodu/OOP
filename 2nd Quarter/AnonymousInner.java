public class AnonymousInner {

    public static void main(String[] args) {

        Dog objBantay = new Dog() {
            @Override
            public void makeNoise() {
                System.out.println("eek eek..");
            } 
        };

        objBantay.makeNoise();

    }

}
