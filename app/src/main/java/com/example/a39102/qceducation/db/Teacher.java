package com.example.a39102.qceducation.db;

/**
 * Created by 39102 on 2018/3/27.
 */

public class Teacher {
    private int id;
    private String teaName;
    private int teaPassword;
    private int teaCode;
    private int classId;
    private int courseId;

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

    public int getTeaPassword(){
        return teaPassword;
    }
    public void setTeaPassword(int teaPassword){
        this.teaPassword=teaPassword;
    }

    public String getTeaName(){
        return teaName;
    }
    public void setTeaName(String teaName){
        this.teaName=teaName;
    }

    public int getTeaCode(){
        return teaCode;
    }
    public void setTeaCode(int teaCode){
        this.teaCode=teaCode;
    }

}
