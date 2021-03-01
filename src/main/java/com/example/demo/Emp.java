package com.example.demo;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Emp")
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String dept;
    private String sso;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", sso='" + sso + '\'' +
                '}';
    }

    public Emp() {
    }

    public Emp(int id, String name, String dept, String sso) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sso = sso;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSso() {
        return sso;
    }

    public void setSso(String sso) {
        this.sso = sso;
    }
}
