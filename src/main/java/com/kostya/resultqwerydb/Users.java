package com.kostya.resultqwerydb;

/**
 * Created by kashi on 21.12.2015.
 */
public class Users {

    private int id; //Айди пользователя
    private String name; // Имя пользователя

    public Users(){}//Пустой конструктор

    //Конструктор с параметром имя
    public Users(String name) {
        this.name = name;
    }

    //Конструктор со всеми параметрами юзера
    public Users(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Здесь гетеры и сетеры для полей
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //переопределяем стринг для нормального вывода на экранчик
    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
