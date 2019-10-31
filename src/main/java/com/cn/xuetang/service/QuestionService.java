package com.cn.xuetang.service;

import com.cn.xuetang.mapper.QuestionMapper;
import com.cn.xuetang.mapper.UserMapper;
import com.cn.xuetang.po.Quentions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;


@Service
@Transactional//添加事务.
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private UserMapper userMapper;

    public int insertQuestion(Quentions quentions) {
        return questionMapper.insertQuestion(quentions);
    }

    public Quentions selectOne(String q_id) {
        Quentions quentions = new Quentions();
        quentions = questionMapper.selectOne(q_id);
        if (!StringUtils.isEmpty(quentions.getU_id()) && quentions.getU_id().equals("visitor")) {
            quentions.setU_xm("游客");
        } else {
            quentions.setU_xm(userMapper.selectOneUser(quentions.getU_id()).getU_xm());
            quentions.setU_photoPath(userMapper.selectOneUser(quentions.getU_id()).getU_photoPath());
        }
        return quentions;
    }

    public List<Quentions> selectAll(String q_fl) {
        List<Quentions> questions = questionMapper.selectAll(q_fl);
        for (Quentions qu : questions) {
            if (!StringUtils.isEmpty(qu.getU_id()) && qu.getU_id().equals("visitor")) {
                qu.setU_xm("visitor");
            } else {
                qu.setU_xm(userMapper.selectOneUser(qu.getU_id()).getU_xm());
                qu.setU_photoPath(userMapper.selectOneUser(qu.getU_id()).getU_photoPath());
            }
        }
        return questions;
    }

    public int delOne(String q_id) {
        return questionMapper.delOne(q_id);
    }
}
