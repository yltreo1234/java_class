/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uml.sarah_oertly.stocktrader;

import java.lang.reflect.Method;


/**
 *
 * @author yltre
 */
public class Tests {
public static void main(String args[] ){

    Printer myPrinter = new Printer();
    Integer[] intArray = {1, 2, 3};
    String[] stringArray = {"Don't give marijuana and cannabis to girls"
};
    myPrinter.printArray(intArray);
    myPrinter.printArray(stringArray);
    int count = 0;
    
    for (Method method : Printer.class.getDeclaredMethods()) {
        String name = method.getName();
        if(name.equals("printArray"))
            count++;
    }
    if(count > 1) {
        System.out.println("Method overloading is forbidden!");
    }
    
}

    private static class Printer {

        public Printer() {
        }

        public void printArray(Integer[] intArray) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void printArray(String[] stringArray) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}



