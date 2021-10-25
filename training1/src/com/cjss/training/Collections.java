package com.cjss.training;

import com.cjss.training.model.EmployeeModel;
import com.cjss.training.model.ProductsModel;
import com.cjss.training.model.SkuModel;
import com.cjss.training.model.Student;
import java.util.*;

/**
 * ArrayList - To store collection of elements. Insertion order - same, duplicates allowed
 * HashSet - Insertion order - unordered
 * HashMap - hash table based implementation of Java
 * Generics - Restrict the type of object that can be stored in collection
 */
public class Collections {
    public static void main(String args[]) {

     Scanner inp = new Scanner(System.in);

     String rollno;

     String name;

     String branch;

     int year;

     Student st = new Student();

     System.out.println("Enter the Rollno");

     rollno = st.setRno(inp.next());

     System.out.println("Enter the Name");

     name = st.setName(inp.next());

     System.out.println("Enter the Branch");

     branch=st.setBranch(inp.next());

     System.out.println("Enter the year");

     year=st.setYear(inp.nextInt());

     System.out.println("The student roll   :" +rollno);

     System.out.println("The student Name   :" +name);

     System.out.println("The student Branch :" +branch);

     System.out.println("The student Year   :" +year);

/** close the task 1  Student related data **/



     List al1 = new ArrayList();
        al1.add("Rama");
        al1.add("test1");
        al1.add("test");
        al1.add("Rama");
        al1.add("10");
        al1.add("10.2");
        // al1.get(0);
        // al1.add(1, "newTest");
        // al1.set(2, "newTest");
        // remove()
        // set(0, "test")


//        System.out.println(al1);
//         for (Object o: al1) {
//            System.out.println(o);
//        }

        Set set1 = new HashSet();
        set1.add("Rama");
        set1.add("test1");
        set1.add("test");
        set1.add("Rama");
        set1.add("10");
        set1.add("10.2");

//        System.out.println(set1);

        Map map1 = new HashMap();
        map1.put("gmail", "g123");
        map1.put("mac", "m123");
        map1.put("hotmail", 123);

//        for (Object key: map1.keySet()) {
//            System.out.println("Key: " + key + " value: " + map1.get(key));
//        }


        List<Float> al2 = new ArrayList<>();
        al2.add(10f);
        al2.add(20f);

//         for (Float o: al2) {
//            System.out.println(o);
//        }



        Map<String,String> map2 = new HashMap<>();
        map2.put("gmail", "g123");
        map2.put("mac", "m123");
//        map2.put("hotmail", 123);


        // employeeNo,name,salary
        //

        List<EmployeeModel> employees = new ArrayList<>();
        EmployeeModel employee1 = new EmployeeModel("E101", "Name1", "10000");
        EmployeeModel employee2 = new EmployeeModel("E102", "Name2", "20000");
//        employee2.setEmployeeNo("E102");
//        employee2.setEmployeeName("Name2");
//        employee2.setSalary("20000");

        employees.add(employee1);
        employees.add(employee2);

        for (EmployeeModel employee: employees) {
            System.out.println(employee.getEmployeeNo() + " : " + employee.getEmployeeName());

        }

        // List of products (productId, productName)
                // skus - skuId, skuSize, price

        SkuModel sku1 = new SkuModel("sku1", "M", 200f);
        SkuModel sku2 = new SkuModel("sku2", "L", 210f);
        SkuModel sku3 = new SkuModel("sku3", "S", 190f);
        SkuModel sku4 = new SkuModel("sku4", "M", 300f);

        List<SkuModel> skus1 = new ArrayList<>();
        skus1.add(sku1);
        skus1.add(sku2);
        skus1.add(sku3);
        List<SkuModel> skus2 = new ArrayList<>();
        skus2.add(sku4);
        skus2.add(sku2);
        ProductsModel product1 = new ProductsModel("product1", "pName1", skus1);
        ProductsModel product2 = new ProductsModel("product2", "pName2", skus2);

        List<ProductsModel> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        // TODO: Print Product and SKU information

    }
}


/*

 Task
 ----
 Define below classes
 Student (rno, name, branch, year)
 StudentFee (rno, amount, date)
 Subjects(subjectNo, subjectName)
 StudentMarks(rno, year, subjectNo, marks)

 Task 1: Print student rno, name, branch of 1st year students
 Task 2: Print all students rno, name, branch, amount, date
 Task 3: Print all students rno, name, subjectName, marks
 Task 3: Print all students rno, name, subjectName, marks order by year

 Note: To take input use Scanner as per https://www.javatpoint.com/how-to-get-input-from-user-in-java

 */
