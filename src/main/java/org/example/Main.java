package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*
        //Comparable                                                comparator
        - comparable is a interface - java.lang                      comparator is a interface - java.util
        it is used to compare current object with anothr object         It is used for comparing two objects
        compareTo(Object obj);                                            compare(Object obj1, Object obj2)



         */
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student(7, "Ram");
        Student student2 = new Student(1, "JSa");
        Student student3 = new Student(3, "oy");
        Student student4 = new Student(4, "Joy");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        //System.out.println(students);

        for(Student s: students){
            System.out.println(s);
        }
        Collections.sort(students);

        student1.compareTo(student1);

        // Iterable is a parent for all the collections
        // It is used to read data from all the collections implemention classes.
        //We can read and remove the data using Iterator.
        //hasNext();
        //next();
        //remove();
        ArrayList<String> names = new ArrayList<>();
        names.add("Roy");
        names.add("JOy");
        names.add("Koy");
        names.add("Soy");




        Iterator<String> itr = names.iterator();
        System.out.println(itr.hasNext()); // it will check weather it has a next item or not
        System.out.println("**************");
        //System.out.println(itr.next()); // it will value of next item.
        System.out.println("**************");


        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}