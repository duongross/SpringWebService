package com.sample.demo;

public class Greeting {
    private int id;
    private String content;

    public Greeting(int id, String content){
        this.id=id;
        this.content=content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
