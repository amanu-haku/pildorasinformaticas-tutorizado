package soriano.juanjo.arrays;

import org.apache.commons.lang3.SerializationUtils;

public class Ejercicio_ArrayCloneExample {

    public static void main(String[] args) 
    {
        Employee[] empArray = new Employee[2];
         
        empArray[0] = new Employee(100, "Lokesh", "Gupta", new Department(1, "HR"));
        empArray[1] = new Employee(200, "Pankaj", "Kumar", new Department(2, "Finance"));
         
        Employee[] copiedArray = SerializationUtils.clone(empArray);    //Deep copied array
         
        empArray[0].setFirstName("Unknown");
        empArray[0].getDepartment().setName("Unknown");
         
        //Verify the change in original array - "CHANGED"
        System.out.println(empArray[0].getFirstName());                     //Unknown
        System.out.println(empArray[0].getDepartment().getName());          //Unknown
         
        //Verify the change in deep copied array - "UNCHANGED"
        System.out.println(copiedArray[0].getFirstName());                  //Lokesh
        System.out.println(copiedArray[0].getDepartment().getName());       //HR
    }
}


