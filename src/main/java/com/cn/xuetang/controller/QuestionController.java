package com.cn.xuetang.controller;

import com.cn.xuetang.po.Quentions;
import com.cn.xuetang.service.QuestionService;
import com.cn.xuetang.util.MyPage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping("/insertQuestion")
    public int insertQuestion(Quentions quentions){
        quentions.setQ_id(UUID.randomUUID().toString().replaceAll("-", ""));
       return questionService.insertQuestion(quentions);
    }

    @RequestMapping("/selectOne")
    public Map<String, Object> selectOne(String q_id){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", questionService.selectOne(q_id));
        return map;
    }


    @RequestMapping("/selectAll")
    public Map<String, Object> selectAll(String q_id,String q_fl){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", questionService.selectAll(q_fl));
        return map;
    }


    /**
     * 分页查询资料
     * @param pageNum
     * @return
     */
    @RequestMapping("/pageQuestion")
    public Map<String, Object> pageQuestion(int pageNum,String q_fl){
		/*
		 * 第一个参数：第几页;
		 * 第二个参数：每页获取的条数.
		 */
        //int p = 1;
        int pageSize = 20;
        Page page = PageHelper.startPage(pageNum, pageSize);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", questionService.selectAll(q_fl));
        map.put("page", pageNum);
        int pageCount =  MyPage.getPageCount((int)page.getTotal(),pageSize);
        map.put("pageCount", pageCount);
       // System.out.println("总记录数量为" + page.getTotal());
        return map;
    }



    @RequestMapping("/delOne")
    public int delOne(String q_id){
        return questionService.delOne(q_id);
    }
}
