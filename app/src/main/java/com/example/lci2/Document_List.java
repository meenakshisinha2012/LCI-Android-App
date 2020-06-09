package com.example.lci2;

public class Document_List {
    private int id;
    private String doc_name,doc_size;
    private int image,download_img;

    public Document_List(int id, String doc_name,String doc_size,int image, int download_img) {
        this.id = id;
        this.doc_name= doc_name;
        this.doc_size = doc_size;
        this.image = image;
        this.download_img = download_img;
    }

    public int getId() {
        return id;
    }

    public String getDoc_name(){ return doc_name; }

    public String getDoc_size(){ return doc_size; }

    public int getImage() {
        return image;
    }

    public int getDownload_img(){ return download_img; }
}
