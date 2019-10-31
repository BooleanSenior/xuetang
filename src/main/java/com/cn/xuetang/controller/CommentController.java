package com.cn.xuetang.controller;

import com.cn.xuetang.po.CommentCustom;
import com.cn.xuetang.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class CommentController {

    @Autowired
   private CommentService commentService;


    @RequestMapping("/insertComment")
    public int insertComment(CommentCustom commentCustom){
        commentCustom.setC_id(UUID.randomUUID().toString().replaceAll("-", ""));
        return  commentService.insertComment(commentCustom);
    }

    @RequestMapping("/selectComment")
    public Map<String, Object> selectOneComment (String c_cover){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", commentService.selectOneComment(c_cover));
        return map;
    }

    @RequestMapping("/delOneComment")
    public    int delOneComment(String c_id){
        return  commentService.delOneComment(c_id);
    }

    @RequestMapping("/fellgoodComment")
    public int updateComment(CommentCustom commentCustom){
        return commentService.updateComment( commentCustom);
    }
}
