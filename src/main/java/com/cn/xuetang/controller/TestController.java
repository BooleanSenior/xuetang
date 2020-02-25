package com.cn.xuetang.controller;

import com.cn.xuetang.po.TestPojo;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RequestMapping("restful/test")
@RestController
public class TestController {

    @RequestMapping("/test")
    public Map<String, Object> test(TestPojo testPojo, String jsonrpc, String method, String entity,String level,String ywxt) {
        System.out.println("进来了！");

        System.out.println(testPojo.getF2());
        System.out.println(testPojo.getLeader());
        System.out.println(testPojo.getId());
       System.out.println(level);
        System.out.println(ywxt);
        Map<String, Object> map = new HashMap<String, Object>();

        //接收请求参数





        map.put("status","success");
        map.put("res_data","11");
        return map;
    }



























/**
 * Controller之间跳转   RedirectAttributes  方法传参（SpringMVC自己的方法）
 */
/*    @RequestMapping(value="/jgdataToFwpt",method=RequestMethod.POST)
    public String  jgdataToFwpt(RedirectAttributes attr) {

        try {
            JSONObject reqJson = new JSONObject();
            reqJson.put("jsonrpc", "2.0");
            reqJson.put("method", "genLoginToken");
            //Map resStr = post("http://localhost/restful/test/test", apiENC,null);


            System.out.println("renxiuxing------------------>resStr:");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        calculateMsg("1");
        return null;

        // attr.addAttribute("param", "rxx");
        // return "redirect:/smrz/jd/test.action";
    }

    @RequestMapping(value="/test",method=RequestMethod.GET)
    public String  test() {
        System.out.println(request.getParameter("param"));
        jgdataToFwpt();
        calculateMsg("1");
        return null;
    }*/



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
