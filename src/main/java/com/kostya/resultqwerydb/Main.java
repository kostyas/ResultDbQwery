package com.kostya.resultqwerydb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by kashi on 21.12.2015.
 */
public class Main {
    public static void main(String... args){
        ConnectDB connectDB = new ConnectDB();

        String qwery = "SELECT id,name FROM user;"; //Это есть запрос

        try {
            Statement statement = connectDB.getConnection().createStatement(); //Создаем стейтмен
            ResultSet resultSet = statement.executeQuery(qwery); //передаем в кузалт_сер наш запрос через стейтмен

            //проходимся по записям
            while (resultSet.next()){
                Users user = new Users(); //делам юзера
                user.setId(resultSet.getInt("id")); //в ID юзера записываем ID з бд
                user.setName(resultSet.getString("name")); // Тоже самое только с Именем
                System.out.println(user.toString()); //Выводим все на экран
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
