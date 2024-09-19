public class ChocolateFactory {

    private static ChocolateFactory instance = null; // Creating the Singleton


    private boolean empty; //Initializing the variables
    private boolean boil;
    // Private constructor Singleton stuff
    private ChocolateFactory() {
        empty = true;  // Factory is empty must be stated because Java already declares
                       // boolean variables to be false unless stated to be true so it
                       // is applied that it is not boiled,but we have to declare its empty
    }

    // The key to the Singleton
    public static ChocolateFactory getInstance() {
        if (instance == null) {
            synchronized (ChocolateFactory.class) {
                if (instance == null) {
                    instance = new ChocolateFactory();
                }
            }
        }
        return instance;
    }

    //Fill Method
    public void fill() {
        if (empty) {         // Exception handling to make sure we do not overfill
            empty = false;
            boil = false;    //setting parameters for fill
            System.out.println("Filling the boiler ");
        } else {
            System.out.println("Already filled");
        }
    }

    // Boil method chocolate mixture
    public void boil() {
        if (!empty && !boil) {
            boil = true;
            empty = false;               //setting the variables for boil, we want to boil and have something to boil
            System.out.println("Boiling the Chocolate");
        } else if (empty) {
            System.out.println("Error: Nothing to boil");
        } else if (boil) {
            System.out.println("Error: Already boiled");
        }
    }

    // Drain method
    public void drain() {
        if (!empty && boil) {            //more exception handling, we want to empty the chocolate and since we
            empty = true;                // have nothing we have nothing to boil
            boil = false;
            System.out.println("Draining the boiled Chocolate");
        } else if (empty) {
            System.out.println("Error: Nothing in Boiler");
        } else if (!boil) {
            System.out.println("Error: Chocolate not Boiled");
        }
    }

    // Status Output: now that we have drained chocolate should display everything as done
    public void displayStatus() {
        if (empty){
            System.out.println("Boiler is empty");
        } else {
            System.out.println("Boiler is filled");
        }

        if (boil){
            System.out.println("Chocolate Boiled");
        }
        else {
            System.out.println("Chocolate Unboiled");
        }

        if (empty && !boil){
            System.out.println("Chocolate Factory DRAINED time to go home");
        }

        else{
            System.out.println("Factory not drained yet fix the issue");
        }
    }

}
