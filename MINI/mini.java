import java.util.Scanner;
class products {
    String [] Appliance = {"Mobile", "Laptop", "TV"};
    String [] Mobile = {"Sumsung", "Redmi", "Realme", "Vivo", "iPhone"};
    String [] Laptop = {"Lenovo", "Apple", "hp", "Acer"};
    String [] TV = {"Sumsung", "Benq", "Sony", "Lg"};
    String [] SelectedProduct;

public void productList() {
    for(int i=0;i<Appliance.length;i++) {
        System.out.println(Appliance[i]);
    }
}
}
// class Mobile {
//     public String selectedMobile;
//     public void mobileData()
//     {
//      Products p = new Products();
//      for(int i=0;i<p.Mobile.length;i++){
//          System.out.println(p.Mobile[i]);
//      }
//     } 

// }

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
public class mini {
    public static void main(String[] args) {
        System.out.println("Spark Mart");
        System.out.println("-----------------------Welcome to our Spark Mart----------------------------");
        products p = new products();
        p.productList();
        Scanner src = new Scanner(System.in);
        System.out.println("Pick One: ");
        p.selectedProduct=src.nextLine();
    }
}