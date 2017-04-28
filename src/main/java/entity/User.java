package entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/28.
 */
public class User implements Serializable {

    private String name;
    private String password;
    private String sex;
    private int age;

    public User() {
    }

    public User(String name, String password, String sex, int age) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.age = age;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
