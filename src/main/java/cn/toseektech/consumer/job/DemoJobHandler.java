package cn.toseektech.consumer.job;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.youma.xxljob.config.core.BaseJobHandler;


@Component
public class DemoJobHandler extends BaseJobHandler{

	@Override
	protected String execute0() throws Throwable {
		TimeUnit.SECONDS.sleep(2);
		return "OK";
	}

}
