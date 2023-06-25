package com;

import java.sql.SQLException;
import java.util.Scanner;
import com.config.CRUD.createDB;
import com.config.CRUD.deleteDB;
import com.config.CRUD.readDB;
import com.config.CRUD.updateDB;

public class App {
    public static void startApp() throws SQLException {
        boolean Run = true;
        Scanner input = new Scanner(System.in);
        
        while (Run) {
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("                JAYA ABADI Ltd.                  ");
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("           WELCOME TO OUR DATABASE!              ");
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("1. > Create Data (Add content to the database)\n2. > Read Data (Read content of the database)\n3. > Update Data (Update content of the database)\n4. > Delete Data (Delete content of the database)\n5. > Exit the program");
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.print("Please select an option : ");

            switch (input.nextInt()) {
                case 1:
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    createDB.createDatabase();
                    break;
                case 2:
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("Data :");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    readDB.readDatabase();
                    break;
                case 3:
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("Select the data that you want to change :");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    updateDB.updateDatabase();
                    break;
                case 4:
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("Select the data that you want to delete :");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    
                    deleteDB.deleteDatabase();
                    break;
                
                case 5:
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("                  THANK YOU!                     ");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Options is not available");
                    Run = false;
                    break;

                    
            }
        }
        input.close();
    }
}