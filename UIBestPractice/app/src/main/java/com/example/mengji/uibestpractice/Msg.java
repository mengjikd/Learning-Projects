package com.example.mengji.uibestpractice;

/**
 * Created by mengji on 2017/12/17.
 */

public class Msg {
    public static final int TYPE_RECEVIED = 0;//收到的信息
    public static final int TYPE_SENT = 1;//发出的信息
    private String content;
    private int type;
    public Msg(String content,int type){
        this.content = content;
        this.type = type;
    }
    public String getContent(){
        return content;
    }
    public int getType(){
        return type;
    }
}
