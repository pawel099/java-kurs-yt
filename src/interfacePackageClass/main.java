package interfacePackageClass;

public class main extends cat {

   public static void main(String[] args) {

      Animal cat = new cat();
      Animal krowa = new krowa();
      Animal bird = new bird();
      Animal dog = new dog();


      Animal[] animals = {cat, bird, dog,krowa };


      for (Animal animal : animals) {
        showAnimalInfo(animal);
         System.out.println("--------------------------------------------------------------------------");
      }



   }

   private static void showAnimalInfo (Animal animal) {

   System.out.println(animal.getType());
   animal.talk();
   System.out.println(animal.getNumberLegs());
   animal.sleep();
   animal.wakeUp();

   }

}
