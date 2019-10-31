package com.cn.xuetang.util;

public class MyPage {
    public static Integer getPageCount(int rowCount, int pageSize) {
        int pageCount=0;
        if (rowCount % pageSize == 0) {
            pageCount = rowCount / pageSize ;
        } else {
            pageCount = rowCount / pageSize+1;
        }
        return pageCount;
    }
}
