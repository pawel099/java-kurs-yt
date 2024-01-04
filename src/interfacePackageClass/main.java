package interfacePackageClass;
public class main {

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

           animal.talk();
           System.out.println(animal.getNumberLegs());
           System.out.println(animal.getSize().getTranslation());
           System.out.println(animal.getSize().equals(SizeType.BIG));
           animal.sleep();
           animal.wakeUp();


           System.out.println(bird.getBirdCound());
           System.out.println(dog.dogCount());
           System.out.println(dog.getAllLegs());

       }
   }


