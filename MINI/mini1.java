import java.util.Scanner;

class Products {

    public String appliance[]={"Mobile","TV","Laptop"};
    public String mobileProducts[]={"Redmi","Iphone","Oppo","Vivo","Samsung"};
    public String TVProducts[]={"Sony","Samsung","BENQ"};
    public String LaptopProducts[]={"Lenovo","HP","acer","OLG"};
    public String selectedProduct;

    public void productList(){
        for(int i=0;i<appliance.length ;i++){
            System.out.print(appliance[i]+"   ");
        }
    }
    
}

class Mobiles {
    public String selectedMobile;
    public void mobileData()
    {
     Products p = new Products();
     for(int i=0;i<p.mobileProducts.length;i++){
         System.out.println(p.mobileProducts[i]);
     }
    } 
}

class Tvs {
    public String selectedTv;
    public void TVData()
    {
     Products p = new Products();
     for(int i=0;i<p.TVProducts.length;i++){
         System.out.println(p.TVProducts[i]);
     }
    } 
}

class Laptops {
    public String selectedLaptop;
    public void laptopData()
    {
     Products p = new Products();
     for(int i=0;i<p.LaptopProducts.length;i++){
         System.out.println(p.LaptopProducts[i]);
     }
    } 
}

public class mini1 {

    public static void main(String[] args) {

        System.out.println("Welcome to Samrt Home");
        System.out.println(" ");
        Products p = new Products();
        p.productList();
        Scanner scr=new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Pick one : ");
        p.selectedProduct=scr.nextLine();
        System.out.println(" ");
        System.out.println(" ");
        if(p.selectedProduct.equals("Mobile")){
            Mobiles m =new Mobiles();
            m.mobileData();
            System.out.println("Pick one : ");
            m.selectedMobile=scr.nextLine();
            System.out.println(" ");
            System.out.println(" ");
        }
        else if(p.selectedProduct.equals("TV")){
            Tvs t =new Tvs();
            t.TVData();
        }
        else{
            Laptops m =new Laptops();
            m.laptopData();
        }
    }
}

