package com.cn.xuetang.service;

import com.cn.xuetang.mapper.KnowledgeMapper;
import com.cn.xuetang.po.KnowledgeCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional//添加事务.
public class KnowledgeService {
    @Autowired
    private KnowledgeMapper knowledgeMapper;

    public List<KnowledgeCustom> selectKnowledgeList(){
        return  knowledgeMapper.selectKnowledgeList();
    };
}
