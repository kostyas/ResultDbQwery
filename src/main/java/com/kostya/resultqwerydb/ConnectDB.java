package com.kostya.resultqwerydb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by kashi on 21.12.2015.
 */
public class ConnectDB {

    private final String URL = "jdbc:mysql://localhost:3306/mydbtest"; //юрл
    private final String USERNAME = "root"; //Имя пльзователя БД
    private final String PASSWORD = "0123"; //Пароль от БД


    //Геттер для конекшена
    public Connection getConnection() {
        return connection;
    }

    //Определяем конекшен
    private Connection connection;

    //Конструктор с подключением к БД
    public ConnectDB() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); //Здеся конектимся
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
