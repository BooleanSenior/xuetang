package com.cn.xuetang.controller;

import com.cn.xuetang.po.UserCustom;
import com.cn.xuetang.service.UserService;
import com.cn.xuetang.util.Constants;
import com.cn.xuetang.util.UpPhoto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/insertUser")
    public int insertUser(UserCustom userCustom){
      //  userCustom.getU_id(UUID.randomUUID().toString().replaceAll("-", ""));
        return userService.insertUser(userCustom);
    }

    @RequestMapping("/loginUser")
    public Map<String, Object> loginUser(String u_yhm,String u_paw){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userInfo",userService.loginUser(u_yhm,u_paw));
        return map;
    }



    /*
		 * 个人相册的添加
		 *
		 */
    @RequestMapping("/addPhotos")
    public Map<String, Object> addPhotos(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        String uid = request.getParameter("uid");//用户id
        String photo = request.getParameter("photo");//相册原图文件
        String photoTh = request.getParameter("photoTh");//相册缩略图文件

        //tomcat 路径
        String tomcatPath=System.getProperty("catalina.home");
       // String tomcatPath="C:\\test";
        //域名
        String host=request.getServerName();
        //上传的图片路径
        File dir=new File(tomcatPath+"/webapps/"+ Constants.photo + "/"+ uid);
        if(!dir.exists()) {//判断文件夹是否存在
            dir.mkdir();
        }
        String suffix = ".jpg";  //后缀
        String newFileName1=System.currentTimeMillis()
                +(int)(Math.random()*100)+suffix;//文件名
        String newFileName2=System.currentTimeMillis()
                +(int)(Math.random()*100)+suffix;//文件名

        //存放图片的路径
        String imgFilePath1 = tomcatPath+"/webapps/"+Constants.photo+ "/"+ uid +"/"+newFileName1;
        String imgFilePath2 = tomcatPath+"/webapps/"+Constants.photo+ "/"+ uid +"/"+newFileName2;

        //解析base64编码
        Boolean rs1= UpPhoto.GenerateImage(photo,imgFilePath1);
        Boolean rs2=UpPhoto.GenerateImage(photoTh,imgFilePath2);
        //展示路径
        String photoPath=null;
        String photoThumbnail=null;
        if(rs1) {
            photoPath=host+"/"+Constants.photo+ "/"+ uid +"/"+newFileName1;
        }
        if(rs2) {
            photoThumbnail=host+"/"+Constants.photo+ "/"+ uid +"/"+newFileName2;
        }


        System.out.println(photoPath);
        System.out.println(photoThumbnail);
        UserCustom userCustom = new UserCustom();
        userCustom.setU_id(uid);
        userCustom.setU_photoPath(photoThumbnail);
        map.put("status",userService.updateUser(userCustom));
        map.put("path",photoThumbnail);
        return map;
    }
}
