package com.changhong.data.training.sc.config.service.test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.changhong.data.training.sc.config.service.impl.ConfigServiceImpl;

/**
 * @author qiyao
 * @mail yao.qi@changhong.com
 * @date Oct 13, 2015
 * @since
 * @description 测试配置服务
 */
public class TestConfigService {

	private ConfigServiceImpl csi;
	/**
	 * @throws IOException 
	 * 
	 */
	@Before
	public void initTest() throws IOException {
		csi = new ConfigServiceImpl();
	}
	
	@Test
	public void testGet(){
		Assert.assertEquals("config.test.resources", csi.get("name"));
	}
}
