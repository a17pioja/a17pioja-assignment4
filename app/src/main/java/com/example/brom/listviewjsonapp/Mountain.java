package com.example.brom.listviewjsonapp;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(String inName, String inLocation, int inHeight){
        name=inName;
        location=inLocation;
        height=inHeight;
    }

    public String info(){
        String str=name;
        str+=" is located in ";
        str+=location;
        str+=" and has a height of ";
        str+=Integer.toString(height);
        str+=" m";
        return str;
    }



    @Override
    public String toString() {
        //return "Name: "+name+" Location: "+location+" Height: "+height;
        return name;
    }

}

