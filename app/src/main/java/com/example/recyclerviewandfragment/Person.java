package com.example.recyclerviewandfragment;

public class Person {
    String Name;
    String  tel;

    public Person(String Name,String tel) {
        this.Name=Name;
        this.tel=tel;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
