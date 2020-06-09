package com.example.lci2;

public class Product {

    private int id;
    private String course_name,course_level,completion_status;
    private int image;

    public Product(int id, String course_name, String course_level, String completion_status ,int image) {
        this.id = id;
        this.course_name= course_name;
        this.course_level = course_level;
        this.completion_status = completion_status;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getCourse_name(){ return course_name; }

    public String getCourse_level(){ return course_level; }

    public String getCompletion_status(){ return completion_status; }

    public int getImage() {
        return image;
    }
}
