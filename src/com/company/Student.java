package com.company;

/**
 * Created by uitschool JV on 1/23/2016.
 */
public class Student implements Cloneable{
    private String fullName;
    private int age;
    private int id =71;

    public int getId(){return id;}
    public void setId(int value){id = value;}

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName=fullName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge()
    {
        this.age=age;
    }
    public Student(String fullName, int age)
    {
        this.id=id;
        this.fullName=fullName;
        this.age=age;
    }
    public String toString()
    {
        return fullName + " " + age;
    }

    public Object clone(Object a) throws CloneNotSupportedException {
        return super.clone();
    }
}
