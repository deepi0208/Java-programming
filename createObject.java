public class createObject {
    String color;
    void type() {
        System.out.println("TYPE CALLED");
    }
    public static void main(String[] args) {
        createObject tar = new createObject();
        tar.color="blue";
        createObject hundai = new createObject();
        hundai.color="black";
        System.out.println(tar.color);
        System.out.println(hundai.color);
        tar.type();
    }
}
