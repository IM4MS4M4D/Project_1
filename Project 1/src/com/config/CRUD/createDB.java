package com.config.CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.config.Connector;

public class createDB {
    private static Connection connect;
    private static Statement statement;

    public static void createDatabase() throws SQLException {
        connect = Connector.connection();
        Scanner input = new Scanner(System.in);

        System.out.print("NAME   : ");
        String namaBaru = input.nextLine();
        System.out.print("PRICE  : ");
        int hargaBaru = input.nextInt();
        System.out.print("STOCK  : ");
        int jumlahBaru = input.nextInt();

        try {
            statement = connect.createStatement();
            statement.executeUpdate("INSERT INTO `tb_product` (`ID`, `NAME`, `PRICE`, `STOCK`) VALUES (NULL, '"+namaBaru+"', '"+hargaBaru+"', '"+jumlahBaru+"')");
            statement.close();
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("New product has been added!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
