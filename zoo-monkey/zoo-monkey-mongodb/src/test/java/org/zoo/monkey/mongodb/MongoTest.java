package org.zoo.monkey.mongodb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring/spring-dal-mongodb.xml"}) 
public class MongoTest {

	@Autowired 
	private MongoTemplate mt;
	
	/** 初始化 */
	public void init() {
	
		
		
	}

	@Test
	public void test() {
		System.console().printf("测试开始{}", "test()");
		//fail("Not yet implemented");
	}

}
