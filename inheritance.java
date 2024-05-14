//SINGLE INHERITANCE
class Animal{  //parent class
    String breed;
    String name;
    String color;
    String sound;

void sound() {
    System.out.println("sound : "+sound);
}
}
class cat extends Animal {
    int lifespan;
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Breed : "+breed);
        System.out.println("Color : "+color);
        System.out.println("Lifespan : "+lifespan);
    }
}
class Dog extends Animal  //child class
    {
        int lifespan;
        void display()
            {
                System.out.println("Name : "+name);
                System.out.println("Breed : "+breed);
                System.out.println("Color : "+color);
                System.out.println("Lifespan : "+lifespan);
            }
    }
public class inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.name = "dobby";
        obj.color = "white";
        obj.breed = "lab";
        obj.sound = "barking";
        obj.lifespan = 10;

        obj.display();
        obj.sound();

//MUTIPLE INHERITANCE

        cat o = new cat();
        o.name = "susu";
        o.color = "white";
        o.breed = "something";
        o.sound = "meow";
        o.lifespan = 10;

        o.display();
        o.sound();
    }   
}