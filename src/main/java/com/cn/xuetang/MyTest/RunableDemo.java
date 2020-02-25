package com.cn.xuetang.MyTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunableDemo {
    public  static  void main(String args[]){

      /*  MyThread my = new MyThread();
        new Thread(my,"A线程").start();
        new Thread(my,"B线程").start();*/


      /* MyThread my1 = new MyThread("线程A：");
        MyThread my2 = new MyThread("线程B：");
        new Thread(my1).start();
        new Thread(my2).start();*/

       ExecutorService fixedThreadPool= Executors.newFixedThreadPool(2);
        MyThread my3 = new MyThread("线程C：");
        MyThread my4 = new MyThread("线程D：");
        fixedThreadPool.execute(my3);
        fixedThreadPool.execute(my4);

    }
}
