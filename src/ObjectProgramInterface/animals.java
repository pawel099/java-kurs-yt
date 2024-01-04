package ObjectProgramInterface;

public interface animals {

      public String dog();
      public String cat();
      public String bird();


      default String getDog() {
          return " ten piesek jest wspaniały";
      }

}



