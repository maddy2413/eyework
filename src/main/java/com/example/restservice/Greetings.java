package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class Greetings {

    private final long id;
    private final String content;
    private final String [] arracontent;
    private final List <String> listcontent;


    public List<String> getListcontent() {
        return listcontent;
    }




    public Greetings(long id, String content) {
        this.id = id;
        this.content = content;
       this. arracontent = new String[0];
       this. listcontent=new ArrayList<>();
    }

    public Greetings(long id, String content, String[] arracontent) {
        this.id = id;
        this.content = content;
        this.arracontent = arracontent;
        this. listcontent=new ArrayList<>();

    }

    public Greetings(long id, String abc, List<String> values) {
        this.id = id;
        this.content = abc;
        this.arracontent = new String[0];
        this.listcontent=values;


    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String[] getArracontent() {
        return arracontent;
    }
}
