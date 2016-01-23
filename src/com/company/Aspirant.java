package com.company;

/**
 * Created by uitschool JV on 1/23/2016.
 */

public class Aspirant extends Student
{
    private String workName;

    public Aspirant(String fullName, int age, String workName)
    {
        super(fullName,age);
        this.workName=workName;
    }
    public String getWorkName()
    {
        return workName;
    }

    public void setWorkName()
    {
        this.workName=workName;
    }
    public String toString()
    {
        return super.toString() + " " + workName;
    }
}
