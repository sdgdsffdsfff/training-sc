package com.changhong.data.training.sc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author qiyao
 * @mail yao.qi@changhong.com
 * @date Aug 24, 2015
 * @since 0.0.1-SNAPSHOT
 * @description 登录控制器
 */
@Controller
@RequestMapping(value="/sign/in")
public class SignInController {

  @RequestMapping(method=RequestMethod.GET)
  public String signPage(){
    return "signIn";
  }
}
