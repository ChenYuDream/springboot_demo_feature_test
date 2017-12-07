package org.jypj.dev.controller;

import org.jypj.dev.entity.User;
import org.jypj.dev.service.GitHubLookupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author yu_chen
 * @create 2017-12-07 18:07
 **/
@Controller
@RequestMapping
public class HelloController {

    @Resource
    private GitHubLookupService gitHubLookupService;

    @GetMapping("/")
    @ResponseBody
    public String helloWorld() throws InterruptedException, ExecutionException {
        Future<User> user = gitHubLookupService.findUser("PivotalSoftware");

        return user.get().toString();
    }

    @GetMapping("test")
    @ResponseBody
    public String t() {
        return "helloWorld";
    }
}
