package com.hdxy.entity;


import java.util.Objects;

/**
 * @author wzh
 * @Description
 * @create 2020-10-19 22:47
 */
public class User {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", birth='" + birth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                sex == user.sex &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                Objects.equals(birth, user.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, sex, birth);
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public User(int id, String name, String password, char sex, String birth) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.birth = birth;
    }

    public User(int id, String name, String password, char sex) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
    }

    private String password;
    private char sex;
    private String birth;

    public User() {
    }
}
