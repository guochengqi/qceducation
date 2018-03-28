package com.example.a39102.qceducation.db;

/**
 * Created by 39102 on 2018/3/27.
 */

public class Student {
    private int id;
    private int classId;
    private int courseId;
    private int stuPassword;
    private int stuCode;
    private String stuName;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public int getClassId(){
        return classId;
    }
    public void setClassId(int classId){
        this.classId= classId;
    }

    public int getCourseId(){
        return courseId;
    }
    public void setCourseId(int courseId){
        this.courseId= courseId;
    }

    public int getStuPassword(){
        return stuPassword;
    }
    public void setStuPassword(int stuPassword){
        this.stuPassword=stuPassword;
    }

    public int getStuCode(){
        return stuCode;
    }
    public void setStuCode(int stuCode){
        this.stuCode=stuCode;
    }

    public String getStuName(){ return stuName; }
    public void setStuName(String stuName){
        this.stuName=stuName;
    }
}
