package com.changhong.data.training.sc.config.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author qiyao
 * @mail yao.qi@changhong.com
 * @date Oct 13, 2015
 * @since 0.0.1-SNAPSHOT
 * @description 获取配置服务
 */
public class ConfigServiceImpl {

	private static Logger logger = LoggerFactory.getLogger(ConfigServiceImpl.class);
	private Properties p = new Properties();
	
	/**
	 * 构造函数，负责初始化配置文件加载问题
	 * @throws IOException
	 */
	public ConfigServiceImpl() throws IOException {
		ClassPathResource r = new ClassPathResource("/config.properties");
		InputStream is = r.getInputStream();
//		InputStream is = this.getClass().getClassLoader().getResourceAsStream("config.properties");
		p.load(is);
		is.close();
		logger.debug("config service load properties success.");
	}

	/**
	 * 返回指定KEY的配置文件值
	 * 
	 * @param key
	 * @return
	 */
	public String get(String key) {
		return p.get(key).toString();
	}
}
