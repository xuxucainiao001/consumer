package cn.toseektech.consumer.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
public class FirstJunitTest {
	
	/**
	 * 伪造一个有返回值的方法
	 * @Title: doTest1   
	 * @Description:    
	 * @Date: 2021年5月20日 下午4:35:15     
	 * @throws
	 */
	
	@Test
	public void doTest1() {
		
		// 伪造一个 ArrayList 对象
		ArrayList<?> list = Mockito.mock(ArrayList.class);
		// 设定：当伪造的 list 调用 size() 方法时，一定返回100
		Mockito.when(list.size()).thenReturn(100);
		// 执行list.size()是否真的等于 100
		Assert.assertEquals(list.size(), 100);
		
	}
	
	
}
