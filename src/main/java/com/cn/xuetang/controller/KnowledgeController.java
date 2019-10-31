package com.cn.xuetang.controller;

import com.cn.xuetang.po.KnowledgeCustom;
import com.cn.xuetang.service.KnowledgeService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class KnowledgeController {

    //@Autowired
    @Resource
    private KnowledgeService knowledgeService;

    /**
     * 分页查询资料
     * @param pageNum
     * @return
     */
    @RequestMapping("/knowList")
    public List<KnowledgeCustom> knowList(int pageNum){
		/*
		 * 第一个参数：第几页;
		 * 第二个参数：每页获取的条数.
		 */
		//int p = 1;
        PageHelper.startPage(pageNum, 2);
        return knowledgeService.selectKnowledgeList();
    }


    /**
     * 查询全部资料
     * @return
     */

    @RequestMapping("/knowListall")
    public List<KnowledgeCustom> knowListall(){
        System.out.println(knowledgeService.selectKnowledgeList());
        for(int i=0;i<10;i++){
            System.out.println(i);

        }
        return knowledgeService.selectKnowledgeList();
    }
}
