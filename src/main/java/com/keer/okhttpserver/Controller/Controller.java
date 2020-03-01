package com.keer.okhttpserver.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @BelongsProject: okhttpserver
 * @BelongsPackage: com.keer.okhttpserver.Controller
 * @Author: keer
 * @CreateTime: 2020-02-29 22:13
 * @Description: android使用OkHttp后台接口
 */
@RestController()
@RequestMapping("/android")
public class Controller {
    private Logger logger = LoggerFactory.getLogger(Controller.class);

    @RequestMapping(value = "/getTest/{info}", method = RequestMethod.GET)
    public String getMethod(@PathVariable String info) {
        logger.info("接收到Get请求，传来的信息：" + info);
        return "Get success";
    }

    @RequestMapping(value = "/postTest", method = RequestMethod.POST)
    public String postMethod(@RequestBody Map map) {
        logger.info("接收到POST请求，传来的信息：" + map.toString());
        return "Post success!!!";
    }
}
