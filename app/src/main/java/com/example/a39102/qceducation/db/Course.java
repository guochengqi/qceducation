package com.example.a39102.qceducation.db;

/**
 * Created by 39102 on 2018/3/27.
 */

public class Course {
    private int id;
    private String courseName;
    private String courseInfo;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCourseInfo(){
        return courseInfo;
    }
    public void setCourseInfo(String courseInfo){
        this.courseInfo=courseInfo;
    }
}
