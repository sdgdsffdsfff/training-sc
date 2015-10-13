package com.changhong.data.training.sc.config.service.impl;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * @author qiyao
 * @mail yao.qi@changhong.com
 * @date Oct 13, 2015
 * @since 0.0.1-SNAPSHOT
 * @description 获取配置服务
 */
public class ConfigServiceImpl {

  public ConfigServiceImpl(){
    ResourceBundle rb = ResourceBundle.getBundle("config.properties");
    Enumeration<String> keys = rb.getKeys();
  }
  /**
   * 返回指定KEY的配置文件值
   * @param key
   * @return
   */
  public static String get(String key){
    return key;
  }
}
