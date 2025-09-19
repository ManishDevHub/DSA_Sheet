

import java.util.*;  

public class StudentArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> student = new ArrayList<>(); 

       
        student.add("Manish"); // size 10 
        student.add("Rahul");  // 10 + 10/2 size
        student.add("Priya");


        // System.out.println(student);
        StudentList();
    }

    

    static void  StudentList (){
           List<Integer> list = new ArrayList(); 

       
        list.add(1); // size 10 
        list.add(2);
        list.add(3);  // adding last
        list.add(2 , 30); // position me add karta he 


        // add new list in previous list 

        // list.addAll(listname);

        // System.out.println(list.get(1));
        // System.out.println(list.remove(1));
        //  System.out.println(list.remove(Integer.valueOf(30)));
      

        // System.out.println(list);
        // list.clear();
        //Update value =>

        // list.set(2, 200);
        //  check list particular num contain =>

        // System.out.println(list.contains(500));

        // iterate your list 
        // for (int i =0; i< list.size(); i++){
        //     System.out.println(list.get(i));
        // }

        // or using for each loop
        
        for( Integer i : list){
            System.out.println(i);
        }

    }

}
 