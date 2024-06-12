// Array list using class

import java.util.ArrayList;


    
    class employee {
        int empId;
        String empName;
        Double salary;
        int age;
        String contact;

        employee(int empId, String empName, double salary, int age, String contact) {
            this.empId = empId;
            this.empName = empName;
            this.salary = salary;
            this.age = age;
            this.contact = contact;
        }
    }
    
    public class collection1 {
    public static void main(String[] args) {
        ArrayList<employee> list = new ArrayList<>();
        employee e = new employee(1, "Deepika", 25000, 20, "9342003253");
        employee e1 = new employee(2, "Keerthi", 30000, 22, "9092226965");
        list.add(e);
        list.add(e1);
        System.out.println(list);

        for(employee ed : list) {
            System.out.println(ed.empId);
            System.out.println(ed.empName);
            System.out.println(ed.salary);
            System.out.println(ed.contact);
        }
    }
    
    }
    