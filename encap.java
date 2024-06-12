class student {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return this.id;
      }
      public void setId(int value) {
        this.id = value;
      }
  
      public String getName() {
        return this.name;
      }
      public void setName(String value) {
        this.name = value;
      }
      public int getAge() {
        return this.age;
      }
      public void setAge(int value) {
        this.age = value;
      }
}
public class encap {
    public static void main(String[] args) {
           student s = new student();
           s.setId(1);
           s.setName("john");
           s.setAge(20);
           student s1 = new student();  
    }
    }
