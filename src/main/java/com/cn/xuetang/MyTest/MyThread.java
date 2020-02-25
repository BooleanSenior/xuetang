package com.cn.xuetang.MyTest;

//public class MyThread implements Runnable{
public class MyThread extends  Thread{
    private static int ticket = 5;

    private String name;
    public MyThread(String name){
        this.name = name;

    }

    public MyThread(){
    }

    @Override
    public void run() {
            for (int i=0;i<=ticket;i++){
                //if(ticket > 0){
                    System.out.println(Thread.currentThread().getName()+"--------"+name+"卖票ticket："+ticket--);
               // }
            }
    }
}



