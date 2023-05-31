package com.example.javafxproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        // Konfigurasi koneksi MySQL
        String url = "jdbc:mysql://localhost:3306/TakuCorp";
        String username = "root";
        String password = "****1234";

        // Membuat objek Connection
        Connection connection = null;
        try {
            // Membuat koneksi
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi berhasil!");

            // Melakukan operasi lain dengan koneksi database

            // ...

            // Menutup koneksi
            connection.close();
        } catch (SQLException e) {
            System.out.println("Koneksi gagal! Error: " + e.getMessage());
        }
    }
}
