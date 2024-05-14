interface language {
    void getName(String name);
    void show();
}

interface state extends language{
    void displayState(String name);
}

class child implements state {
    public void getName(String name) {
        System.out.println("language: "+name);
    }
    public void show(){
        System.out.println("Show method is called");
    }
    public void displayState(String name) {
        System.out.println("State: "+name);
    }
}

public class interface_example {
    public static void main(String[] args) {
        child obj = new child();
        obj.getName("Tamil");
        obj.show();
        obj.displayState("tamilnadu");
    }   
}
