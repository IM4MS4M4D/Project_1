package com.config.CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.config.Connector;

public class deleteDB {
    private static Connection connect;
    private static Statement statement;

    public static void deleteDatabase() throws SQLException {
        connect = Connector.connection();
        try {
            readDB.readDatabase();
            Scanner input = new Scanner(System.in);
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

            System.out.print("Option : ");
            int pilihan = input.nextInt();
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            statement = connect.createStatement();
            String sql = "DELETE FROM tb_product WHERE ID = " + pilihan;
            statement.executeUpdate(sql);
            System.out.println("Data deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
