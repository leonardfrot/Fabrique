public class FabriqueA {
    private static FabriqueA instance = new FabriqueA();

    private FabriqueA(){};

    public static FabriqueA getFabriqueAInstance(){
        return instance;
    }

    FabriqueA getFabriqueA (String typeFabrique) {
        if (FabriqueA.equals("chat"))
            return new Chat();
        else if (FabriqueA.equals("chien"))
            return new Chien();
        else
            System.out.println("Impossible de créer un " + FabriqueA);
            return null;
    }
    public abstract class Animal{
        public abstract void myName();
    }
    public class Chat extends Animal{
        public void myName(){
            System.out.println("Je suis un Chat");
        }
    }
    public class Chien extends Animal{
        public void myName(){
            System.out.println("Je suis un Chien");
        }
    }

}
