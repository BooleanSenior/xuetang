package com.cn.xuetang.service;

import com.cn.xuetang.mapper.CommentMapper;
import com.cn.xuetang.mapper.UserMapper;
import com.cn.xuetang.po.CommentCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private UserMapper userMapper;
    public int insertComment(CommentCustom commentCustom){
        return  commentMapper.insertComment(commentCustom);
    }

    public List<CommentCustom>  selectOneComment (String c_cover){
        List<CommentCustom> CommentCustomlist = commentMapper.selectOneComment(c_cover);
        for(CommentCustom co:CommentCustomlist){
            if (!StringUtils.isEmpty(co.getC_peo()) && co.getC_peo().equals("visitor")) {
                co.setU_xm("visitor");
            } else {
                co.setU_xm(userMapper.selectOneUser(co.getC_peo()).getU_xm());
                co.setU_photoPath(userMapper.selectOneUser(co.getC_peo()).getU_photoPath());
            }
        }
        return  CommentCustomlist;
    }

    public    int delOneComment(String c_id){
        return  commentMapper.delOneComment(c_id);
    }

    public int updateComment(CommentCustom commentCustom){
       // String num = c_fellgood + 1;
        return commentMapper.updateComment(commentCustom);
    }
}
