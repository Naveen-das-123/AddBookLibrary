package TheoryOoops;

import java.util.*;

public class libraryStore {
    // create Library 
    public static class bookLibrary {
        String arr[] = new String[50];
        String shelf[] = new String[50];
        int countbook = 0;
        int shelfbook = 0;
        
        // create function to add book name
        void addbook(String name) {
            // base case
            if (countbook == arr.length)
                return;

             arr[countbook] = name;
             countbook++;
        }
        
        // create function to issue book name
        void issuebook(String name) {
            for (int i = 0; i <= countbook; i++) {
                if (arr[i].equals(name)) {
                    shelf[shelfbook] = name;
                    shelfbook++;
                    // go to remove
                    removebook(name);
                }
            }

        }
        

        // create function to remove book name
        void removebook(String name) {
            for (int i = 0; i < countbook; i++){
                if (arr[i].equals(name)) {
                    arr[i] = "null";
                    countbook--;
                }
           }
        }

        // create function to return book name
        void returnbook(String name) {
            for (int k = 0; k < shelfbook; k++) {
                if (shelf[k].equals(name)) {
                    shelf[k] = "null";
                    shelfbook--;
                    // go to add book
                    addbook(name);
                }
            }
        }
        
        // create a function to show output of addbook
        void displaybook(int x) {
            for (int i = 0; i < x; i++) {
                if (arr[i] == null || arr[i] == "null") {
                    continue;
                }

                else {
                    System.out.println(arr[i]);
                }
               
            }
        }
        
        // create a function to show output of issued book
        void displayissued(int x) {
            for (int i = 0; i < x; i++) {
                if (shelf[i] == "null" || shelf[i] == null) {
                    continue;
                }

                else {
                    System.out.println(shelf[i]);
                }
                 
            }
        }

        
    }

    public static void main(String[] args) {
        bookLibrary obj = new bookLibrary();
        
        // obj.addbook("Hindi");
        // obj.addbook("English");
        // obj.addbook("Computer");
        // obj.addbook("Keyboard");
        // obj.addbook("Laptop");
        // obj.addbook("Mouse");
        // obj.addbook("Pencil");

        // issued book
        obj.issuebook("Math");
        obj.issuebook("Hindi");
        
        // display added book
        System.out.println("Total added book :");
        obj.displaybook(obj.arr.length);
        System.out.println();

        // display issued book
        System.out.println("Total issued book :");
        obj.displayissued(obj.shelf.length);

        // Return book
        System.out.println();
        obj.returnbook("Math");

        // display added book
        System.out.println("Total added book :");
        obj.displaybook(obj.arr.length);
        System.out.println();

        // display issued book
        System.out.println("Total issued book :");
        obj.displayissued(obj.shelf.length);


    }
}