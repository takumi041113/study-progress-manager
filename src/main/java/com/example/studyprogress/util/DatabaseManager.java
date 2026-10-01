package com.example.studyprogress.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

// MySQLへの接続
public class DatabaseManager {
    
    // 接続情報
    private static final Dotenv dotenv = Dotenv.load();

    private static final String URL = dotenv.get("DB_URL");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD");

    // MySQLに接続し、Connectionオブジェクトを返す共通メソッド
    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(
            URL,
            USER,
            PASSWORD
        );

    }

    // 接続確認用
    public static void main(String[] args) {

        try {
            Connection connection = getConnection();

            System.out.println("MySQLへの接続に成功しました");

            connection.close();

        } catch (SQLException e) {
            System.out.println("MySQLへの接続に失敗しました");
            e.printStackTrace();
        }

    }

}
