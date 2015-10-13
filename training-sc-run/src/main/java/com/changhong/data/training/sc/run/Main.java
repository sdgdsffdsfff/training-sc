package com.changhong.data.training.sc.run;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.changhong.data.training.sc.config.service.impl.ConfigServiceImpl;

/**
 * 
 * @author QiYao 程序入口方法
 */
public class Main {

	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws IOException {
		if (null != args) {
			for (String arg : args) {
				logger.info("run param: " + arg);
			}
		}

		ConfigServiceImpl csi = new ConfigServiceImpl();
		String name = csi.get("name");
		logger.info("load properties: " + name);
	}


}
