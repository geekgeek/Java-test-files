package javaapplication1;

/**
 *
 * @author geekgeek
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello Here is main method");
        //Create object of class2:
        javaclass2 obj2 = new javaclass2();
        System.out.println(obj2);
        System.out.println(obj2.x);
        System.out.println(obj2.z);
        System.out.println(obj2.sum);
        
    }
}

//CLASS 2 IN OTHER FILE:
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author geekgeek
 */
public class javaclass2 {
    int x = 5;
    int z = 3;
    int sum = x + z;
    static void main(){
    System.out.print("I am javaclass2");
    
    };
}
