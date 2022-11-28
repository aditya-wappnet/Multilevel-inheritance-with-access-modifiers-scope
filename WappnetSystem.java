public class WappnetSystem {
  // used default aceess modifier 
    void positionAtWappnet(){
        System.out.println("SoftwareTrainee AT Wappnet");
    }
    
    protected int numOfTrainee = 11; // only acessible by extended class.

    private int stipend = 8000; // can't accesible by other class due to private modifier

}


