//package value;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.HashSet;
//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.ArrayList;
//
///**
// * Read site and customer info from command argument filenames, and test bargain
// * finder on them.
// * 
// * @author Michael Albert
// */
//public class LengthApp {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) throws IOException {
//        
//        HashSet<String> items = new HashSet<>();
//        items.add("a");
//        items.add("b");
//        items.add("c");
//        items.add("aa");
//        items.add("bb");
//        items.add("cc");
//        items.add("abcdefg");
//        
//        LengthSite site = new LengthSite(items);
//        
//        HashMap<String, Integer> customerData = new HashMap<>();
//        System.out.println("Values");
//        for(String s : items) {
//        	int v = (int) (1 + Math.random()*10);
//        	System.out.println(s + " " + v);
//        	customerData.put(s, v);
//        }
//        CustomerInfo customer = new Customer(customerData);
//        System.out.println("------------------");
//        for(int i = 0; i < 4; i++) {
//        	int b = (int) (1 + Math.random()*30);
//        	System.out.println("Budget: " + b);
//        	
//        
//        BargainFinder bf = new BargainFinder(site, customer, b);
//        for(String s: bf.shoppingList()) System.out.println(s);
//        System.out.println("--------------------");
//        }
//        
//    }
//    
//}

package etude11;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Read site and customer info from command argument filenames, and test bargain
 * finder on them.
 * 
 * @author Michael Albert
 */
public class LengthApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        HashSet<String> items = new HashSet<>();
        items.add("a");
        items.add("b");
        items.add("c");
        items.add("aa");
        items.add("bb");
        items.add("cc");
        items.add("abcdefg");
        items.add("a1");
        items.add("b2");
        items.add("c3");
        items.add("aa4");
        items.add("bb5");
        items.add("cc6");
        items.add("abcdefg7");
        items.add("a2");
        items.add("b3");
        items.add("c4");
        items.add("aa5");
        items.add("bb6");
        items.add("cc7");
        items.add("abcdefg8");
        items.add("a9");
        items.add("b8");
        items.add("c7");
        items.add("aa6");
        items.add("bb4");
        items.add("cc3");
        items.add("abcdefg1");
        
        LengthSite site = new LengthSite(items);
        
        HashMap<String, Integer> customerData = new HashMap<>();
        System.out.println("Values");
        for(String s : items) {
        	int v = (int) (1 + Math.random()*10);
        	System.out.println(s + " " + v);
        	customerData.put(s, v);
        }
        CustomerInfo customer = new Customer(customerData);
        System.out.println("------------------");
        for(int i = 0; i < 4; i++) {
        	int b = (int) (1 + Math.random()*30);
        	System.out.println("Budget: " + b);
        	
        System.out.println("**** 1 ****");
        BargainFinder bf = new BargainFinder(site, customer, b);
        for(String s: bf.shoppingList()) System.out.println(s);
        System.out.println("**** 2 ****");

        }
        
    }
}