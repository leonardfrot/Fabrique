public class main {

        public static void main(String [] args){
            FabriqueA fabrique = FabriqueA.getFabriqueAInstance();
            FabriqueA.Animal animal = FabriqueA.getFabriqueA("chien");
            animal.myName();
        }
}
