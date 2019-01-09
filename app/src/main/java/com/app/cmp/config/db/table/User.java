package com.app.cmp.config.db.table;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class User {
    @Id(autoincrement = true)
    private long id;
    private String name;




    @Generated(hash = 1144922831)
    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }




    @Generated(hash = 586692638)
    public User() {
    }




    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }




    public long getId() {
        return this.id;
    }




    public void setId(long id) {
        this.id = id;
    }




    public String getName() {
        return this.name;
    }




    public void setName(String name) {
        this.name = name;
    }




}
