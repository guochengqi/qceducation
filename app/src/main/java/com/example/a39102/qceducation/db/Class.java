package com.example.a39102.qceducation.db;

/**
 * Created by 39102 on 2018/3/27.
 */

public class Class {
    private int id;
    private String className;
    private String teaName;
    private int classPrice;
    private String classLocation;
    private String classTime;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getClassName(){
        return className;
    }
    public void setClassName(String className){
        this.className=className;
    }

    public String getClassLocation(){
        return classLocation;
    }
    public  void setClassLocation(String classLocation){
        this.classLocation=classLocation;
    }

    public int getClassPrice(){
        return classPrice;
    }
    public void setClassPrice(int classPrice){
        this.classPrice=classPrice;
    }

    public String getClassTime(){
        return classTime;
    }
    public void setClassTime(String classTime){
        this.classTime =classTime;
    }

    public String getTeaName(){
        return teaName;
    }
    public void setTeaName(String teaName){
        this.teaName=teaName;
    }

}
