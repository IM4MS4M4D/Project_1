package com.config.CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.config.Connector;

public class updateDB {
    private static Connection connect;
    private static Statement statement;

    public static void updateDatabase() throws SQLException {
        connect = Connector.connection();
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("1. > Name of Item\n2. > Price of Item\n3. > Stock of Item");

            System.out.print("Option : ");
            int option = input.nextInt();
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            readDB.readDatabase();
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.print("Please pick a data that you want to change : ");
            int option2 = input.nextInt();
            String sql = "";
            statement = connect.createStatement();

            switch (option) {
                case 1:
                    System.out.print("New Name : ");
                    String newName = input.next();

                    sql = "UPDATE tb_product SET `NAME` = '" + newName + "' WHERE ID = " + option2;
                    statement.executeUpdate(sql);
                    break;
                case 2:
                    System.out.print("New Price : ");
                    int newPrice = input.nextInt();

                    sql = "UPDATE tb_product SET `PRICE` = '" + newPrice + "' WHERE ID = " + option2;
                    statement.executeUpdate(sql);
                    break;
                case 3:
                    System.out.print("New Stock : ");
                    int newStock = input.nextInt();

                    sql = "UPDATE tb_product SET `STOCK` = '" + newStock + "' WHERE ID = " + option2;
                    statement.executeUpdate(sql);
                    break;
                default:
                    System.out.println("Option is not available.");;
            }
            System.out.println("Data Updated Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
