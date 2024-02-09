abstract class Remote {
    static int numberOfRemotes = 0;
    
    public Remote() {
        numberOfRemotes++;
    }
    
    abstract void pressButton();
    
    static void displayTotalRemotes() {
        System.out.println("Total number of remotes: " + numberOfRemotes);
    }
    
    void displayInfo() {
        System.out.println("This is a remote.");
    }
}

class TVRemote extends Remote {
    
    @Override
    void pressButton() {
        System.out.println("Pressing button on TV remote");
    }
}

class ACRemote extends Remote {
    
    @Override
    void pressButton() {
        System.out.println("Pressing button on AC remote");
    }
}

public class RemoteExample {

    public static void main(String[] args) {

        TVRemote tvRemote = new TVRemote();
        tvRemote.pressButton();
        tvRemote.displayInfo();
     
        Remote acRemote = new ACRemote(); 
        acRemote.pressButton();
        Remote tvRemote2 = new TVRemote(); 
        tvRemote2.pressButton();
   
        Remote.displayTotalRemotes();
    }
}
