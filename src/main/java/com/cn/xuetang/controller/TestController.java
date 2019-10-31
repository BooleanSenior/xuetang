package com.cn.xuetang.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("restful/test")
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        System.out.println("进来了！");
        return "2";
    }


    /**
     *ruetful架构模式
     * get  查询
     * post  增加
     * put  更新
     * delete  删除
     *
     * 参考网址：https://blog.csdn.net/x541211190/article/details/81141459
     */




    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public String ren(@PathVariable("id") int id){
        System.out.println("进来了，查询！"+id);
        return "ren";
    }


    @RequestMapping(method = RequestMethod.DELETE)
    public String ren2(@RequestParam("id") int  pid){
        System.out.println("进来了，删除！"+pid);
        return "ren2";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String ren3(@RequestParam("id") int  id){
        System.out.println("进来了，添加！"+id);
        return "ren3";
    }
}
